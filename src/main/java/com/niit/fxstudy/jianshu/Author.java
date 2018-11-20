package com.niit.fxstudy.jianshu;

/**
 * 作者实体类
 */
public class Author {
    private String nickname;
    private String avatar;
    private Integer wordsCount;
    private Integer likeCount;

    public Author(String nickname, String avatar, Integer wordsCount, Integer likeCount) {
        this.nickname = nickname;
        this.avatar = avatar;
        this.wordsCount = wordsCount;
        this.likeCount = likeCount;
    }

    public Author() {
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public Integer getWordsCount() {
        return wordsCount;
    }

    public void setWordsCount(Integer wordsCount) {
        this.wordsCount = wordsCount;
    }

    public Integer getLikeCount() {
        return likeCount;
    }

    public void setLikeCount(Integer likeCount) {
        this.likeCount = likeCount;
    }

    @Override
    public String toString() {
        return "Author{" +
                "nickname='" + nickname + '\'' +
                ", avatar='" + avatar + '\'' +
                ", wordsCount=" + wordsCount +
                ", likeCount=" + likeCount +
                '}';
    }
}
