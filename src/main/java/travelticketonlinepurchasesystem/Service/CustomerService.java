package travelticketonlinepurchasesystem.Service;

import travelticketonlinepurchasesystem.base.service.BaseEntityService;
import travelticketonlinepurchasesystem.domin.Customer;

import java.util.Optional;

public interface CustomerService extends BaseEntityService<Integer, Customer> {
      public Optional<Customer> login(String username, String password);
}
