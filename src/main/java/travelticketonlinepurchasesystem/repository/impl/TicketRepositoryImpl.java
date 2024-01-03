package travelticketonlinepurchasesystem.repository.impl;

import travelticketonlinepurchasesystem.base.repository.impl.BaseEntityRepositoryImpl;
import travelticketonlinepurchasesystem.domin.Customer;
import travelticketonlinepurchasesystem.domin.Ticket;
import travelticketonlinepurchasesystem.domin.Trip;
import travelticketonlinepurchasesystem.repository.TicketRepository;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import java.util.List;
import java.util.Optional;

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

      @Override
      public Optional<Ticket> findTicketByTicketId(int id) {
            try {
                  return Optional.ofNullable(
                         entityManager.createQuery("FROM Ticket t FULL JOIN Trip tr on t.trip.id=tr.id"
                                                   + " where t.id=:id ", Ticket.class)
                                .setParameter("id", id)
                                .getSingleResult());
            } catch (NoResultException e) {
                  return Optional.empty();
            }
      }
}
