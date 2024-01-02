package travelticketonlinepurchasesystem.Service.impl;

import travelticketonlinepurchasesystem.Service.CustomerService;
import travelticketonlinepurchasesystem.base.service.impl.BaseEntityServiceImpl;
import travelticketonlinepurchasesystem.domin.Customer;
import travelticketonlinepurchasesystem.repository.CustomerRepository;

import java.util.Optional;

public class CustomerServiceImpl extends BaseEntityServiceImpl<Integer, Customer, CustomerRepository> implements CustomerService {
      public CustomerServiceImpl(CustomerRepository baseRepository) {
            super(baseRepository);
      }

      @Override
      public Optional<Customer> login(String username, String password) {
            return baseRepository.login(username,password);
      }

      @Override
      public Optional<Customer> findByMobileNumber(String mobileNumber) {
            return baseRepository.findByMobileNumber(mobileNumber);
      }
}
