package travelticketonlinepurchasesystem.Service.impl;

import travelticketonlinepurchasesystem.Service.TicketService;
import travelticketonlinepurchasesystem.base.service.impl.BaseEntityServiceImpl;
import travelticketonlinepurchasesystem.domin.Customer;
import travelticketonlinepurchasesystem.domin.Ticket;
import travelticketonlinepurchasesystem.domin.Trip;
import travelticketonlinepurchasesystem.repository.TicketRepository;

import java.util.List;

public class TicketServiceImpl extends BaseEntityServiceImpl<Integer, Ticket, TicketRepository> implements TicketService {
      public TicketServiceImpl(TicketRepository baseRepository) {
            super(baseRepository);
      }

      @Override
      public List<Ticket> findListTtripByCustomerId(Customer customer) {
            return baseRepository.findListTtripByCustomerId(customer);
      }
}
