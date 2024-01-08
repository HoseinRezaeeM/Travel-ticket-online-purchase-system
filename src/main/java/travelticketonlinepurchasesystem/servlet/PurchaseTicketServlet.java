package travelticketonlinepurchasesystem.servlet;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import travelticketonlinepurchasesystem.domin.Customer;
import travelticketonlinepurchasesystem.domin.Ticket;
import travelticketonlinepurchasesystem.util.ApplicationContex;

import java.io.IOException;
import java.util.List;


@WebServlet("/template/jspfile/purchase")
public class PurchaseTicketServlet extends HttpServlet {
      @Override
      protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
            HttpSession session =req.getSession();
            int customerId = (int) session.getAttribute("idCustomer");
            Customer customer =new Customer(customerId);
             List<Ticket> optionalTrip = ApplicationContex.getTicketServiceImpl()
                    .findListTtripByCustomerId(customer);
             req.setAttribute("purch",optionalTrip);
            RequestDispatcher dispatcher = req.getRequestDispatcher("listTicketPurchased.jsp");
            dispatcher.forward(req, resp);
      }
}
