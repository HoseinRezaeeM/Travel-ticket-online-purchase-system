package travelticketonlinepurchasesystem.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import travelticketonlinepurchasesystem.domin.Customer;
import travelticketonlinepurchasesystem.util.ApplicationContex;

import java.io.IOException;
import java.util.Optional;

@WebServlet("/register")
public class RegisterSerlvlet extends HttpServlet {
      @Override
      protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {


            String firstname = req.getParameter("firstname");
            String lastname= req.getParameter("lastname");
            String nationalCode = req.getParameter("nationalCode");
            String mobileNumber = req.getParameter("mobileNumber");
            Customer customer =new Customer(firstname,lastname,nationalCode,mobileNumber);
            final Customer save = ApplicationContex.getCustomerServiceImpl().save(customer);
            final Optional<Customer> customerOptional = ApplicationContex.getCustomerServiceImpl().findById(save.getId());
            if(customerOptional.isPresent()){
                  resp.sendRedirect("login.jsp");
            }
            else{
                  resp.sendRedirect("register.jsp");
            }

      }
}
