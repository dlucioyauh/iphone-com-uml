package com.dlucioYauh.iphone.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;

public class iPhoneController {

    @FXML
    private Button playButton;

    @FXML
    private Button callButton;

    @FXML
    private Button browseButton;

    @FXML
    private void playMusic() {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Reproduzindo Música");
        alert.setHeaderText(null);
        alert.setContentText("Tocando música...");
        alert.showAndWait();
    }

    @FXML
    private void makeCall() {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Fazendo Ligação");
        alert.setHeaderText(null);
        alert.setContentText("Ligando para: 123456789");
        alert.showAndWait();
    }

    @FXML
    private void browseInternet() {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Navegando na Internet");
        alert.setHeaderText(null);
        alert.setContentText("Exibindo página: http://www.exemplo.com");
        alert.showAndWait();
    }
}
