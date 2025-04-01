package com.example.passwdmanager;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class PasswdManagerApplication extends Application {
    @Override
    public void start(Stage primaryStage) {
        // Create a label with the text "Welcome to the app"
        Label welcomeLabel = new Label("Welcome to the app");
        // Use the "label" class from CSS for this label
        welcomeLabel.getStyleClass().add("label");

        // Create a small label with the text "by xcel_dev"
        Label smallLabel = new Label("by xcel_dev");
        // Use the "small-label" class from CSS for this label
        smallLabel.getStyleClass().add("small-label");

        // Use a StackPane layout to place the labels
        StackPane root = new StackPane();
        root.getChildren().addAll(welcomeLabel, smallLabel);

        // Set the margin for the small label under the main text
        StackPane.setMargin(smallLabel, new javafx.geometry.Insets(20, 0, 0, 0));

        // Create a scene with the given layout
        Scene scene = new Scene(root, 400, 650);

        // Add the CSS stylesheet
        scene.getStylesheets().add(getClass().getResource("styles.css").toExternalForm());

        // Set the title and show the window
        primaryStage.setTitle("Password Manager");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
