package com.sda;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.omg.PortableInterceptor.ObjectReferenceFactory;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderLine {
 int quantity;
  int productId;
  @ManyToOne
    aOrder order;
int orderId;
  @GeneratedValue
  @Id
int orderLineId;

}
