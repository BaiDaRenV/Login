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

@WebServlet("/quchong")
public class quchongservlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username=req.getParameter("user");
        register r=new registerImpl();
        User user = r.queryByname(username);
        if (user.getUsername()!=null){
            resp.getWriter().write('0');
        }else {
            resp.getWriter().write('1');
        }
    }
}
