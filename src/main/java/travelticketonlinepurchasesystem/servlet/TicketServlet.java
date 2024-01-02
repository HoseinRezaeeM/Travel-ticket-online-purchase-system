package travelticketonlinepurchasesystem.servlet;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import travelticketonlinepurchasesystem.domin.Customer;
import travelticketonlinepurchasesystem.domin.Ticket;
import travelticketonlinepurchasesystem.domin.Trip;
import travelticketonlinepurchasesystem.util.ApplicationContex;

import java.io.IOException;
import java.time.LocalDate;

@WebServlet("/ticket")
public class TicketServlet extends HttpServlet {
      private static final Logger logger = LogManager.getLogger(TicketServlet.class);
//      static {
//            System.setProperty("log4j.configurationFile", "log4j2.xml");
//      }


      @Override
      protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
            String mobileNumber = req.getParameter("mobileNumber");
            String fullname = req.getParameter("fullname");
            String gender = req.getParameter("gender");
            HttpSession session = req.getSession();
            int idTrip = (int) session.getAttribute("idTrip");
            Trip trip =new Trip(idTrip);
            var optionalCustomer = ApplicationContex.getCustomerServiceImpl().findByMobileNumber(mobileNumber);

            if(optionalCustomer.isPresent()){
                  Customer customer =new Customer(optionalCustomer.get().getId());
                  Ticket ticket =new Ticket(fullname,gender,trip,customer, LocalDate.now());
                  Ticket ticketBuy = ApplicationContex.getTicketServiceImpl().save(ticket);
                  logger.info("  Ticket  : " + ticketBuy);



                  req.setAttribute("ticketBuy",ticketBuy);
                  RequestDispatcher dispatcher = req.getRequestDispatcher("sucess.jsp");
                  dispatcher.forward(req, resp);
            }else {
                  RequestDispatcher dispatcher = req.getRequestDispatcher("register.jsp");
                  dispatcher.forward(req, resp);

            }
      }
}
