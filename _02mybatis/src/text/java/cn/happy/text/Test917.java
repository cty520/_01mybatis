package cn.happy.text;

import cn.happy.dao.IDeptDAO;
import cn.happy.entity.Dept;
import cn.happy.util.MybatisUtil;
import com.sun.xml.internal.bind.v2.model.core.ID;
import org.apache.ibatis.session.SqlSession;

import java.io.IOException;

/**
 * Created by adminastrator on 2017/9/18.
 */
public class Test917 {
    public void findStudentInfoByManyCondition()throws IOException{
        SqlSession session= MybatisUtil.getSession();
        IDeptDAO mapper =session.getMapper(IDeptDAO.class);
         Dept dept=new Dept();
         dept.setDeptname("sss");
                 System.out.println("添加前"+dept.getDeptno());
           mapper.addDept(dept);
        System.out.println("添加后"+dept.getDeptno());
           session.commit();

        session.close();
    }


}
