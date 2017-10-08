package cn.happy.service.impl;

import cn.happy.dao.IUserInfoDAO;
import cn.happy.entity.UserInfo;
import cn.happy.service.IUserInfoService;
import cn.happy.util.MybatisUtil;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

/**
 * Created by adminastrator on 2017/9/21.
 */


public class UserinfoServiceimpl implements IUserInfoService {
    IUserInfoDAO dao;
    SqlSession session;
    public UserinfoServiceimpl() {
        session = MybatisUtil.getSession();
        dao= session.getMapper(IUserInfoDAO.class);
    }

    public UserInfo isLogin(UserInfo info) {
        return  dao.isLogin(info);
    }

    public List<UserInfo> findAll() {
        return null;
    }
}
