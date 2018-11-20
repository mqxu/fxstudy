package com.niit.fxstudy.jianshu;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.net.URL;
import java.util.ResourceBundle;

public class JianShuController  implements Initializable {
    @FXML
    private ImageView logoImg,userImg;
    @FXML
    private TextField searchField;
    @FXML
    private Button writeBtn;
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        //简书logo图大小
        logoImg.setFitWidth(100);
        logoImg.setFitHeight(55);
        //用户头像大小
        userImg.setFitWidth(40);
        userImg.setFitHeight(40);
        //搜索框设置无焦点
        searchField.setFocusTraversable(false);
        //写文章按钮设置图标
        Image btnImg = new Image("/jianshu/pen.png");
        ImageView imageView = new ImageView(btnImg);
        writeBtn.setGraphic(imageView);
    }
}
