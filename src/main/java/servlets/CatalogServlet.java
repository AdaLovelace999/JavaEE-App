package servlets;

import entities.Product;
import models.ProductModel;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;


@WebServlet("/catalog")
public class CatalogServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setAttribute("Title", "Catalog");
        request.setAttribute("Header", "Catalog");
        ProductModel productModel = ProductModel.getInstance();
        List<String> products = productModel.list();
        request.setAttribute("products", products);
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("views/catalog.jsp");
        requestDispatcher.forward(request, response);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("name");
        String price = request.getParameter("price");
        Product product = new Product(name, Integer.parseInt(price));
        ProductModel productModel = ProductModel.getInstance();
        productModel.add(product);
        doGet(request, response);

    }
}
