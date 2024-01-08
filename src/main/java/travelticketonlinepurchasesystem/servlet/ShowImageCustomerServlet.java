package travelticketonlinepurchasesystem.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import travelticketonlinepurchasesystem.util.ApplicationContex;

import java.io.IOException;
import java.io.OutputStream;

@WebServlet("/template/jspfile/image")
public class ShowImageCustomerServlet extends HttpServlet {
      protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

            String imageId = request.getParameter("id");

            try {
                  final var byId = ApplicationContex.getCustomerServiceImpl().findById(Integer.valueOf(imageId));
                  OutputStream outputStream = response.getOutputStream();
                  outputStream.write(byId.get().getPhotoIdCard());
                  outputStream.flush();
            } catch (Exception e) {
                  e.printStackTrace();

            }
      }

}