package travelticketonlinepurchasesystem.util;



import travelticketonlinepurchasesystem.Service.BankCardService;
import travelticketonlinepurchasesystem.Service.CustomerService;
import travelticketonlinepurchasesystem.Service.TicketService;
import travelticketonlinepurchasesystem.Service.TripService;
import travelticketonlinepurchasesystem.Service.impl.BankCardServiceImpl;
import travelticketonlinepurchasesystem.Service.impl.CustomerServiceImpl;
import travelticketonlinepurchasesystem.Service.impl.TicketServiceImpl;
import travelticketonlinepurchasesystem.Service.impl.TripServiceImpl;
import travelticketonlinepurchasesystem.repository.CustomerRepository;
import travelticketonlinepurchasesystem.repository.BankCardRepository;
import travelticketonlinepurchasesystem.repository.TicketRepository;
import travelticketonlinepurchasesystem.repository.TripRepository;
import travelticketonlinepurchasesystem.repository.impl.BankCardRepositoryImpl;
import travelticketonlinepurchasesystem.repository.impl.CustomerRepositoryImpl;
import travelticketonlinepurchasesystem.repository.impl.TicketRepositoryImpl;
import travelticketonlinepurchasesystem.repository.impl.TripRepositoryImpl;

import javax.persistence.EntityManager;

public class ApplicationContex {
      private static final EntityManager entityManager;
      private static final CustomerRepository customerRepository;
      private static final CustomerService customerService;
      private static final BankCardRepository bankCardRepository;
      private static final BankCardService bankCardService;
      private static final TicketRepository ticketRepository;
      private static final TicketService ticketService;
      private static final TripRepository tripRepository;
      private static final TripService tripService;

      static {
            entityManager = EntityManagerFactoryProvider.getEntityManagerFactory().createEntityManager();
            customerRepository = new CustomerRepositoryImpl(entityManager);
            customerService = new CustomerServiceImpl(customerRepository);
            bankCardRepository = new BankCardRepositoryImpl(entityManager);
            bankCardService = new BankCardServiceImpl(bankCardRepository);
            ticketRepository= new TicketRepositoryImpl(entityManager);
            ticketService = new TicketServiceImpl(ticketRepository);
            tripRepository = new TripRepositoryImpl(entityManager);
            tripService = new TripServiceImpl(tripRepository);
      }

      public static CustomerService getCustomerServiceImpl() {
            return customerService;
      }

      public static TripService getTripServiceImpl() {
            return tripService;
      }

      public static BankCardService getBankCardServiceImpl() {
            return bankCardService;
      }

      public static TicketService getTicketServiceImpl() {
            return ticketService;
      }




}
