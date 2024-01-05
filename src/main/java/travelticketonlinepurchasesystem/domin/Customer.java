package travelticketonlinepurchasesystem.domin;

import lombok.*;
import lombok.experimental.FieldDefaults;
import travelticketonlinepurchasesystem.base.domin.BaseEntity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Lob;

import static travelticketonlinepurchasesystem.util.PasswordGenerator.generatePassword;

@Entity
@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
@ToString
@NoArgsConstructor
public class Customer extends BaseEntity<Integer> {
      String firstname;
      String lastname;
      String nationalCode;
      String mobileNumber;
      String username;
      String password;
      @Lob
      byte[] photoIdCard;


      public Customer(String firstname, String lastname, String nationalCode, String mobileNumber,byte[] photoIdCard) {
            this.firstname = firstname;
            this.lastname = lastname;
            this.nationalCode = nationalCode;
            this.mobileNumber = mobileNumber;
            this.username = mobileNumber;
            this.photoIdCard =photoIdCard;
            this.password = generatePassword();
      }

      public Customer(Integer integer) {
            super(integer);
      }
}
