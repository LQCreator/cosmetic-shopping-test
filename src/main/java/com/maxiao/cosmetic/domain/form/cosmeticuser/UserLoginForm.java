package com.maxiao.cosmetic.domain.form.cosmeticuser;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Data
public class UserLoginForm {

    @ApiModelProperty("用户电话")
    private String phone;

    @ApiModelProperty("用户姓名")
    private String userName;

    @ApiModelProperty("密码")
    private String password;
}
