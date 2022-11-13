package com.demo.product.model;

import lombok.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Product {
    private Integer productId;
    private String productName;
    private String productDetails;
    private Integer customerId;
}
