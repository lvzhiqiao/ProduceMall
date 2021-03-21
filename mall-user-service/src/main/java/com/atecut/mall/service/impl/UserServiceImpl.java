package com.atecut.mall.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.atecut.mall.mapper.UserInfoMapper;
import dao.UserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import service.UserInfoService;

import java.util.List;

/**
 * @author 彭一鸣
 * @since 2021/3/19 15:48
 */
@Service
public class UserServiceImpl implements UserInfoService {

    @Autowired
    private UserInfoMapper userInfoMapper;

    public List<UserInfo> getUserInfoList() {
        System.out.println("牛逼");
        return userInfoMapper.selectAll();
    }
}
