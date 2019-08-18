package com.sda;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Customer {
    @OneToMany(mappedBy = "orders")
    @Id
    @GeneratedValue
    int custormerId;
    String firstName;
    String lastName;
    String country;
    String city;
    String postalCode;
    String Street;
    String houseNumber;

}
