package travelticketonlinepurchasesystem.Service.impl;

import travelticketonlinepurchasesystem.Service.TicketService;
import travelticketonlinepurchasesystem.base.service.impl.BaseEntityServiceImpl;
import travelticketonlinepurchasesystem.domin.Ticket;
import travelticketonlinepurchasesystem.repository.TicketRepository;

public class TicketServiceImpl extends BaseEntityServiceImpl<Integer, Ticket, TicketRepository> implements TicketService {
      public TicketServiceImpl(TicketRepository baseRepository) {
            super(baseRepository);
      }
}
