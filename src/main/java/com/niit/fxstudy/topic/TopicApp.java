package com.niit.fxstudy.topic;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.net.URL;

public class TopicApp extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        URL location = getClass().getResource("/fxml/topic.fxml");
        FXMLLoader fxmlLoader = new FXMLLoader(location);
        Parent root = fxmlLoader.load();
        Scene scene = new Scene(root, 780, 590);
        scene.getStylesheets().add("org/kordamp/bootstrapfx/bootstrapfx.css");
        primaryStage.setTitle("专题展示");
        primaryStage.getIcons().add(new Image("/img/logo.png"));
        primaryStage.setScene(scene);
        primaryStage.setResizable(false);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
