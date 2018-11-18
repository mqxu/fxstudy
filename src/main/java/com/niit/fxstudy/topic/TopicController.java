package com.niit.fxstudy.topic;

import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.FlowPane;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

public class TopicController implements Initializable {
    //注入布局文件中的组件
    @FXML
    private FlowPane container;
    @FXML
    private TextField inputField;

    //定义并初始化数据
    private Topic[] topics = new Topic[]{
            new Topic("故事", "1.png", "真实或虚幻的故事", 111, 123),
            new Topic("摄影", "2.png", "用镜头记录精彩瞬间", 222, 234),
            new Topic("旅行", "3.png", "眼睛或身体总有一个在路上", 333, 345),
            new Topic("美文", "4.png", "极光视界旗下的一个诗会", 444, 456),
            new Topic("花园", "5.png", "双眸里繁星闪烁", 555, 567),
            new Topic("美食", "6.png", "享受餐桌的美好时光", 666, 678)
    };

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        //调用数据初始化方法
        initData(topics);
    }

    private void initData(Topic[] topicData) {
        //遍历Topic数组，将每个对象展示在布局中
        for (Topic topic : topicData) {
            //循环创建锚点布局面板
            AnchorPane anchorPane = new AnchorPane();
            //创建ImageView对象，用来显示专题图片
            Image logo = new Image("/img/" + topic.getTopicLogo());
            ImageView logoView = new ImageView(logo);
            logoView.setFitWidth(85);
            logoView.setFitHeight(85);
            anchorPane.setPrefSize(200, 180);
            anchorPane.setStyle("-fx-background-color: #FFFFFF;");
            //定位图片位置
            AnchorPane.setTopAnchor(logoView, -40.0);
            AnchorPane.setLeftAnchor(logoView, 60.0);

            //创建HyperLink对象，用来显示专题名称，设置样式并定位锚点
            Hyperlink nameLink = new Hyperlink(topic.getTopicName());
            nameLink.setStyle("-fx-font-size: 18px;");
            Tooltip tooltip = new Tooltip(topic.getTopicSummary());
            nameLink.setTooltip(tooltip);
            AnchorPane.setTopAnchor(nameLink, 60.0);
            AnchorPane.setLeftAnchor(nameLink, 80.0);

            //创建喜欢数据的文本标签对象，并设置图标、定位锚点
            Label likeLabel = new Label(String.valueOf(topic.getLikes()));
            likeLabel.setStyle("-fx-text-fill: rgb(102, 102, 102)");
            AnchorPane.setTopAnchor(likeLabel, 95.0);
            AnchorPane.setLeftAnchor(likeLabel, 60.0);
            Image heartImg = new Image("/icon/heart.png");
            ImageView heartImageView = new ImageView(heartImg);
            heartImageView.setFitWidth(15);
            heartImageView.setFitHeight(15);
            likeLabel.setGraphic(heartImageView);

            //创建评论数据的文本标签对象，并设置图标、定位锚点
            Label commentLabel = new Label(String.valueOf(topic.getComments()));
            commentLabel.setStyle("-fx-text-fill: rgb(102, 102, 102)");
            AnchorPane.setTopAnchor(commentLabel, 95.0);
            AnchorPane.setLeftAnchor(commentLabel, 110.0);
            Image commentImg = new Image("/icon/comment.png");
            ImageView commentImageView = new ImageView(commentImg);
            commentImageView.setFitWidth(15);
            commentImageView.setFitHeight(15);
            commentLabel.setGraphic(commentImageView);

            //创建关注按钮对象，设置样式并定位锚点
            Button followBtn = new Button("关注");
            followBtn.setStyle("-fx-background-color: rgb(66, 192, 46);-fx-text-fill: #FFFFFF;-fx-font-size: 14px;");
            AnchorPane.setTopAnchor(followBtn, 130.0);
            AnchorPane.setLeftAnchor(followBtn, 75.0);
            ObservableList list = anchorPane.getChildren();

            //将组件批量加入anchorPane中
            list.addAll(logoView, nameLink, likeLabel, commentLabel, followBtn);
            container.getChildren().add(anchorPane);
        }
    }

    public void search() {
        //清除原有数据
        String keywords = inputField.getText();
        ObservableList list = container.getChildren();
        container.getChildren().removeAll(list);
        //创建可变长集合，用来存放搜索结果
        List<Topic> topicList = new ArrayList<>();
        for (Topic topic : topics) {
            //找到含有关键词的对象
            if (topic.getTopicName().contains(keywords.trim())) {
                //加入集合
                topicList.add(topic);
            }
        }
        //将List转换为Topic类型数组，作为参数调用initData()方法，加载搜索结果
        Topic[] newTopics = topicList.toArray(new Topic[topicList.size()]);
        initData(newTopics);
    }

    public void reload() {
        ObservableList list = container.getChildren();
        container.getChildren().removeAll(list);
        initData(topics);
    }


}
