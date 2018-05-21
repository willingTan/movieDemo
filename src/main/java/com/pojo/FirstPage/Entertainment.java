package com.pojo.FirstPage;

import com.pojo.FirstPage.LittleType.Pictures;

import java.util.List;

public class Entertainment {
    List<Pictures> bigPic;
    List<Pictures> pic;

    public Entertainment(List<Pictures> bigPic, List<Pictures> pic) {
        this.bigPic = bigPic;
        this.pic = pic;
    }

    public List<Pictures> getBigPic() {
        return bigPic;
    }

    public void setBigPic(List<Pictures> bigPic) {
        this.bigPic = bigPic;
    }

    public List<Pictures> getPic() {
        return pic;
    }

    public void setPic(List<Pictures> pic) {
        this.pic = pic;
    }

    @Override
    public String toString() {
        return "{" +
                "bigPic=" + bigPic +
                ", pic=" + pic +
                '}';
    }
}
