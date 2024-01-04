package travelticketonlinepurchasesystem.servlet;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import travelticketonlinepurchasesystem.Application;
import travelticketonlinepurchasesystem.domin.Trip;
import travelticketonlinepurchasesystem.util.ApplicationContex;

import java.io.IOException;
import java.time.LocalDate;
import java.util.List;

@WebServlet("/trip")
public class TripServlet extends HttpServlet {
      @Override
      protected void doGet(HttpServletRequest request
             , HttpServletResponse response) throws ServletException, IOException {
            String vehicleType = request.getParameter("vehicleType");
            String origin = request.getParameter("origin");
            String destination = request.getParameter("destination");
            LocalDate startDate = LocalDate.parse(request.getParameter("startDate"));
            List<Trip> tripsList = ApplicationContex.getTripServiceImpl()
                   .findTripBystartAndEndAndstartDate(origin, destination, vehicleType, startDate);

            request.setAttribute("tripsList", tripsList);
            RequestDispatcher dispatcher = request.getRequestDispatcher("table.jsp");
            dispatcher.forward(request, response);

            HttpSession session = request.getSession();
            session.setAttribute("idTrip", tripsList.get(0).getId());
            response.sendRedirect("ticket");

      }
}
