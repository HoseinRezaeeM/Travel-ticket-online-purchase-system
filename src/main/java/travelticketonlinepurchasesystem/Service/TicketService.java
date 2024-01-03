package travelticketonlinepurchasesystem.Service;

import travelticketonlinepurchasesystem.base.service.BaseEntityService;
import travelticketonlinepurchasesystem.domin.Customer;
import travelticketonlinepurchasesystem.domin.Ticket;
import travelticketonlinepurchasesystem.domin.Trip;

import java.util.List;
import java.util.Optional;

public interface TicketService extends BaseEntityService<Integer, Ticket> {
      List<Ticket> findListTtripByCustomerId(Customer customer);
      Optional<Ticket> findTicketByTicketId(int id);
}


