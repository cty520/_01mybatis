package cn.happy.service;

import cn.happy.entity.UserInfo;

import java.util.List;

/**
 * Created by adminastrator on 2017/9/20.
 */
public interface IUserInfoService {
    public UserInfo isLogin(UserInfo info);

    List<UserInfo> findAll();
}
