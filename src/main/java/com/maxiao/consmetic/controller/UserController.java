package com.maxiao.consmetic.controller;

import com.maxiao.consmetic.domain.User;
import com.maxiao.consmetic.server.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@Api(value = "/user", description = "用户信息")
public class UserController {
    @Autowired
    private UserService userService;

    @ApiOperation(value = "查询用户",notes = "查询用户",httpMethod = "GET")
    @RequestMapping(value = "/queryUser", method = {RequestMethod.POST, RequestMethod.GET})
    public void queryUser(@RequestParam String userId) {
        User user = userService.queryUser(userId);
        System.out.print(user);
    }
}
