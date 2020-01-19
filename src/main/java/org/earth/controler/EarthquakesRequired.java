package org.earth.controler;

import org.earth.model.EarthquakesData;
import org.earth.model.Feature;
import org.earth.validation.TextFieldNumber;

import java.util.*;

/**
 * Manipulate data from JSO
 */

public class EarthquakesRequired extends RestClient{

    TextFieldNumber textFieldNumber = new TextFieldNumber();

    private static EarthquakesData earthquake;
    private Map mapCoordinates = new LinkedHashMap();
    private Map titleList = new LinkedHashMap();
    private Map mapResult = new TreeMap();
    private Map mapResultLimit = new TreeMap();
    private List distanceList = new LinkedList();
    private static Double latitudeDouble;
    private static Double longitudeDouble;
    private static int counter = 0;
    private String result;

    void searchEarthquakes(){
        earthquake = getEarthquakesData();
        this.latitudeDouble = Double.parseDouble(textFieldNumber.getLatitude());
        this.longitudeDouble = Double.parseDouble(textFieldNumber.getLongitude());
        mapCoordinates.clear();
        mapResult.clear();
        titleList.clear();
        mapResultLimit.clear();
        distanceList.clear();
        for (Feature feature: earthquake.getFeatures()){
            mapCoordinates.put(feature.geometry.coordinates.get(1) , feature.geometry.coordinates.get(0));
            titleList.put(feature.geometry.coordinates.get(1), feature.properties.title);
        }
    }
    void distanceCalc() {
        searchEarthquakes();
        final int R = 6371; // Radius of the earth
            Set<Map.Entry<Double,Double>> entrySet = mapCoordinates.entrySet();
            for(Map.Entry<Double, Double> entry: entrySet) {
                double latDistance = Math.toRadians(entry.getKey() - latitudeDouble);
                double lonDistance = Math.toRadians(entry.getValue() - longitudeDouble);
                double a = Math.sin(latDistance / 2) * Math.sin(latDistance / 2)
                        + Math.cos(Math.toRadians(latitudeDouble)) * Math.cos(Math.toRadians(entry.getKey()))
                        * Math.sin(lonDistance / 2) * Math.sin(lonDistance / 2);
                double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1 - a));
                int distance = (int) Math.round(R * c);
                distanceList.add(distance);
            }
    }
    String resultEarthquakes(){
        distanceCalc();
        Set<Map.Entry<Integer,String>> entrySet2 = titleList.entrySet();
        for(Map.Entry<Integer, String> entry2: entrySet2) { mapResult.put(distanceList.get(counter), entry2.getValue());
            counter++;
        }
        counter = 0;
        Set<Map.Entry<Integer,String>> entrySet3 = mapResult.entrySet();
        for(Map.Entry<Integer, String> entry3: entrySet3){ mapResultLimit.put(entry3.getKey(), entry3.getValue());
            if(mapResultLimit.size() == 10) break;
        }
        result = "";
        Set<Map.Entry<Integer,String>> entrySet4 = mapResultLimit.entrySet();
        for(Map.Entry<Integer, String> entry4: entrySet4){ result += entry4.getValue() + "  | |  " + entry4.getKey() + "\n";
        }
        return result;
    }
}
