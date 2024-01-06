package baseentityrepositorytest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import travelticketonlinepurchasesystem.domin.Customer;
import travelticketonlinepurchasesystem.util.ApplicationContex;
import travelticketonlinepurchasesystem.util.EntityManagerFactoryProvider;

import javax.persistence.EntityManager;
import java.util.Collection;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

      class BaseEntityRepositoryImplTest {

            EntityManager entityManager;

            @BeforeEach
            void createObject() {
                  entityManager = EntityManagerFactoryProvider.getEntityManagerFactory().createEntityManager();
            }

            @Test
            void save() {
                  Customer employee = new Customer("Hosein", "Rezaei", "25", "HRRB",  new byte[11]);
                  final var save = ApplicationContex.getCustomerServiceImpl().save(employee);
                  Optional<Customer> contains = ApplicationContex.getCustomerServiceImpl().findById(save.getId());
                  assertTrue(contains.isPresent());
            }

            @Test
            void update() {
                  Customer employee = new Customer();
                 Customer newEmployee =new Customer("Hassan", "Rezaei", "25", "HRRB", new byte[11]);
                  newEmployee.setFirstname("Hassan");
                  ApplicationContex.getCustomerServiceImpl().update(newEmployee);
                  final Optional<Customer> optionalEmployee = ApplicationContex.getCustomerServiceImpl().findById(64);
                  Assertions
                         .assertEquals(newEmployee.getFirstname(),optionalEmployee.get().getFirstname());
            }

            @Test
            void deleteById() {
                  ApplicationContex.getCustomerServiceImpl().deleteById(74);
                  final Optional<Customer> optionalCustomer = ApplicationContex.getCustomerServiceImpl().findById(63);
                  Assertions.assertTrue(optionalCustomer.isEmpty());
            }

            @Test
            void findAll() {
                  final Collection<Customer> all = ApplicationContex.getCustomerServiceImpl().findAll();
                  Assertions.assertNotNull(all);
            }
      }
