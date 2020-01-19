package org.earth.controler;

import javafx.scene.control.TextArea;
import org.earth.model.EarthquakesData;
import org.earth.validation.TextFieldNumber;

/**
 * Edit URL to connect with JSON
 */

public class WebAddressController extends EarthquakesRequired{

    static TextFieldNumber textFieldNumber = new TextFieldNumber();

    private static String textAreaResultString;

    private static String latitude;
    private static String longitude;
    private static String urlPath;

     static String urlEditPath(){
         latitude = textFieldNumber.getLatitude();
         longitude = textFieldNumber.getLongitude();
         urlPath = "https://earthquake.usgs.gov/fdsnws/event/1/query?format=geojson&latitude=" + latitude + "&longitude=" + longitude + "&maxradiuskm=4000";
         return urlPath;
    }
    public void takeRestClientData(TextArea textAreaResult, String textAreaResultString) {
        RestClient.makeConnection();
        textAreaResult.setText(textFieldNumber.getTextAreaResultString() + resultEarthquakes());
    }
}
