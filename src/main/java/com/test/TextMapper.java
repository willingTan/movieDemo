package com.test;


import com.dao.UserDao;
import com.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
public class TextMapper {

    @Resource
    private UserDao userDao;

    @Resource
    private UserService userService;

    @Test
    public void textUser(){
    System.out.println(userDao.userRegister("text","text"));
    System.out.println(userDao.userRegisterCheckName("admin"));
    }

}
