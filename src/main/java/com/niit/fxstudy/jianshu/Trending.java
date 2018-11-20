package com.niit.fxstudy.jianshu;

/**
 * 热门
 */
public class Trending {
    private String imgUrl;

    public Trending(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public Trending() {
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    @Override
    public String toString() {
        return "Trending{" +
                "imgUrl='" + imgUrl + '\'' +
                '}';
    }
}
