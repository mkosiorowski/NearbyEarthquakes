package org.earth.view;

import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import org.earth.controler.WebAddressController;
import org.earth.validation.TextFieldNumber;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * View FXML controller
 */

public class PrimaryController{

    WebAddressController webAddressController = new WebAddressController();
    TextFieldNumber textFieldNumber = new TextFieldNumber();

    @FXML
    private TextArea textAreaResult;
    @FXML
    private TextField textFieldLatitude;
    @FXML
    private TextField textFieldLongitude;

   private static String textAreaResultString;

   public String dataMatcher(TextField textField, Pattern pattern) {
       String matchResult ="";
       Matcher m = pattern.matcher(textField.getText());
       if (m.find()) { matchResult = "Correct"; }
           return matchResult;
   }
    @FXML
    private void buttonClick() {
        textFieldNumber.validateLatitudeText(textFieldLatitude, textAreaResult, textAreaResultString);
        textFieldNumber.validateLongitudeText(textFieldLongitude, textAreaResult, textAreaResultString);
        if(dataMatcher(textFieldLatitude, textFieldNumber.getPatternLatitude()).equals("Correct") && dataMatcher(textFieldLongitude, textFieldNumber.getPatternLongitude()).equals("Correct")){
            webAddressController.takeRestClientData(textAreaResult, textAreaResultString);
        }
    }
    @FXML
    private void enterData(){
        textFieldNumber.validateLatitudeText(textFieldLatitude, textAreaResult, textAreaResultString);
        textFieldNumber.validateLongitudeText(textFieldLongitude, textAreaResult, textAreaResultString);
        if(dataMatcher(textFieldLatitude, textFieldNumber.getPatternLatitude()).equals("Correct") && dataMatcher(textFieldLongitude, textFieldNumber.getPatternLongitude()).equals("Correct")){
            webAddressController.takeRestClientData(textAreaResult, textAreaResultString);
        }
    }
}
