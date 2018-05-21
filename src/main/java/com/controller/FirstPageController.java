package com.controller;

import com.alibaba.fastjson.JSONObject;
import com.dao.FirstPageDao;
import com.pojo.FirstPage.*;
import com.pojo.FirstPage.LittleType.*;
import com.utils.CommonUtil;
import com.utils.EnumUtil;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

@Controller
@RequestMapping(value = "/firstpage")
@CrossOrigin
public class FirstPageController {

    @Resource
    private FirstPageDao firstPageDao;

    @RequestMapping("/banner")
    @ResponseBody
    public JSONObject getBanner(){
        //return CommonUtil.constructResponse( EnumUtil.PARAM_ERROR, "测试成功", null );
        //return FirstPageUtil.getbanner();
        List<Banner> banners=firstPageDao.getBanners();
        return CommonUtil.constructResponse(EnumUtil.OK,"访问成功",banners);
    }

    @RequestMapping("/todayhot")
    @ResponseBody
    public JSONObject getTodayhot(){
        //return CommonUtil.constructResponse( EnumUtil.PARAM_ERROR, "todayhot测试成功", null );
        List<BigNews> bigNews=firstPageDao.getTodayHotBigNews();
        List<Crumbs> crumbs=firstPageDao.getTodayHotCrumbs();
        List<Pictures> BigPic=firstPageDao.getTodayHotBigPic();
        List<Pictures> Pic=firstPageDao.getTodayHotPic();
        TodayHot todayHot=new TodayHot(bigNews,crumbs,BigPic,Pic);
        return CommonUtil.constructResponse(EnumUtil.OK,"访问成功",todayHot);
    }

    @RequestMapping("/variety")
    @ResponseBody
    public JSONObject getVariety(){
        //return CommonUtil.constructResponse( EnumUtil.PARAM_ERROR, "variety测试成功", null );
        List<Pictures> BigPic=firstPageDao.getVarietyBigPic();
        List<Pictures> Pic=firstPageDao.getVarietyPic();
        List<Crumbs> crumbs=firstPageDao.getVarietyCrumbs();
        List<Pictures> TuijianPic=firstPageDao.getTuijianPic();
        List<Txtlist> txtlists=firstPageDao.getTuijianTxtlist();
        Tuijian tuijian=new Tuijian(TuijianPic,txtlists);
        Variety variety=new Variety(BigPic,Pic,crumbs,tuijian);
        return CommonUtil.constructResponse(EnumUtil.OK,"访问成功",variety);
    }

    @RequestMapping("/selfvariety")
    @ResponseBody
    public JSONObject getSelfVariety(){
        //return CommonUtil.constructResponse( EnumUtil.PARAM_ERROR, "selfvariety测试成功", null );
        List<Pictures> Pic=firstPageDao.getSelfVarietyPic();
        List<Crumbs> crumbs=firstPageDao.getSelfVarietyCrumbs();
        SelfVariety selfVariety=new SelfVariety(crumbs,Pic);
        return CommonUtil.constructResponse(EnumUtil.OK,"访问成功",selfVariety);
    }

    @RequestMapping("/talkshow")
    @ResponseBody
    public JSONObject getTalkShow(){
        //return CommonUtil.constructResponse( EnumUtil.PARAM_ERROR, "talkshow测试成功", null );
        List<Pictures> Pic=firstPageDao.getTalkShowPic();
        List<Crumbs> crumbs=firstPageDao.getTalkShowCrumbs();
        TalkShow talkShow=new TalkShow(crumbs,Pic);
        return CommonUtil.constructResponse(EnumUtil.OK,"访问成功",talkShow);
    }

    @RequestMapping("/entertainment")
    @ResponseBody
    public JSONObject getEntertainment(){
        //return CommonUtil.constructResponse( EnumUtil.PARAM_ERROR, "entertainment测试成功", null );
        List<Pictures> BigPic=firstPageDao.getEntertainmentBigPic();
        List<Pictures> Pic=firstPageDao.getEntertainmentPic();
        Entertainment entertainment=new Entertainment(BigPic,Pic);
        return CommonUtil.constructResponse(EnumUtil.OK,"访问成功",entertainment);
    }

    @RequestMapping("/movie")
    @ResponseBody
    public JSONObject getMovie(){
        //return CommonUtil.constructResponse( EnumUtil.PARAM_ERROR, "movie测试成功", null );
        List<Pictures> Pic=firstPageDao.getMoviePic();
        List<Rank> rank=firstPageDao.getMovieRank();
        Movie movie=new Movie(rank,Pic);
        return CommonUtil.constructResponse(EnumUtil.OK,"访问成功",movie);
    }

    @RequestMapping("/tv")
    @ResponseBody
    public JSONObject getTV(){
        //return CommonUtil.constructResponse( EnumUtil.PARAM_ERROR, "tv测试成功", null );
        List<Pictures> Pic=firstPageDao.getTVPic();
        List<Rank> rank=firstPageDao.getTVRank();
        TV tv=new TV(rank,Pic);
        return CommonUtil.constructResponse(EnumUtil.OK,"访问成功",tv);
    }

    @RequestMapping("/comic")
    @ResponseBody
    public JSONObject getComic(){
        //return CommonUtil.constructResponse( EnumUtil.PARAM_ERROR, "comic测试成功", null );
        List<Pictures> BigPic=firstPageDao.getComicBigPic();
        List<Pictures> Pic=firstPageDao.getComicPic();
        Comic comic=new Comic(BigPic,Pic);
        return CommonUtil.constructResponse(EnumUtil.OK,"访问成功",comic);
    }

    @RequestMapping("/children")
    @ResponseBody
    public JSONObject getChildren(){
        //return CommonUtil.constructResponse( EnumUtil.PARAM_ERROR, "children测试成功", null );
        List<Pictures> BigPic=firstPageDao.getChildrenBigPic();
        List<Pictures> Pic=firstPageDao.getChildrenPic();
        Children children=new Children(BigPic,Pic);
        return CommonUtil.constructResponse(EnumUtil.OK,"访问成功",children);
    }

}
