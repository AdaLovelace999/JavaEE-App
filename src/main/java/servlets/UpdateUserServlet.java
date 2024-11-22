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

@WebServlet("/updateUser/*")
public class UpdateUserServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("views/updateUser.jsp");
        requestDispatcher.forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int id = Integer.parseInt(req.getParameter("id"));
        UserModel userModel = UserModel.getInstance();
        User myUser = userModel.find(id);
        String name = req.getParameter("name");
        String age = req.getParameter("age");
        myUser.setName(name);
        myUser.setAge(Integer.parseInt(age));
        userModel.update(myUser);
        resp.sendRedirect("/users");
    }
}
