package com.niit.fxstudy.multistage;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * 启动程序
 */
public class MultiStageApp extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("主窗口");
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/fxml/first_stage.fxml"));
        Parent root =  fxmlLoader.load();
        //从fxml文件获取控制器的实例对象
        MultiStageController controller = fxmlLoader.getController();
        //将当前主舞台传递给控制器对象
        controller.setPrimaryStage(primaryStage);
        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
