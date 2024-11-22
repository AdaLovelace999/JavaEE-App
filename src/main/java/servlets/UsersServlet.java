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
import java.util.List;

@WebServlet("/users")
public class UsersServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("Title", "Users");
        req.setAttribute("Header", "Users");
        UserModel userModel = UserModel.getInstance();
        List<User> users = userModel.listUsers();
        req.setAttribute("users", users);
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("views/users.jsp");
        requestDispatcher.forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("name");
        String age = req.getParameter("age");
        User user = new User(name, Integer.parseInt(age));
        UserModel userModel = UserModel.getInstance();
        userModel.add(user);
        doGet(req, resp);
    }
}
