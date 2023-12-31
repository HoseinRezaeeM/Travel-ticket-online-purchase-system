package travelticketonlinepurchasesystem.repository.impl;

import travelticketonlinepurchasesystem.base.repository.impl.BaseEntityRepositoryImpl;
import travelticketonlinepurchasesystem.domin.Ticket;
import travelticketonlinepurchasesystem.repository.TicketRepository;

import javax.persistence.EntityManager;

public class TicketRepositoryImpl extends BaseEntityRepositoryImpl<Integer, Ticket> implements TicketRepository {
      public TicketRepositoryImpl(EntityManager entityManager) {
            super(entityManager);
      }

      @Override
      public Class<Ticket> getEntityClass() {
            return Ticket.class;
      }
}
