package model;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "ServletCalculator", value = "/ServletCalculator")
public class ServletCalculator extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter writer = response.getWriter();
        double numberA = Double.parseDouble(request.getParameter("numberA"));
        double numberB = Double.parseDouble(request.getParameter("numberB"));
        String operator = request.getParameter("select");
        Calculator calculator = new Calculator(numberA, numberB);
        double result = 0;
        try {
            switch (operator) {
                case "sum":
                    result = calculator.sum();
                    break;
                case "sub":
                    result = calculator.subtraction();
                    break;
                case "mul":
                    result = calculator.multiplication();
                    break;
                case "div": {
                    result = calculator.division();
                }
            }
        } catch (NumberFormatException e) {
            result = Integer.MAX_VALUE;
            request.setAttribute("result", result);
            writer.println("<h1>error</h1>");
            return;
        }
        request.setAttribute("result", result);
        RequestDispatcher dispatcher = request.getRequestDispatcher("calculator.jsp");
        dispatcher.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
