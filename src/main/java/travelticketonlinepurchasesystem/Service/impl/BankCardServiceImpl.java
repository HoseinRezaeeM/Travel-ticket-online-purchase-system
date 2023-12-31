package travelticketonlinepurchasesystem.Service.impl;

import travelticketonlinepurchasesystem.Service.BankCardService;
import travelticketonlinepurchasesystem.base.service.impl.BaseEntityServiceImpl;
import travelticketonlinepurchasesystem.domin.BankCard;
import travelticketonlinepurchasesystem.repository.BankCardRepository;

public class BankCardServiceImpl extends BaseEntityServiceImpl<Integer, BankCard, BankCardRepository> implements BankCardService {
      public BankCardServiceImpl(BankCardRepository baseRepository) {
            super(baseRepository);
      }
}
