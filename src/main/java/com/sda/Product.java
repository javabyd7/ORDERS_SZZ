package com.sda;

import lombok.Data;

import javax.persistence.Entity;

@Entity
@Data
public class Product {
    int productId;
    String description;
    boolean available;
    float purchasePrice;
    float sellingPrice;


}
