package com.maxiao.cosmetic.domain.form.cosmeticuser;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Data
public class UserCreateForm {

    @ApiModelProperty("用户电话")
    @NotNull(message = "用户电话不能为空")
    private String phone;

    @ApiModelProperty("用户姓名")
    @NotNull(message = "用户名不能为空")
    @Size(min = 1, max = 10, message = "用户名不超过10位")
    private String userName;

    @ApiModelProperty("密码")
    @NotNull(message = "密码不能为空")
    private String password;
}
