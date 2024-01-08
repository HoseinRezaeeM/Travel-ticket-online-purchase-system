package travelticketonlinepurchasesystem.servlet;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import travelticketonlinepurchasesystem.domin.Ticket;
import travelticketonlinepurchasesystem.util.ApplicationContex;

import java.io.IOException;
import java.util.Optional;

@WebServlet("/template/jspfile/see")
public class TicketSeeServlet extends HttpServlet {
      @Override
      protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
           int tic = Integer.parseInt(req.getParameter("idTic"));
            HttpSession session =req.getSession();

            Optional<Ticket> ticketOptional = ApplicationContex.getTicketServiceImpl().findById(tic);
            if(ticketOptional.isPresent()){
                  req.setAttribute("optional",ticketOptional);
                  RequestDispatcher dispatcher = req.getRequestDispatcher("tableTicket.jsp");
                  dispatcher.forward(req, resp);
                  session.setAttribute("delid",ticketOptional.get().getId());
                  resp.sendRedirect("del");
            }

      }
}
