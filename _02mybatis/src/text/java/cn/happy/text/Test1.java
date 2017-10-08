package cn.happy.text;



import cn.happy.dao.IDeptDAO;
import cn.happy.entity.Dept;
import jdk.internal.util.xml.impl.Input;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.ibatis.session.defaults.DefaultSqlSessionFactory;

import javax.annotation.Resource;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * Created by adminastrator on 2017/9/17.
 */
public class Test1 {
    //添加
    // public  void adddept() throws IOException{

    public  void editDept() throws IOException{
        String resouce="mybatis-confing.xml";
        InputStream is = Resources.getResourceAsStream(resouce);
        SqlSessionFactory factory= new SqlSessionFactoryBuilder().build(is);
        SqlSession session = factory.openSession();
       //List<Dept> list = session.selectList("findAll");
        IDeptDAO mapper = session.getMapper(IDeptDAO.class);


        Dept dept=new Dept();
        dept.setDeptname("478部门");
        dept.setDeptno(2);


                mapper.editDept(dept);
        //增加
        // mapper.addDept(dept);
        session.commit();
         System.out.println("save ok!");
        session.close();

    }

}
