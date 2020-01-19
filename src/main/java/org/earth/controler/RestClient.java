package org.earth.controler;

import com.google.gson.Gson;
import org.earth.model.EarthquakesData;

import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

/**
 * Connect to JSON
 */

public class RestClient {

    private static EarthquakesData earthquakesData;

    public static EarthquakesData getEarthquakesData() {
        return earthquakesData;
    }
    public static void makeConnection() {

        try {
            URL url = new URL(WebAddressController.urlEditPath());
            InputStreamReader reader = new InputStreamReader(url.openStream());
            earthquakesData = new Gson().fromJson(reader, EarthquakesData.class);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
