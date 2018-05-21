package com.pojo.FirstPage;

import com.pojo.FirstPage.LittleType.Pictures;
import com.pojo.FirstPage.LittleType.Rank;

import java.util.List;

public class Movie {
    List<Rank> rank;
    List<Pictures> pic;


    public Movie(List<Rank> rank, List<Pictures> pic) {
        this.rank = rank;
        this.pic = pic;
    }

    public List<Rank> getRank() {
        return rank;
    }

    public void setRank(List<Rank> rank) {
        this.rank = rank;
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
                "rank=" + rank +
                ", pic=" + pic +
                '}';
    }
}
