package cn.happy.servlet;

import cn.happy.entity.UserInfo;
import cn.happy.service.IUserInfoService;
import cn.happy.service.impl.UserinfoServiceimpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * Created by adminastrator on 2017/9/20.
 */

public class UserInfoServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //1.解决乱码
        request.setCharacterEncoding("utf-8");
        //2、调度service
        IUserInfoService service = new UserinfoServiceimpl();
        //action
        String action = request.getParameter("action");
        if ("list".equals(action)) {
            //3调度方法
            UserInfo info = new UserInfo();
            String userCode = request.getParameter("userCode");
            String pwd = request.getParameter("pwd");
            info.setUserCode(userCode);
            info.setUserPassword(pwd);
            System.out.println(userCode + "=====" + pwd);
            UserInfo user = service.isLogin(info);
            if (user!= null) {
                request.getRequestDispatcher("/welcome.jsp").forward(request, response);
            } else {
                response.sendRedirect("/login.jsp");
            }
        }
    }
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
     doPost(request,response);
    }
}
