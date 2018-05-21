package com.test;


import com.alibaba.fastjson.JSON;
import com.dao.FirstPageDao;
import com.dao.UserDao;
import com.pojo.FirstPage.Banner;
import com.pojo.FirstPage.Children;
import com.pojo.FirstPage.LittleType.Pictures;
import com.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
public class TextMapper {

    @Resource
    private UserDao userDao;

    @Resource
    private FirstPageDao firstPageDao;

    @Resource
    private UserService userService;

    @Test
    public void testUser(){
    System.out.println(userDao.userRegister("text","text"));
    System.out.println(userDao.userRegisterCheckName("tom"));
    System.out.println(userDao.user("tom"));
    }

    @Test
    public void testFirstPage(){
        List<Banner> banners=firstPageDao.getBanners();
        System.out.println(JSON.toJSONString(banners));
        //Children children=new Children();
        //List<Pictures> BigPic=firstPageDao.getChildrenBigPic();
        //System.out.println(BigPic);
    }

}
