package com.pojo.FirstPage;

import com.pojo.FirstPage.LittleType.Crumbs;
import com.pojo.FirstPage.LittleType.Pictures;

import java.util.List;

public class TalkShow {
    List<Crumbs> crumbs;
    List<Pictures> pic;

    public TalkShow(List<Crumbs> crumbs, List<Pictures> pic) {
        this.crumbs = crumbs;
        this.pic = pic;
    }

    public List<Crumbs> getCrumbs() {
        return crumbs;
    }

    public void setCrumbs(List<Crumbs> crumbs) {
        this.crumbs = crumbs;
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
                "crumbs=" + crumbs +
                ", pic=" + pic +
                '}';
    }
}
