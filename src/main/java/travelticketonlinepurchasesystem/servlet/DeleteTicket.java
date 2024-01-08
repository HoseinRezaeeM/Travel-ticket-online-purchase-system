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

@WebServlet("/template/jspfile/del")
public class DeleteTicket extends HttpServlet {
      @Override
      protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
            HttpSession session = req.getSession();
            int delid = (int) session.getAttribute("delid");
            ApplicationContex.getTicketServiceImpl().deleteById(delid);
            Optional<Ticket> id = ApplicationContex.getTicketServiceImpl().findById(delid);
            if(id.isEmpty()){
                  RequestDispatcher dispatcher = req.getRequestDispatcher("deletesucess.jsp");
                  dispatcher.forward(req, resp);
            }

      }
}
