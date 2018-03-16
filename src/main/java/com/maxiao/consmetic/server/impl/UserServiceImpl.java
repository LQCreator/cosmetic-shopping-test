package com.maxiao.consmetic.server.impl;

import com.maxiao.consmetic.domain.User;
import com.maxiao.consmetic.mapper.UserMapper;
import com.maxiao.consmetic.server.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{
    @Autowired
    private  UserMapper userMapper;

    public User queryUser(String userId) {
        return userMapper.queryUser(userId);
    }
}
