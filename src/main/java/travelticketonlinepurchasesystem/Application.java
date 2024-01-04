package travelticketonlinepurchasesystem;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import travelticketonlinepurchasesystem.domin.Customer;
import travelticketonlinepurchasesystem.domin.Ticket;
import travelticketonlinepurchasesystem.domin.Trip;
import travelticketonlinepurchasesystem.servlet.TicketServlet;
import travelticketonlinepurchasesystem.util.ApplicationContex;
import travelticketonlinepurchasesystem.util.EntityManagerFactoryProvider;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import java.time.LocalDate;
import java.util.List;

public class Application {
      public static void main(String[] args) {
EntityManagerFactoryProvider.getEntityManagerFactory().createEntityManager();
      }
}
