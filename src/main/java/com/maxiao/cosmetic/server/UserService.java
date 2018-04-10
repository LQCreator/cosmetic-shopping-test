package com.maxiao.cosmetic.server;

import com.maxiao.cosmetic.domain.bo.cosmeticuser.UserBo;
import com.maxiao.cosmetic.domain.condition.cosmeticuser.UserCondition;
import com.maxiao.cosmetic.domain.exception.CosmeticException;
import com.maxiao.cosmetic.domain.po.cosmeticuser.UserLoginPo;
import com.maxiao.cosmetic.domain.po.cosmeticuser.UserPo;


public interface UserService {
    /**
     * 查询数量
     *
     * @param condition
     * @return
     */
    int queryCount(UserCondition condition);

    /**
     * 获得用户编号
     * @return
     */
    String getUserId();

    /**
     * 注册前台用户
     * @return
     */
    void insertPUser(UserPo userPo, UserLoginPo userLoginPo);

    /**
     * 前端登录
     * @return
     */
    UserBo loginUser(UserCondition userCondition) throws CosmeticException;

}

