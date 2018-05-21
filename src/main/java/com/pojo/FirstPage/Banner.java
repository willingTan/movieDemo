package com.pojo.FirstPage;

public class Banner {
    String title;
    String img;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    @Override
    public String toString() {
        return "{" +
                "title='" + title + '\'' +
                ", img='" + img + '\'' +
                '}';
    }
}
