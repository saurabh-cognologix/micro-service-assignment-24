package com.demo.product.services;

import com.demo.product.model.Product;

import java.util.List;

public interface ProductServices {
    public List<Product> getProductOfCustomer(Integer productId);
}
