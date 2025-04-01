package com.example.passwdmanager;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class PasswdManagerController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
}