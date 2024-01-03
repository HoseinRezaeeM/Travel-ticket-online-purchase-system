package travelticketonlinepurchasesystem.repository;

import travelticketonlinepurchasesystem.base.repository.BaseEntityRepository;
import travelticketonlinepurchasesystem.domin.Customer;
import travelticketonlinepurchasesystem.domin.Ticket;
import travelticketonlinepurchasesystem.domin.Trip;

import java.util.List;
import java.util.Optional;

public interface TicketRepository extends BaseEntityRepository<Integer, Ticket> {
      List<Ticket> findListTtripByCustomerId(Customer customer);
      Optional<Ticket> findTicketByTicketId(int id);
}
