package com.niit.fxstudy.bootstrap;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.net.URL;

public class BootStrapApp extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
//        URL location = getClass().getResource("/fxml/bootstrap3overview.fxml");
        URL location = getClass().getResource("/fxml/css_demo.fxml");
        FXMLLoader fxmlLoader = new FXMLLoader(location);
        Parent root = fxmlLoader.load();
        Scene scene = new Scene(root);
//        scene.getStylesheets().add("/css/bootstrap3.css");
        scene.getStylesheets().add("/css/demo.css");
        primaryStage.setTitle("bootstrap3效果预览");
        //窗口最大化
        primaryStage.setMaximized(true);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
