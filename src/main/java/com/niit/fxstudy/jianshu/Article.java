package com.niit.fxstudy.jianshu;

public class Article {
    //标题
    private String title;
    //内容
    private String content;
    //缩略图
    private String thumbnail;
    //作者
    private String author;
    //喜欢数
    private Integer likeCount;
    //评论数
    private Integer commentCount;

    public Article(String title, String content, String thumbnail, String author, Integer likeCount, Integer commentCount) {
        this.title = title;
        this.content = content;
        this.thumbnail = thumbnail;
        this.author = author;
        this.likeCount = likeCount;
        this.commentCount = commentCount;
    }

    public Article() {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Integer getLikeCount() {
        return likeCount;
    }

    public void setLikeCount(Integer likeCount) {
        this.likeCount = likeCount;
    }

    public Integer getCommentCount() {
        return commentCount;
    }

    public void setCommentCount(Integer commentCount) {
        this.commentCount = commentCount;
    }

    @Override
    public String toString() {
        return "Article{" +
                "title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", thumbnail='" + thumbnail + '\'' +
                ", author='" + author + '\'' +
                ", likeCount=" + likeCount +
                ", commentCount=" + commentCount +
                '}';
    }
}
