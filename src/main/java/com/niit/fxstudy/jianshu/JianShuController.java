package com.niit.fxstudy.jianshu;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;

import java.net.URL;
import java.util.ResourceBundle;

public class JianShuController  implements Initializable {
    @FXML
    private ImageView logoImg,userImg,bannerImg;
    @FXML
    private Button searchBtn;
    @FXML
    private Button writeBtn;
    @FXML
    private VBox articleBox,trendingBox,authorBox;


    //定义文章数组并初始化
    private Article[] articles = new Article[]{
            new Article("项目管理高手常用的10张图表推荐！",
              "工欲善其事，必先利其器，如何将一个项目按时、保质、保量的完成，也许你只差几张让项目更可控的图表而已！",
              "11.png","逸尘",1224,123),
            new Article("9个成功的微服务设计的基础知识",
                    "Xcode是苹果开发人员用于开发苹果App的IDE。Android Studio是安卓开发人员开发安卓App的IDE。",
                    "22.png","Java开发",3997,276),
            new Article("iOS开发还是Android开发？",
                    "工欲善其事，必先利其器，如何将一个项目按时、保质、保量的完成，也许你只差几张让项目更可控的图表而已！",
                    "33.png","随行的太阳",2664,120),
            new Article("专访Vue作者尤雨溪：Vue CLI 3.0重构的原因",
                    "尤雨溪认为旧版本的 Vue CLI 本质上只是从 GitHub 拉取模版，这种拉模版的方式有几个问题：",
                    "44.png","前端全栈学习",1648,208),
            new Article("当你发邮件时，你的电脑都干了什么？",
                    "电子邮件（email）是互联网上历史悠久又常用的消息收发形式。对于大多数办公室一族，每天到班上的第一件事恐怕就是要查一下新的邮件。",
                    "55.png","程序员小刘",3640,132)
    };

    //定义热门图片数组并初始化
    private Trending[] trendings = new Trending[]{
            new Trending("right1.png"),
            new Trending("right2.png"),
            new Trending("right3.png"),
            new Trending("right4.png"),
            new Trending("right5.png"),
            new Trending("right6.png")
    };

    //定义作者数组并初始化
    private  Author[] authors = new Author[]{
            new Author("格列柯南","1.png",433,12),
            new Author("吴晓布","2.png",226,23),
            new Author("三儿王屿","3.png",554,234),
            new Author("王诗翔","4.png",776,32),
            new Author("简书","5.png",878,76),
            new Author("格列柯南","1.png",433,12),
            new Author("吴晓布","2.png",226,23)
    };


    @Override
    public void initialize(URL location, ResourceBundle resources) {
        //简书logo图大小
        logoImg.setFitWidth(100);
        logoImg.setFitHeight(55);
        //搜索按钮图标设置
        Image searchImg = new Image("/jianshu/search.png");
        ImageView searchImgView = new ImageView(searchImg);
        searchImgView.setFitWidth(25);
        searchImgView.setFitHeight(25);
        searchBtn.setGraphic(searchImgView);
        //用户头像大小
        userImg.setFitWidth(40);
        userImg.setFitHeight(40);
        //写文章按钮设置图标
        Image btnImg = new Image("/jianshu/pen.png");
        ImageView imageView = new ImageView(btnImg);
        writeBtn.setGraphic(imageView);
        //banner设置大小
        bannerImg.setFitWidth(640);
        bannerImg.setFitHeight(300);
        //调用三块动态数据的初始化方法，左下文章、右上热门，右下作者
        initArticleData(articles);
        initTrendingData(trendings);
        initAuthorData(authors);
    }

    double y = 310.0;
    int distance = 0;
    //封装文章数据初始化方法
    private void initArticleData(Article[] articles){
        //遍历article数组，循环创建AnchorPane
        for (Article article:articles) {
            AnchorPane articlePane = new AnchorPane();
            //文章标题
            Label titleLabel = new Label(article.getTitle());
            titleLabel.setStyle("-fx-text-fill: rgb(51,51,51);-fx-font-size: 18px;-fx-font-weight: bold");
            AnchorPane.setTopAnchor(titleLabel, 10.0);
            AnchorPane.setLeftAnchor(titleLabel, 10.0);
            //文章内容
            Label contentLabel = new Label(article.getContent());
            contentLabel.getStyleClass().addAll("content","p");
            contentLabel.setStyle("-fx-pref-width: 450px");
            //换行
            contentLabel.setWrapText(true);
            AnchorPane.setTopAnchor(contentLabel, 40.0);
            AnchorPane.setLeftAnchor(contentLabel, 10.0);
            //水平盒子，用来存放作者、喜欢、评论信息
            HBox infoBox = new HBox();
            infoBox.setSpacing(10);
            AnchorPane.setTopAnchor(infoBox, 85.0);
            AnchorPane.setLeftAnchor(infoBox, 10.0);
            //作者
            Label authorLabel = new Label(article.getAuthor());
            authorLabel.getStyleClass().add("content");
            //评论
            Label commentLabel  = new Label(String.valueOf(article.getCommentCount()));
            commentLabel.getStyleClass().add("content");
            commentLabel.setGraphic(new ImageView(new Image("/jianshu/comment.png")));
            //喜欢
            Label likeLable  = new Label(String.valueOf(article.getLikeCount()));
            likeLable.getStyleClass().add("content");
            likeLable.setGraphic(new ImageView(new Image("/jianshu/heart.png")));
            //加入水平盒子
            infoBox.getChildren().addAll(authorLabel,commentLabel,likeLable);
            //文章缩略图
            Image articleImg = new Image("/jianshu/"+article.getThumbnail());
            ImageView articleImageView = new ImageView(articleImg);
            articleImageView.setFitWidth(160);
            articleImageView.setFitHeight(100);
            AnchorPane.setTopAnchor(articleImageView, 10.0);
            AnchorPane.setLeftAnchor(articleImageView, 490.0);
            articlePane.getChildren().addAll(titleLabel,contentLabel,infoBox,articleImageView);
            //每篇文章下面的线
            Line line  = new Line();
            line.setStartY(125.0);
            line.setEndX(660.0);
            line.setStartY(y+distance);
            line.setEndY(y+distance);
            line.setStroke(Color.web("#DEDEDE"));
            //垂直距离自增
            distance += 100;
            articleBox.getChildren().addAll(articlePane,line);
        }
    }

    //封装热门数据初始化方法
    private  void  initTrendingData(Trending[] trendings){
        //遍历trendings数组，循环创建ImageView
        for (Trending trending :trendings) {
            Image trendingImg = new Image("/jianshu/"+trending.getImgUrl());
            ImageView trendingImageView = new ImageView(trendingImg);
            trendingImageView.setFitWidth(280);
            trendingImageView.setFitHeight(45);
            if("right6.png".equals(trending.getImgUrl())){
                trendingImageView.setFitHeight(80);
            }
            trendingBox.getChildren().add(trendingImageView);
        }
    }

    //封装作者数据初始化方法
    private void initAuthorData(Author[] authors){
        //遍历author数组，循环创建AnchorPane
        for (Author author:authors) {
            AnchorPane authorPane = new AnchorPane();
            //头像
            Image avatarImg = new Image("/jianshu/"+author.getAvatar());
            ImageView avatarImageView = new ImageView(avatarImg);
            avatarImageView.setFitWidth(45);
            avatarImageView.setFitHeight(45);
            //昵称
            Label nickNameLabel = new Label(author.getNickname());
            nickNameLabel.setStyle("-fx-text-fill: rgb(51, 51, 51);-fx-font-size: 14px");
            //描述
            Label infoLabel = new Label("写了"+author.getWordsCount()+"字 "+author.getLikeCount()+"喜欢");
            infoLabel.setStyle("-fx-text-fill: rgb(150, 150, 150);-fx-font-size: 13px");
            //关注标签
            Label followLabel = new Label("关注");
            followLabel.setStyle("-fx-text-fill: rgb(66, 192, 46)");
            Image followImg = new Image("/jianshu/plus.png");
            //设置图标
            ImageView followView = new ImageView(followImg);
            followLabel.setGraphic(followView);
            //将作者相关的组件进行锚点定位
            AnchorPane.setTopAnchor(avatarImageView, 10.0);
            AnchorPane.setLeftAnchor(avatarImageView, 10.0);
            AnchorPane.setTopAnchor(nickNameLabel, 10.0);
            AnchorPane.setLeftAnchor(nickNameLabel, 70.0);
            AnchorPane.setTopAnchor(infoLabel, 32.0);
            AnchorPane.setLeftAnchor(infoLabel, 70.0);
            AnchorPane.setTopAnchor(followLabel, 25.0);
            AnchorPane.setLeftAnchor(followLabel, 230.0);
            //加入锚点布局
            authorPane.getChildren().addAll(avatarImageView,nickNameLabel,infoLabel,followLabel);
            authorBox.getChildren().add(authorPane);
        }
    }
}
