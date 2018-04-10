package com.maxiao.cosmetic.server.impl;

import com.maxiao.cosmetic.domain.bo.cosmeticuser.UserBo;
import com.maxiao.cosmetic.domain.condition.cosmeticuser.UserCondition;
import com.maxiao.cosmetic.domain.exception.CosmeticException;
import com.maxiao.cosmetic.domain.po.cosmeticuser.UserLoginPo;
import com.maxiao.cosmetic.domain.po.cosmeticuser.UserPo;
import com.maxiao.cosmetic.mapper.UserMapper;
import com.maxiao.cosmetic.server.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public int queryCount(UserCondition condition) {
        return userMapper.count(condition);
    }

    @Override
    public String getUserId() {
        return userMapper.getUserId();
    }

    @Override
    public void insertPUser(UserPo userPo, UserLoginPo userLoginPo) {
        userMapper.insertUser(userPo);
        userMapper.insertLogin(userLoginPo);
    }

    @Override
    public UserBo loginUser(UserCondition userCondition) throws CosmeticException {
        return userMapper.queryUserInfo(userCondition);
    }


}
