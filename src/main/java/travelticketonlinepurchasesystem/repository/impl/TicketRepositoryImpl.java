package travelticketonlinepurchasesystem.repository.impl;

import travelticketonlinepurchasesystem.base.repository.impl.BaseEntityRepositoryImpl;
import travelticketonlinepurchasesystem.domin.Customer;
import travelticketonlinepurchasesystem.domin.Ticket;
import travelticketonlinepurchasesystem.domin.Trip;
import travelticketonlinepurchasesystem.repository.TicketRepository;

import javax.persistence.EntityManager;
import java.util.List;
@SuppressWarnings("unchecked")
public class TicketRepositoryImpl extends BaseEntityRepositoryImpl<Integer, Ticket> implements TicketRepository {
      public TicketRepositoryImpl(EntityManager entityManager) {
            super(entityManager);
      }

      @Override
      public Class<Ticket> getEntityClass() {
            return Ticket.class;
      }

      @Override
      public List<Ticket> findListTtripByCustomerId(Customer customer) {
            return entityManager
                   .createQuery("from Ticket t WHERE t.customer=:customer")
                   .setParameter("customer",customer)
                   .getResultList();
      }
}
