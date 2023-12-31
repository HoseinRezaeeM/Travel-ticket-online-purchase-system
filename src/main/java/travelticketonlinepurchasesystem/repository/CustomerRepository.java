package travelticketonlinepurchasesystem.repository;

import travelticketonlinepurchasesystem.base.repository.BaseEntityRepository;
import travelticketonlinepurchasesystem.domin.Customer;

import java.util.Optional;

public interface CustomerRepository extends BaseEntityRepository<Integer, Customer> {
      public Optional<Customer> login(String username, String password);
}
