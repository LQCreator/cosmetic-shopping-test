package com.maxiao.cosmetic.domain.response;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@ApiModel(description = "系统级的返回参数")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ResponseEntity<T> {

    @ApiModelProperty(value = "状态: ok 成功, fail 失败")
    private String result;

    @ApiModelProperty(value = "状态码: 200 成功, 201 失败, 202 需要登陆")
    private Integer rescode;

    @ApiModelProperty(value = "备注原因")
    private String msg;

    @ApiModelProperty(value = "返回对象")
    private T data;

}
