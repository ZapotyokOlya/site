package by.itacademy.servlet;

import by.itacademy.service.CarService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/description")
public class CarServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("price", new CarService().getAveragePrice() + "$");
        req.getRequestDispatcher("/WEB-INF/jsp/description.jsp")
                .forward(req, resp);
    }
}
