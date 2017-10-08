package cn.happy.util;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import javax.annotation.Resource;
import java.io.IOException;
import java.io.InputStream;

/**
 * Created by adminastrator on 2017/9/19.
 */
public class MybatisUtil {
    static String resouce="mybatis-config.xml";
    static InputStream is;
    static SqlSessionFactory  factory;
    static{
        try{
            is= Resources.getResourceAsStream(resouce);
            factory= new SqlSessionFactoryBuilder().build(is);
        }catch (IOException e){
            e.printStackTrace();
        }
    }


     public static SqlSession getSession(){
         return factory.openSession();



      }

}
