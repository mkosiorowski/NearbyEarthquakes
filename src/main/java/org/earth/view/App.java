package org.earth.view;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * JavaFX App
 */

public class App extends Application {

    private static Scene scene;

    @Override
    public void start(Stage stage) throws IOException {

      FXMLLoader loader = new FXMLLoader(getClass().getResource("primary.fxml"));
      Parent root = loader.load();
      scene = new Scene(root);
      stage.setScene(scene);
      stage.setTitle("Nearby Earthquakes");
      stage.show();
    }
    public static void main(String[] args) {
        launch();
    }
}