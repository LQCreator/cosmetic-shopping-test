package com.maxiao.cosmetic.domain.po.cosmeticuser;

import lombok.Data;

@Data
public class UserLoginPo {
    /**
     * 用户编号
     */
    private String userId;

    /**
     * 用户电话
     */
    private String phone;

    /**
     * 密码
     */
    private String password;

    /**
     * 登录类型
     */
    private Integer loginType;
}
