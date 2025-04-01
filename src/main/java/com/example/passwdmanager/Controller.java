package com.example.passwdmanager;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class Controller {

    public Button saveButton;
    @FXML
    private TextField usernameField;

    @FXML
    private TextField passwordField;

    // Tento handler by měl být propojen s tlačítkem v FXML
    @FXML
    private void handleSave() {
        String username = usernameField.getText();
        String password = passwordField.getText();

        // Sem přidej logiku pro ukládání uživatelských dat
        System.out.println("Uživatelské jméno: " + username);
        System.out.println("Heslo: " + password);
    }
}
