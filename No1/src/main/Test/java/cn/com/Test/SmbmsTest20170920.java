package cn.com.Test;


import cn.happy.dao.IUserInfoDAO;
import cn.happy.entity.UserInfo;
import cn.happy.util.MybatisUtil;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;

/**
 * Created by annan on 2017/9/17.
 */
public class SmbmsTest20170920 {

    @Test
    public void idlog() throws Exception{
        InputStream is= Resources.getResourceAsStream("mybatis-cofing.xml");
        SqlSessionFactory sql=new SqlSessionFactoryBuilder().build(is);
        SqlSession session = sql.openSession();
        UserInfo u=new UserInfo();
        u.setUserCode("001");
        u.setUserPassword("1");
        UserInfo login = session.getMapper(IUserInfoDAO.class).isLogin(u);
        System.out.println(login.getUserName());
    }

    @Test//模糊查询
    public void userLikeList() throws IOException {

        SqlSession session= MybatisUtil.getSession();

        IUserInfoDAO mapper = session.getMapper(IUserInfoDAO.class);

        UserInfo smbms_user=new UserInfo();
        smbms_user.setUserCode("001");
        smbms_user.setUserPassword("1");

        UserInfo login = mapper.isLogin(smbms_user);

        if (login!=null) {
            System.out.println(login.getUserName());
        }
        session.close();
    }


}
