package com.service;

public interface UserService {

    /**
     * 用户注册
     * @param userName
     * @param userPassWord
     * @return  json ：code: 1 注册成功，0注册失败  msg: 返回信息  date: 返回数据
     */
    public int userRegister(String userName, String userPassWord) throws Exception;

}
