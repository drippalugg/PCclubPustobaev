package com.example.pcpustobaev;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;

public class Main extends Application {
    @Override
    public void start(Stage stage) {
        Label label = new Label("Добро пожаловать в Компьютерный клуб!");
        StackPane root = new StackPane(label);
        Scene scene = new Scene(root, 400, 300);

        stage.setTitle("Компьютерный клуб");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}