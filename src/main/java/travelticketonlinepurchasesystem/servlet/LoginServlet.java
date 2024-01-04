package travelticketonlinepurchasesystem.servlet;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import travelticketonlinepurchasesystem.domin.Customer;
import travelticketonlinepurchasesystem.util.ApplicationContex;

import java.io.IOException;

import java.util.Optional;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
      @Override
      protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
            String username = req.getParameter("username");
            String password =req.getParameter("password");

            final Optional<Customer> login = ApplicationContex.getCustomerServiceImpl().login(username, password);
            HttpSession session =req.getSession();

            if(login.isPresent()){
                  RequestDispatcher dispatcher = req.getRequestDispatcher("travel.jsp");
                  dispatcher.forward(req, resp);
                  session.setAttribute("idCustomer",login.get().getId());
                  resp.sendRedirect("purchase");
                  resp.sendRedirect("see");
            }else{
                  RequestDispatcher dispatcher = req.getRequestDispatcher("register.jsp");
                  dispatcher.forward(req, resp);
            }

      }
}
