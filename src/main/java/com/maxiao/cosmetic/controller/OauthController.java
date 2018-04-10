package com.maxiao.cosmetic.controller;

import com.maxiao.cosmetic.domain.condition.cosmeticuser.UserCondition;
import com.maxiao.cosmetic.domain.form.cosmeticuser.UserCreateForm;
import com.maxiao.cosmetic.domain.po.cosmeticuser.UserLoginPo;
import com.maxiao.cosmetic.domain.po.cosmeticuser.UserPo;
import com.maxiao.cosmetic.domain.response.ResponseEntity;
import com.maxiao.cosmetic.domain.vo.UserVo;
import com.maxiao.cosmetic.server.UserService;
import com.maxiao.cosmetic.util.CopyUtil;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/oauth")
public class OauthController extends BaseController {

    @Autowired
    private UserService userService;

    @ApiOperation(value = "前台用户注册", notes = "新增用户信息", httpMethod = "POST")
    @RequestMapping(value = "/register", method = {RequestMethod.GET, RequestMethod.POST})
    public @ResponseBody
    ResponseEntity<Object> register(@ModelAttribute @Valid UserCreateForm userCreateForm) {
        UserCondition userCondition = new UserCondition();
        userCondition.setUserName(userCreateForm.getUserName());
        int count = userService.queryCount(userCondition);
        if (count > 0) {
            return this.getFailResult(201, "该名称已存在");
        }

        UserCondition userCondition1 = new UserCondition();
        userCondition1.setPhone(userCreateForm.getPhone());
        int count1 = userService.queryCount(userCondition);
        if (count1 > 0) {
            return this.getFailResult(201, "手机号已注册");
        }

        String userId = userService.getUserId();
        UserPo userPo =  CopyUtil.transfer(userCreateForm, UserPo.class);;
        userPo.setUserId(userId);
        userPo.setUserName(userCreateForm.getUserName());

        UserLoginPo userLoginPo = new UserLoginPo();
        userLoginPo.setUserId(userId);
        userLoginPo.setPhone(userCreateForm.getPhone());
        userLoginPo.setPassword(userCreateForm.getPassword());
        userLoginPo.setLoginType(2);

        userService.insertPUser(userPo, userLoginPo);
        UserVo vo = CopyUtil.transfer(userPo, UserVo.class);
        return getSuccessResult(vo);
    }
}
