package servlets;
import entities.Product;
import models.ProductModel;

import java.io.PrintWriter;
import java.util.concurrent.CopyOnWriteArrayList;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.util.List;
import entities.User;


@WebServlet("/")
public class HomeServlet extends HttpServlet{


    @Override
    public void init() throws ServletException {

    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {


    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }
}
