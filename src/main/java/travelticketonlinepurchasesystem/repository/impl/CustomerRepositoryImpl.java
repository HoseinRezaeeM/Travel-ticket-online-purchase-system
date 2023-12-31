package travelticketonlinepurchasesystem.repository.impl;

import travelticketonlinepurchasesystem.base.repository.impl.BaseEntityRepositoryImpl;
import travelticketonlinepurchasesystem.domin.Customer;
import travelticketonlinepurchasesystem.repository.CustomerRepository;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import java.util.Optional;

public class CustomerRepositoryImpl extends BaseEntityRepositoryImpl<Integer, Customer> implements CustomerRepository {
      public CustomerRepositoryImpl(EntityManager entityManager) {
            super(entityManager);
      }

      @Override
      public Class<Customer> getEntityClass() {
            return Customer.class;
      }
      @Override
      public Optional<Customer> login(String username, String password) {
            try {
                  return Optional.ofNullable(
                         entityManager.createQuery("SELECT s FROM Customer s"
                                                   + " where s.username =: username AND s.password =: password", Customer.class)
                                .setParameter("username", username)
                                .setParameter("password", password)
                                .getSingleResult());
            } catch (NoResultException e) {
                  return Optional.empty();
            }
      }
}
