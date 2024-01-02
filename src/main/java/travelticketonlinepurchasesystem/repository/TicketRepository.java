package travelticketonlinepurchasesystem.repository;

import travelticketonlinepurchasesystem.base.repository.BaseEntityRepository;
import travelticketonlinepurchasesystem.domin.Customer;
import travelticketonlinepurchasesystem.domin.Ticket;
import travelticketonlinepurchasesystem.domin.Trip;

import java.util.List;

public interface TicketRepository extends BaseEntityRepository<Integer, Ticket> {
      List<Ticket> findListTtripByCustomerId(Customer customer);
}
