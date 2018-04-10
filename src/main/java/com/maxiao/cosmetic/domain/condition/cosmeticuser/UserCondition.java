package com.maxiao.cosmetic.domain.condition.cosmeticuser;

import lombok.Data;

@Data
public class UserCondition {
    /**
     * 用户编号
     */
    private String userId;

    /**
     * 用户电话
     */
    private String phone;

    /**
     * 用户姓名
     */
    private String userName;

    /**
     * 密码
     */
    private String password;
}
