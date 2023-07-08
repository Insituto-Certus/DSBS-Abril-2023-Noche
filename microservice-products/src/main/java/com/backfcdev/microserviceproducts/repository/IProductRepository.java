package com.backfcdev.microserviceproducts.repository;

import com.backfcdev.microserviceproducts.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IProductRepository extends JpaRepository<Product, Long> {
}
