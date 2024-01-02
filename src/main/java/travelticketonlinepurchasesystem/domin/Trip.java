package travelticketonlinepurchasesystem.domin;

import lombok.*;
import lombok.experimental.FieldDefaults;
import travelticketonlinepurchasesystem.base.domin.BaseEntity;
import travelticketonlinepurchasesystem.domin.enumeration.TicketType;

import javax.persistence.Entity;
import javax.persistence.Enumerated;
import java.time.LocalDate;
import java.time.LocalTime;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@ToString
public class Trip extends BaseEntity<Integer> {
      LocalDate startDate;
      LocalTime startTime;
      String origin;
      String destination;
      String vehicleType;


      public Trip(Integer integer) {
            super(integer);
      }


}
