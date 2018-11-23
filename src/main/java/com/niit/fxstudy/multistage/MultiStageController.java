package com.niit.fxstudy.multistage;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class MultiStageController {
    private Stage primaryStage;

    @FXML
    private Button closeBtn;

    /**
     * 接收从Main程序传的Stage参数
     * @param primaryStage
     */
    public void setPrimaryStage(Stage primaryStage){
        this.primaryStage = primaryStage;
    }

    /**
     * 关闭舞台对象（主舞台）
     */
    public void closeStage(){
        //第一种方法，调用Main传递过来的主舞台对象的关闭方法
//        this.primaryStage.close();
        //第二种方法，通过当前关闭按钮获取场景，进而获取窗口，然后调用关闭方法
        Stage stage = (Stage) closeBtn.getScene().getWindow();
        stage.close();
    }

    /**
     * 跳转到第二个舞台
     * @throws IOException
     */
    public void gotoSecondStage() throws IOException {
       Stage secondStage = new Stage();
        Parent root =  new FXMLLoader(getClass().getResource("/fxml/second_stage.fxml")).load();
        Scene scene = new Scene(root);
        secondStage.setTitle("第二个窗口");
        secondStage.setScene(scene);
        //显示第二个舞台
        secondStage.show();
        //关闭主舞台
        this.primaryStage.close();
    }

}
