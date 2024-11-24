package servlets;

import entities.User;
import models.UserModel;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/addUser")
public class AddUserServlet extends HttpServlet{
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("Title", "Add user");
        req.setAttribute("Header", "Add user");
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("views/addUser.jsp");
        requestDispatcher.forward(req, resp);
    }
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("name");
        String age = req.getParameter("age");
        User user = new User(name, Integer.parseInt(age));
        UserModel userModel = UserModel.getInstance();
        userModel.add(user);
        resp.sendRedirect("/users");
    }
}
