package com.sda;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderLine {
 int quantity;
  int productid;
  @ManyToOne
int orderId;
int orderLineId;

}
