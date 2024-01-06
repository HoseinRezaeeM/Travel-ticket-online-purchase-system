package travelticketonlinepurchasesystem.repository.impl;

import travelticketonlinepurchasesystem.base.repository.impl.BaseEntityRepositoryImpl;
import travelticketonlinepurchasesystem.domin.BankCard;
import travelticketonlinepurchasesystem.repository.BankCardRepository;

import javax.persistence.EntityManager;

public class BankCardRepositoryImpl extends BaseEntityRepositoryImpl<Integer, BankCard> implements BankCardRepository {
      public BankCardRepositoryImpl(EntityManager entityManager) {
            super(entityManager);
      }

      @Override
      public Class<BankCard> getEntityClass() {
            return BankCard.class;
      }
}
