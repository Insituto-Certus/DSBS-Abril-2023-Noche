package com.backfcdev.microserviceproducts.service;

import com.backfcdev.microserviceproducts.entities.Product;

import java.util.List;

public interface IProductService {
    List<Product> findAll();
    Product findById (Long id);
}
