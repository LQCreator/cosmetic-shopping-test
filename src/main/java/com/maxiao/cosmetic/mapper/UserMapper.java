package com.maxiao.cosmetic.mapper;

import com.maxiao.cosmetic.domain.condition.cosmeticuser.UserCondition;
import com.maxiao.cosmetic.domain.po.cosmeticuser.UserLoginPo;
import com.maxiao.cosmetic.domain.po.cosmeticuser.UserPo;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMapper {
    /**
     * 查询数量
     *
     * @param condition
     * @return
     */
    int count(UserCondition condition);

    /**
     * 获得用户编号
     *
     * @return
     */
    String getUserId();

    /**
     * 插入用户表
     *
     * @param userPo
     */
    void insertUser(UserPo userPo);

    /**
     * 插入登录表
     *
     * @param userLoginPo
     */
    void insertLogin(UserLoginPo userLoginPo);

}
