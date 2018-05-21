package com.dao;

import com.pojo.FirstPage.*;
import com.pojo.FirstPage.LittleType.*;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FirstPageDao {
    List<Banner> getBanners();

    List<Pictures> getChildrenBigPic();

    List<Pictures> getChildrenPic();

    List<Pictures> getComicBigPic();

    List<Pictures> getComicPic();

    List<Pictures> getEntertainmentBigPic();

    List<Pictures> getEntertainmentPic();

    List<Pictures> getMoviePic();

    List<Rank> getMovieRank();

    List<Pictures> getSelfVarietyPic();

    List<Crumbs> getSelfVarietyCrumbs();

    List<Pictures> getTalkShowPic();

    List<Crumbs> getTalkShowCrumbs();

    List<Pictures> getTVPic();

    List<Rank> getTVRank();

    List<Pictures> getVarietyBigPic();

    List<Pictures> getVarietyPic();

    List<Crumbs> getVarietyCrumbs();

    List<BigNews> getTodayHotBigNews();

    List<Crumbs> getTodayHotCrumbs();

    List<Pictures> getTodayHotBigPic();

    List<Pictures> getTodayHotPic();

    List<Pictures> getTuijianPic();

    List<Txtlist> getTuijianTxtlist();
}
