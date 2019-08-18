package com.sda;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor

public class Order {
    @Id
    @GeneratedValue
    int orderId;
    @ManyToOne()
    int customerId;
    String orderDate;
    String location;

}
