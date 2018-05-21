package com.dao;


import com.pojo.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDao {

    /**
     * 用户注册
     * @param userName
     * @param userPassWord
     * @return  int ：1 注册成功，0注册失败
     */
   int userRegister(@Param("userName") String userName,
                            @Param("userPassWord") String userPassWord);

    /**
     * 注册时检查是否重名
     * @param userName
     * @return
     */
    String userRegisterCheckName(@Param("userName") String userName);

    /**
     * 返回一个user对象
     * @param userName
     * @return
     */
    User user(@Param("username") String userName);
}