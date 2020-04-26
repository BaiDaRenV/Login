package com.xinzhi.project.servlet;

import com.xinzhi.project.service.register;
import com.xinzhi.project.service.registerImpl;
import com.xinzhi.project.util.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/register")
public class registerservlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       req.setCharacterEncoding("UTF-8");
        String name=req.getParameter("username");
        String pwd=req.getParameter("password");
        String address=req.getParameter("address");
        register re= new registerImpl();
        if (!name.equals("")&&!pwd.equals("")&&!address.equals("")) {
            if (re.register(name, pwd, address)) {
                resp.sendRedirect("login.jsp");
            }
        }else{
            resp.sendRedirect("register.jsp");
        }
    }
}
