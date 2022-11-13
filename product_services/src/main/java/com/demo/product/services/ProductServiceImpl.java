package com.demo.product.services;

import com.demo.product.model.Product;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProductServiceImpl implements ProductServices{

    List<Product> productList = List.of(
            new Product(201,"Dairy Milk","Chocolate Bar",101),
            new Product(202,"Pears","Soap",102),
            new Product(203,"JBL Go 3","Sound System",104),
            new Product(204,"Milton X345","Water Bottle",103),
            new Product(205,"Pentonic B-RT","Ball Pen",101)
    );

    @Override
    public List<Product> getProductOfCustomer(Integer customerId) {
        return this.productList.stream().filter(e->e.getCustomerId().equals(customerId)).collect(Collectors.toList());
    }
}
