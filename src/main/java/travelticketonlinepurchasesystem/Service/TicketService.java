package travelticketonlinepurchasesystem.Service;

import travelticketonlinepurchasesystem.base.service.BaseEntityService;
import travelticketonlinepurchasesystem.domin.Customer;
import travelticketonlinepurchasesystem.domin.Ticket;
import travelticketonlinepurchasesystem.domin.Trip;

import java.util.List;

public interface TicketService extends BaseEntityService<Integer, Ticket> {
      List<Ticket> findListTtripByCustomerId(Customer customer);
}


