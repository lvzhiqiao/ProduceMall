package com.atecut.mall.order.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import dao.UserInfo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import service.UserInfoService;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * @author 彭一鸣
 * @since 2021/3/19 16:40
 */
@Controller
@RequestMapping("/order")
public class OrderController {

    @Reference
    private UserInfoService userInfoService;

    @RequestMapping("trade")
    public String trade(HttpServletRequest request) {
        List<UserInfo> userInfoList = userInfoService.getUserInfoList();
        System.out.println(userInfoList);
        return "hello";
    }
}
