package com.xinzhi.project.servlet;
import com.xinzhi.project.service.ShopCarDao;
import com.xinzhi.project.service.ShopCarDaoImpl;
import com.xinzhi.project.util.ShopCar;
import com.xinzhi.project.util.User;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;

@WebServlet("/list")
public class PageServlet extends HttpServlet {
//    private PageService pageService = new PageServiceImpl();
    private ShopCarDao findAll=new ShopCarDaoImpl();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        String method = req.getParameter("method");
        if (method == null) {
            method = "findAll";
        }
            HttpSession session = req.getSession();
            User user = (User) session.getAttribute("user");
//       流程控制
            switch (method) {
                case "findAll":
//                    String pagestr = req.getParameter("page");
//                    Integer page = Integer.parseInt(pagestr);
                    List<ShopCar> list = findAll.findAll(user.getUser_id());
                    req.setAttribute("list", list);
//                req.setAttribute("user",user);
                    req.getRequestDispatcher("welcome.jsp").forward(req, resp);
                    break;

            }
        }
    }

