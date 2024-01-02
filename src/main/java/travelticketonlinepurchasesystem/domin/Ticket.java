package travelticketonlinepurchasesystem.domin;

import lombok.*;
import lombok.experimental.FieldDefaults;
import travelticketonlinepurchasesystem.base.domin.BaseEntity;
import travelticketonlinepurchasesystem.domin.enumeration.Gender;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.ManyToOne;
import java.time.LocalDate;

@Entity
@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Ticket extends BaseEntity<Integer> {
      String fullname;
      String gender;
      @ManyToOne
      Trip trip;
      @ManyToOne
      Customer customer;
      LocalDate purchaseData;

}
