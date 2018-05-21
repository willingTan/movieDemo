package com.pojo.FirstPage;

import com.pojo.FirstPage.LittleType.Crumbs;
import com.pojo.FirstPage.LittleType.Pictures;
import com.pojo.FirstPage.LittleType.Tuijian;

import java.util.List;

public class Variety {
    List<Pictures> bigPic;
    List<Pictures> pic;
    List<Crumbs> crumbs;
    Tuijian tuijian;

    public Tuijian getTuijian() {
        return tuijian;
    }

    public void setTuijian(Tuijian tuijian) {
        this.tuijian = tuijian;
    }

    public Variety(List<Pictures> bigPic, List<Pictures> pic, List<Crumbs> crumbs, Tuijian tuijian) {
        this.bigPic = bigPic;
        this.pic = pic;
        this.crumbs = crumbs;
        this.tuijian = tuijian;
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

    public List<Crumbs> getCrumbs() {
        return crumbs;
    }

    public void setCrumbs(List<Crumbs> crumbs) {
        this.crumbs = crumbs;
    }

    @Override
    public String toString() {
        return "{" +
                "bigPic=" + bigPic +
                ", pic=" + pic +
                ", crumbs=" + crumbs +
                '}';
    }
}
