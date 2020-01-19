package org.earth.validation;

import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Validate inputs
 */

public class TextFieldNumber extends TextField {

    private static String textAreaResultString;
    private static String latitude;
    private static String longitude;
    private static Pattern patternLatitude;
    private static Pattern patternLongitude;

    public String getTextAreaResultString(){ return textAreaResultString; }
    public String getLatitude(){
        return latitude;
    }
    public String getLongitude(){
        return longitude;
    }
    public Pattern getPatternLatitude(){return patternLatitude;}
    public Pattern getPatternLongitude(){return patternLongitude;}

    @Override
    public void replaceText(int i, int il, String string){
        if(string.matches("[0-9]") || string.matches("\\.") || string.matches("-") || string.isEmpty()){
            super.replaceText(i, il, string);
        }
    }
    public void validateLatitudeText(TextField textFieldLatitude, TextArea textAreaResult, String textAreaResultString) {
        this.latitude = textFieldLatitude.getText();
        this.patternLatitude = Pattern.compile("^-?[0-9]{1,2}\\.[0-9]{0,6}$");
        Matcher m = patternLatitude.matcher(this.latitude);
        outerLoop: if (!this.latitude.isEmpty() && m.find()){
            Float latitudeFloat = Float.parseFloat(this.latitude);
            if (latitudeFloat > 90.000000 || latitudeFloat < -90.000000) {
                textAreaResult.setText("Please enter the correct latitude from 90.000000 to -90.000000 (max 6 digits after the decimal dot).");
                this.textAreaResultString = textAreaResult.getText() + "\n"; break outerLoop;
            }
            else textAreaResult.setText("");
            this.textAreaResultString = textAreaResult.getText();
            break outerLoop;
        }
        else {
            textAreaResult.setText("Please enter the correct latitude from 90.000000 to -90.000000 (max 6 digits after the decimal dot).");
           this.textAreaResultString = textAreaResult.getText() + "\n";
        }
    }
    public void validateLongitudeText(TextField textFieldLongitude, TextArea textAreaResult, String textAreaResultString) {
        this.longitude = textFieldLongitude.getText();
        this.patternLongitude = Pattern.compile("^-?[0-9]{1,3}\\.[0-9]{0,6}$");
        Matcher m = patternLongitude.matcher(this.longitude);
        outerLoop: if (!this.longitude.isEmpty() && m.find()){
            Float longitudeFloat = Float.parseFloat(this.longitude);
            if (longitudeFloat > 180.000000 || longitudeFloat < -180.000000) {
                this.textAreaResultString += "Please enter the correct longitude from 180.000000 to -180.000000 (max 6 digits after the decimal dot)." + "\n";
                textAreaResult.setText(this.textAreaResultString); break outerLoop;
            }
            else break outerLoop;
        }
        else {
            this.textAreaResultString += "Please enter the correct longitude from 180.000000 to -180.000000 (max 6 digits after the decimal dot)." + "\n";
            textAreaResult.setText(this.textAreaResultString);
        }
    }
}


