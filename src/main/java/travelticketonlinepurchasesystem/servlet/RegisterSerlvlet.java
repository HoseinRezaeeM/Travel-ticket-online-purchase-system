package travelticketonlinepurchasesystem.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.MultipartConfig;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.Part;
import org.apache.commons.compress.utils.IOUtils;
import travelticketonlinepurchasesystem.domin.Customer;
import travelticketonlinepurchasesystem.util.ApplicationContex;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Optional;

@WebServlet("/template/jspfile/register")
@MultipartConfig
public class RegisterSerlvlet extends HttpServlet {
      @Override
      protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

            String firstname = req.getParameter("firstname");
            String lastname = req.getParameter("lastname");
            String nationalCode = req.getParameter("nationalCode");
            String mobileNumber = req.getParameter("mobileNumber");

            Part filePart = req.getPart("pic");  //Add image
            InputStream fileContent = filePart.getInputStream();

            Customer customer = new Customer(firstname, lastname, nationalCode, mobileNumber, IOUtils.toByteArray(fileContent));
            final Customer save = ApplicationContex.getCustomerServiceImpl().save(customer);
            saveImageToFile(save.getPhotoIdCard(), "C:\\Users\\sp\\IdeaProjects\\travel-ticket-online-purchase\\src\\main\\webapp\\uploaded\\uploaded.jpg");

            final Optional<Customer> customerOptional = ApplicationContex.getCustomerServiceImpl().findById(save.getId());
            if (customerOptional.isPresent()) {
                  resp.sendRedirect("login.jsp");
            } else {
                  resp.sendRedirect("register.jsp");
            }

      }


      public static void saveImageToFile(byte[] imageBytes, String filePath) {
            try (FileOutputStream fileOutputStream = new FileOutputStream(filePath)) {
                  fileOutputStream.write(imageBytes);
            } catch (IOException e) {
                  e.printStackTrace();
            }
      }
}
