package com.xinzhi.project.servlet;

import com.xinzhi.project.service.login;
import com.xinzhi.project.service.logindaoimpl;
import com.xinzhi.project.util.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/login")
public class loginservlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username=req.getParameter("username");
        String userpwd=req.getParameter("password");
        login  login=new logindaoimpl();
        login.login(username,userpwd);
        User user=login.login(username,userpwd);
        if (user.getUsername()!=null) {
            HttpSession session = req.getSession();
            session.setAttribute("user", username);
            resp.sendRedirect("/list");
        }else{
            resp.sendRedirect("login.jsp");
            PrintWriter writer=resp.getWriter();
            writer.write("登录信息有误,请检查后登录");
        }

    }
}
