package com.demo.mico.controller;

import com.demo.mico.model.Customer;
import com.demo.mico.services.CustomerServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
@RequestMapping("/customer")
public class CustomerController {
    @Autowired
    private CustomerServices customerServices;

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/{customerId}")
    public Customer getCustomer(@PathVariable("customerId") Integer customerId){
        Customer customer =  this.customerServices.getCustomer(customerId);
       // List product=this.restTemplate.getForObject("http://localhost:9002/product/customer/" + customer.getCustomerId(), List.class);
        List product=this.restTemplate.getForObject("http://product-service/product/customer/" + customer.getCustomerId(), List.class);
        customer.setProductList(product);
        return customer;

    }

}
