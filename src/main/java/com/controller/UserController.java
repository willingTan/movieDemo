package com.controller;

import com.alibaba.fastjson.JSONObject;

import com.service.UserService;
import com.utils.CommonUtil;
import com.utils.EnumUtil;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import javax.annotation.Resource;

@Controller
@RequestMapping(value = "/user",method = RequestMethod.POST)
public class UserController {

    @Resource
    private UserService userService;
    /**
     * 用户注册
     * @param userName
     * @param userPassWord
     * @return  json ：code: 1 注册成功，0注册失败  msg: 返回信息  date: 返回数据
     * eg.{"code":0,"data":null,"msg":"用户名已存在"}
     */
    @RequestMapping(value = "/userRegister")
    @ResponseBody
    public JSONObject userRegister(String userName, String userPassWord) {
        if (userName == null || "".equals( userName ))
            return CommonUtil.constructResponse( EnumUtil.PARAM_ERROR, "用户名为空", null );
        if (userPassWord == null || "".equals( userPassWord ))
            return CommonUtil.constructResponse( EnumUtil.PARAM_ERROR, "密码为空", null );
        int reslut = 0;
        try {
            reslut = userService.userRegister( userName, userPassWord );
        } catch (Exception e) {
            return CommonUtil.constructResponse( EnumUtil.SQL_FAILURE, "数据库异常", null );
        }
        if (reslut == 1)
            return CommonUtil.constructResponse( EnumUtil.OK, "注册成功", null );
        if (reslut == EnumUtil.SAME_NAME)
            return CommonUtil.constructResponse( EnumUtil.SAME_NAME, "同户名已存在", null );
        return CommonUtil.constructResponse( EnumUtil.FAILURE, "注册失败", null );
    }

}
