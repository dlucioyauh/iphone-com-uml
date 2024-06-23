package com.dlucioYauh.iphone;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws IOException {
        // Carregue o arquivo FXML
        URL fxmlLocation = getClass().getResource("/com/dlucioYauh/iphone/iphone.fxml");
        if (fxmlLocation == null) {
            throw new IOException("Cannot locate FXML file");
        }
        Parent root = FXMLLoader.load(fxmlLocation);

        primaryStage.setTitle("iPhone Simulator");
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
