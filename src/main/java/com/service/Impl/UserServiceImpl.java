package com.service.Impl;

import com.dao.UserDao;
import com.service.UserService;
import com.utils.EnumUtil;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Service
public class UserServiceImpl implements UserService{

    @Resource
    private UserDao userDao;

    /**
     * 用户注册
     * @param userName
     * @param userPassWord
     * @return  json ：code: 1 注册成功，0注册失败  msg: 返回信息  date: 返回数据
     */
    @Override
    public int userRegister(String userName, String userPassWord) throws Exception {
        //检查是否存在重名
        String sameName = null;
        try {
            sameName = userDao.userRegisterCheckName(userName);
        }catch (Exception e){
            throw e;
        }
        if (sameName != null)
            return EnumUtil.SAME_NAME;
        else {
            int reslut = userDao.userRegister(userName,userPassWord);
            if (reslut == 1)
                return EnumUtil.OK;
        }
        return EnumUtil.SYSTEM_ERROR;
    }
}
