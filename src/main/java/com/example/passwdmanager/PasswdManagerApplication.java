package com.example.passwdmanager;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.util.Objects;

public class PasswdManagerApplication extends Application {
    @Override
    public void start(Stage primaryStage) {

        Image icon = new Image(Objects.requireNonNull(getClass().getResourceAsStream("/icon.png")));
        primaryStage.getIcons().setAll(icon);

        // Create a label with the text
        Label welcomeLabel = new Label("Welcome at Passwd Manager");
        // Use the "header" class from CSS for this label
        welcomeLabel.getStyleClass().add("header");

        // same as before
        Label smallLabel = new Label("by xcel_dev");
        smallLabel.getStyleClass().add("subheader");

        // Use a VBox layout to place the labels vertically
        VBox root = new VBox(1); // The number 10 is the spacing between the labels
        root.getChildren().addAll(welcomeLabel, smallLabel);

        // Set the alignment to center
        root.setAlignment(javafx.geometry.Pos.CENTER);

        // Create a scene with the given layout
        Scene scene = new Scene(root, 400, 650);

        // Add the CSS stylesheet
        scene.getStylesheets().add(getClass().getResource("/com/example/passwdmanager/styles.css").toExternalForm());

        // Set the title and show the window
        primaryStage.setTitle("Password Manager");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
