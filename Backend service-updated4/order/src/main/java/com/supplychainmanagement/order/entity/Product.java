package com.supplychainmanagement.order.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;


@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Product {
    @Id
    @Indexed(unique = true)
    private String productId;
    private String productName;
    private String productType;
    private int productQuantity;
    private double productPrice;

}
