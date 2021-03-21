package service;

import dao.UserInfo;

import java.util.List;

/**
 * @author 彭一鸣
 * @since 2021/3/17 19:44
 */
public interface UserInfoService {
    List<UserInfo> getUserInfoList();
}
