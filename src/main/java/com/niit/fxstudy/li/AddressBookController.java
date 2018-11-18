package com.niit.fxstudy.li;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;

import java.net.URL;
import java.util.ResourceBundle;

public class AddressBookController implements Initializable {
    @FXML
    private ComboBox<String> genderComboBox;

    @FXML
    private ListView<HBox> addressBookListView;

    @FXML
    private TextField keywordsField;

    private AddressBook[] addressBooks = new AddressBook[]{
            new AddressBook("1802343305", "高金通", "男", "江苏连云港", "1", "15556224828", "1.jpg"),
            new AddressBook("1802343312", "林斌涛", "男", "浙江温州", "2", "18851853611", "2.jpg"),
            new AddressBook("1802343310", "李启鹏", "男", "江苏连云港", "3", "17384592163", "3.jpg"),
            new AddressBook("1802343323", "夏提", "男", "新疆伊犁", "4", "19825088721", "4.jpg"),
            new AddressBook("1802343325", "张俊瑞", "男", "江苏徐州", "5", "15961101404", "5.jpg"),
            new AddressBook("1802343326", "张攀华", "男", "江苏宿迁", "6", "18805162578", "6.jpg"),

    };

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        genderComboBox.getItems().setAll("1", "2", "3", "4", "5", "6");
        for (AddressBook s : addressBooks) {
            HBox hBox = new HBox();
            Image image = new Image("/li/" + s.getPicture());
            ImageView imageView = new ImageView(image);
            imageView.setFitHeight(80);
            imageView.setFitWidth(80);
            hBox.getChildren().add(imageView);
            Label labelName = new Label("\t姓名：" + s.getName());
            hBox.getChildren().add(labelName);
            Label labelGender = new Label("性别：" + s.getGender());
            String hiddenPhone =
                    s.getPhoneNumber().replaceAll("(\\d{3})\\d{4}(\\d{4})",
                            "$1****$2");
            Label labelNumber = new Label("手机号：" + hiddenPhone);
            Label labelDormitory = new Label("床位号：" + s.getBedNumber());
            Label labelStudentId = new Label("学号：" + s.getStudentID());
            Label labelAddress = new Label("家庭住址" + s.getHomeTown());
            hBox.getChildren().addAll(labelGender, labelNumber, labelDormitory, labelStudentId, labelAddress);
            addressBookListView.getItems().add(hBox);
        }
//        genderComboBox.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<String>() {
//            @Override
//            public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
//                searchSex(newValue);
//            }
//        });

    }

//    private void searchSex(String keywords) {
//        ObservableList<HBox> list = addressBookListView.getItems();
//        addressBookListView.getItems().removeAll(list);
//        for (AddressBook s : addressBooks) {
//            HBox hBox1 = new HBox();
////            Image image = new Image("/li/" + s.getPicture());
////            ImageView imageView = new ImageView(image);
////            imageView.setFitHeight(80);
////            imageView.setFitWidth(80);
////            hBox1.getChildren().add(imageView);
//            Label labelName = new Label("\t姓名：" + s.getName());
//            hBox1.getChildren().add(labelName);
//            Label labelGender = new Label("\t性别：" + s.getGender());
//            String hiddenPhone =
//                    s.getPhoneNumber().replaceAll("(\\d{3})\\d{4}(\\d{4})",
//                            "$1****$2");
//            Label labelNumber = new Label("\t手机号：" + hiddenPhone);
//            Label labelBedNumber = new Label("\t床位号：" + s.getBedNumber());
//            Label labelStudentId = new Label("\t学号：" + s.getStudentID());
//            Label labelAddress = new Label("\t家庭住址" + s.getHomeTown());
////            hBox1.getChildren().addAll(labelGender, hiddenPhone, labelNumber, labelBedNumber, labelStudentId, labelAddress);
//            if (s.getGender().contains(keywords)||s.getBedNumber().contains(keywords)) {
//                addressBookListView.getItems().add(hBox1);
//            }
//        }
//    }
//
//    public void enter() {
//        keywordsField.setText("");
//    }
//
//    public void searchByKeywords() {
//        ObservableList<HBox> list = addressBookListView.getItems();
//        addressBookListView.getItems().removeAll(list);
//        String keywords = keywordsField.getText().trim();
//        for (AddressBook addressBook : addressBooks) {
//            HBox hBox2 = new HBox();
////            Image image1 = new Image("/li/" + addressBook.getPicture());
////            ImageView imageView1 = new ImageView(image1);
////            imageView1.setFitHeight(80);
////            imageView1.setFitWidth(80);
////            hBox2.getChildren().add(imageView1);
//            Label labelName1 = new Label("姓名：" + addressBook.getName());
//            hBox2.getChildren().add(labelName1);
//            Label labelGender1 = new Label("\t性别：" + addressBook.getGender());
//            hBox2.getChildren().add(labelGender1);
//            String hiddenPhone1 =
//                    addressBook.getPhoneNumber().replaceAll("(\\d{3})\\d{4}(\\d{4})",
//                            "$1****$2");
//            Label labelNumber1 = new Label("\t手机号：" + hiddenPhone1);
//            hBox2.getChildren().add(labelNumber1);
//            Label labelDormitory1 = new Label("\t床位号：" + addressBook.getBedNumber());
//            hBox2.getChildren().add(labelDormitory1);
//            Label labelStudentId1 = new Label("\t学号：" + addressBook.getStudentID());
//            hBox2.getChildren().add(labelStudentId1);
//            Label labelAddress1 = new Label("\t家庭住址" + addressBook.getHomeTown());
//            hBox2.getChildren().add(labelAddress1);
//            if (addressBook.getHomeTown().contains(keywords)) {
//                addressBookListView.getItems().add(hBox2);
//            }
//            if (addressBook.getName().contains(keywords)) {
//                addressBookListView.getItems().add(hBox2);
//            }
//        }
//    }
}


