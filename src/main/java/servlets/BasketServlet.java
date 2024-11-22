package servlets;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet("/basket")
public class BasketServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setAttribute("Title", "Basket");
        request.setAttribute("Header", "Basket");
        String path = "/views/basket.jsp";
        getServletContext().getRequestDispatcher(path).forward(request, response);
    }
}
