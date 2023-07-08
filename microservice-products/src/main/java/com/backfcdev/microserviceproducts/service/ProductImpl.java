package com.backfcdev.microserviceproducts.service;

import com.backfcdev.microserviceproducts.entities.Product;
import com.backfcdev.microserviceproducts.repository.IProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@RequiredArgsConstructor
@Service
public class ProductImpl implements IProductService{
    private final IProductRepository productRepository;
    @Override
    @Transactional(readOnly = true) // de lectura
    public List<Product> findAll() {
        return productRepository.findAll();
    }

    @Override
    @Transactional(readOnly = true) // de lectura
    public Product findById(Long id) {
        return productRepository.findById(id)
                .orElse(null);
    }
}
