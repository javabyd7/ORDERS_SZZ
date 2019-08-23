package com.sda;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.util.List;
import java.util.Set;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor

public class aOrder {
    @Id
    @GeneratedValue
    int orderId;
    @ManyToOne()
    Customer customer;
    int customerId;
    String orderDate;
    String location;

}
