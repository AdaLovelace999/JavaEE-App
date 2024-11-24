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
    private UserModel userModel;
    private User user;

    @Override
    public void init() {
        userModel = UserModel.getInstance();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int id = Integer.parseInt(req.getParameter("id"));
        user = userModel.find(id);  // Получаем сущность, которую хотим изменить.
        req.setAttribute("user", user);  // Передаём её на JSP.
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("views/updateUser.jsp");
        requestDispatcher.forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("name");
        int age = Integer.parseInt(req.getParameter("age"));
        user.setName(name);
        user.setAge(age);
        userModel.update(user); // Получаем изменённую сущность и записываем её в БД.
        resp.sendRedirect("/users");
    }
}
