package com.sda;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.Set;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Customer {

    @Id
    @GeneratedValue
    int customerId;
    @OneToMany(mappedBy = "customer")
    Set<aOrder> orders;

    String firstName;
    String lastName;
    String country;
    String city;
    String postalCode;
    String Street;
    String houseNumber;

}
