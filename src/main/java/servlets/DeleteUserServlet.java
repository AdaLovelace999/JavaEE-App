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

@WebServlet("/deleteUser/*")
public class DeleteUserServlet  extends HttpServlet {
    private UserModel userModel;

    @Override
    public void init() {
        userModel = UserModel.getInstance();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int id = Integer.parseInt(req.getParameter("id"));
        User user = userModel.find(id);
        req.setAttribute("user", user);
        userModel.delete(user);
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("views/deleteUser.jsp");
        requestDispatcher.forward(req, resp);
    }

}
