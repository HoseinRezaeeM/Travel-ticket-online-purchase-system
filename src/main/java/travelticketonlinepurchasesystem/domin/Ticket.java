package travelticketonlinepurchasesystem.domin;

import lombok.*;
import lombok.experimental.FieldDefaults;
import travelticketonlinepurchasesystem.base.domin.BaseEntity;
import travelticketonlinepurchasesystem.domin.enumeration.Gender;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.ManyToOne;

@Entity
@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
@ToString
@NoArgsConstructor
public class Ticket extends BaseEntity<Integer> {
      String fullname;
      @Enumerated(value = EnumType.STRING)
      Gender gender;
      @ManyToOne
      Trip trip;
      @ManyToOne
      Customer customer;


}
