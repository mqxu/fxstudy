package com.niit.fxstudy.topic;

/**
 * 专题实体类
 */
public class Topic {
    private String topicName;
    private String topicLogo;
    private String topicSummary;
    private Integer likes;
    private Integer comments;

    public Topic(String topicName, String topicLogo, String topicSummary, Integer likes, Integer comments) {
        this.topicName = topicName;
        this.topicLogo = topicLogo;
        this.topicSummary = topicSummary;
        this.likes = likes;
        this.comments = comments;
    }

    public Topic(String topicLogo) {
        this.topicLogo = topicLogo;
    }

    public String getTopicName() {
        return topicName;
    }

    public void setTopicName(String topicName) {
        this.topicName = topicName;
    }

    public String getTopicLogo() {
        return topicLogo;
    }

    public void setTopicLogo(String topicLogo) {
        this.topicLogo = topicLogo;
    }

    public String getTopicSummary() {
        return topicSummary;
    }

    public void setTopicSummary(String topicSummary) {
        this.topicSummary = topicSummary;
    }

    public Integer getLikes() {
        return likes;
    }

    public void setLikes(Integer likes) {
        this.likes = likes;
    }

    public Integer getComments() {
        return comments;
    }

    public void setComments(Integer comments) {
        this.comments = comments;
    }

    @Override
    public String toString() {
        return "Topic{" +
                "topicName='" + topicName + '\'' +
                ", topicLogo='" + topicLogo + '\'' +
                ", topicSummary='" + topicSummary + '\'' +
                ", likes=" + likes +
                ", comments=" + comments +
                '}';
    }
}
