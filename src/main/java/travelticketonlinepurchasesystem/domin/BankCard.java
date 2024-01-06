package travelticketonlinepurchasesystem.domin;

import lombok.*;
import lombok.experimental.FieldDefaults;
import travelticketonlinepurchasesystem.base.domin.BaseEntity;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import java.time.LocalDate;

@Entity
@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
@NoArgsConstructor
@AllArgsConstructor

public class BankCard extends BaseEntity<Integer> {
      String numberCard;
      String cvv2;
      String password;
      LocalDate expirationDate;
      @ManyToOne
      Customer customer;
}
