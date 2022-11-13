package com.demo.product.controllers;

import com.demo.product.model.Product;
import com.demo.product.services.ProductServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductController {
    @Autowired
    private ProductServices productServices;

    @RequestMapping("/customer/{customerId}")
    public List<Product> getProduct(@PathVariable("customerId") Integer customerId){
        return this.productServices.getProductOfCustomer(customerId);
    }
}
