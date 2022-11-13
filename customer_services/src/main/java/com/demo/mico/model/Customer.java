package com.demo.mico.model;

import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Customer {
    private Integer customerId;
    private String customerName;
    private String customerEmail;
    List<Product> productList = new ArrayList();

    public Customer(Integer customerId, String customerName, String customerEmail) {
        this.customerId = customerId;
        this.customerName = customerName;
        this.customerEmail = customerEmail;
    }
}
