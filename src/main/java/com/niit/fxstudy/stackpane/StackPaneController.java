package com.niit.fxstudy.stackpane;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;

import java.net.URL;
import java.util.ResourceBundle;

public class StackPaneController implements Initializable {
    @FXML
    private Button primaryBtn,successBtn,warningBtn;
    @FXML
    private AnchorPane primaryPane;
    @FXML
    private AnchorPane successPane;
    @FXML
    private AnchorPane warningPane;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        Image image1 = new Image("/icon/1.png");
        ImageView imageView1 = new ImageView(image1);
        imageView1.setFitWidth(26);
        imageView1.setFitHeight(26);
        primaryBtn.setGraphic(imageView1);

        Image image2 = new Image("/icon/2.png");
        ImageView imageView2 = new ImageView(image2);
        imageView2.setFitWidth(26);
        imageView2.setFitHeight(26);
        successBtn.setGraphic(imageView2);

        Image image3 = new Image("/icon/3.png");
        ImageView imageView3 = new ImageView(image3);
        imageView3.setFitWidth(26);
        imageView3.setFitHeight(26);
        warningBtn.setGraphic(imageView3);
    }

    public void showPrimaryPane() {
        primaryPane.setVisible(true);
        successPane.setVisible(false);
        warningPane.setVisible(false);
    }

    public void showSuccessPane() {
        successPane.setVisible(true);
        primaryPane.setVisible(false);
        warningPane.setVisible(false);
    }

    public void showWarningPane() {
        warningPane.setVisible(true);
        primaryPane.setVisible(false);
        successPane.setVisible(false);
    }


}
