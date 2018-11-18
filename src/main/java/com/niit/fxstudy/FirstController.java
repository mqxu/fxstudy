package com.niit.fxstudy;

import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;
import javafx.stage.Stage;

public class FirstController {

    @FXML
    private BorderPane borderPane;
    @FXML
    private AnchorPane anchorPane;

    public void jump(){
        Stage stage = new Stage();
        final WebView browser = new WebView();
        final WebEngine webEngine = browser.getEngine();
        webEngine.load("https://www.jianshu.com/");
        Scene scene = new Scene(browser);
        stage.setScene(scene);
        stage.setWidth(1000);
        stage.setHeight(600);
        stage.show();
    }

    public void subPage(){
        borderPane.setVisible(false);
        anchorPane.setVisible(true);
    }

    public void back(){
        borderPane.setVisible(true);
        anchorPane.setVisible(false);
    }
}
