package com.atecut.mall.controller;

import dao.UserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import service.UserInfoService;

import java.util.List;

/**
 * @author 彭一鸣
 * @since 2021/3/19 15:46
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserInfoService userInfoService;

    @GetMapping("/findAllUser")
    public List<UserInfo> findAll(){
        List<UserInfo> userInfoList = userInfoService.getUserInfoList();
        return userInfoList;
    }

}
