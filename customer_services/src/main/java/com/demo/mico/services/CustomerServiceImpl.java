package com.demo.mico.services;

import com.demo.mico.model.Customer;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerServices {
    List<Customer> customerList = List.of(
            new Customer(101,"Maxi","maxi@gmail.com"),
            new Customer(102,"David","david@gmail.com"),
            new Customer(103,"Erix","erix@gmal.com"),
            new Customer(104,"Aron","aron@gmail.com")
            );

    @Override
    public Customer getCustomer(Integer customerId) {
        return customerList.stream().
                filter(e->e.getCustomerId().equals(customerId)).findAny().orElse(null);
    }
}
