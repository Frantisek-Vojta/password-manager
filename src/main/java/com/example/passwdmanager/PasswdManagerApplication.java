package com.example.passwdmanager;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.util.Objects;

public class PasswdManagerApplication extends Application {
    @Override
    public void start(Stage primaryStage) {


        // welcome text
        Label welcomeLabel = new Label("Welcome to the app");
        welcomeLabel.setFont(new Font(36));
        welcomeLabel.setTextFill(Color.web("#6A1B9A")); // Fialová barva

        // show me
        Label smallLabel = new Label("by xcel_dev");
        smallLabel.setFont(new Font(14));
        smallLabel.setTextFill(Color.web("#6A1B9A")); // Fialová barva

        // loading bar
        ProgressBar progressBar = new ProgressBar(0);
        progressBar.setStyle("-fx-accent: #6A1B9A;");
        progressBar.setPrefWidth(300);

        // color
        VBox layout = new VBox(10);
        layout.setStyle("-fx-background-color: #1A1A1A; -fx-alignment: center;");
        layout.getChildren().addAll(welcomeLabel, smallLabel, progressBar);

        // bg color
        Scene scene = new Scene(layout, 400, 650);
        scene.setFill(Color.BLACK);

        // timeline
        Timeline timeline = new Timeline(
                new KeyFrame(Duration.seconds(0), e -> progressBar.setProgress(0)),
                new KeyFrame(Duration.seconds(5), e -> progressBar.setProgress(1))
        );
        timeline.setCycleCount(1); // only once start
        timeline.play(); // start the loading

        // after 5s it will show the main screen
        timeline.setOnFinished(event -> {
            // buttons
            Button addButton = new Button("Přidat heslo");
            addButton.setStyle("-fx-background-color: #6A1B9A; -fx-text-fill: white;");
            Button showButton = new Button("Zobrazit heslo");
            showButton.setStyle("-fx-background-color: #6A1B9A; -fx-text-fill: white;");

            // buttons vedle sebe
            HBox buttonsBox = new HBox(10);
            buttonsBox.setStyle("-fx-alignment: center;");
            buttonsBox.getChildren().addAll(addButton, showButton);

            // effect
            layout.getChildren().clear(); // clear the text
            layout.getChildren().addAll(buttonsBox); // buttons add

            // animation
            layout.setOpacity(0); // oppacity 0
            layout.setStyle("-fx-background-color: #1A1A1A;"); // purple

            // animation
            javafx.animation.FadeTransition fadeIn = new javafx.animation.FadeTransition(Duration.seconds(1), layout);
            fadeIn.setFromValue(0);
            fadeIn.setToValue(1);
            fadeIn.play();
        });

        // show window
        primaryStage.setTitle("Password Manager");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
