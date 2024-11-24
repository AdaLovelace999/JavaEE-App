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

@WebServlet("/userMoreInfo/*")
public class UserMoreInfoServlet extends HttpServlet {
    private UserModel userModel;

    @Override
    public void init() {
        userModel = UserModel.getInstance();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int id = Integer.parseInt(req.getParameter("id"));
        User user = userModel.find(id); // Получаем конкретного юзера
        req.setAttribute("user", user); // и передаём через атрибут на JSP.
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("views/userMoreInfo.jsp");
        requestDispatcher.forward(req, resp);
    }
}
