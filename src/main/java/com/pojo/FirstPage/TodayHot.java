package com.pojo.FirstPage;

import com.pojo.FirstPage.LittleType.BigNews;
import com.pojo.FirstPage.LittleType.Crumbs;
import com.pojo.FirstPage.LittleType.Pictures;

import java.util.List;

public class TodayHot {
    List<BigNews> bignews;
    List<Crumbs> crumbs;
    List<Pictures> bigPic;
    List<Pictures> pic;

    public TodayHot(List<BigNews> bignews, List<Crumbs> crumbs, List<Pictures> bigPic, List<Pictures> pic) {
        this.bignews = bignews;
        this.crumbs = crumbs;
        this.bigPic = bigPic;
        this.pic = pic;
    }

    public List<BigNews> getBignews() {
        return bignews;
    }

    public void setBignews(List<BigNews> bignews) {
        this.bignews = bignews;
    }

    public List<Crumbs> getCrumbs() {
        return crumbs;
    }

    public void setCrumbs(List<Crumbs> crumbs) {
        this.crumbs = crumbs;
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
                "bignews=" + bignews +
                ", crumbs=" + crumbs +
                ", bigPic=" + bigPic +
                ", pic=" + pic +
                '}';
    }
}
