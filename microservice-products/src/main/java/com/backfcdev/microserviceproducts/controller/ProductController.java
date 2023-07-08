package com.backfcdev.microserviceproducts.controller;

import com.backfcdev.microserviceproducts.entities.Product;
import com.backfcdev.microserviceproducts.service.IProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/products")
public class ProductController {
    private final IProductService productService;
    @Value("${server.port}")
    private Integer port;

    @GetMapping
    @ResponseBody
    ResponseEntity<List<Product>> findAll(){
        List<Product> products = productService.findAll()
                .stream()
                .map(product -> {
                    product.setPort(port);
                    return product;
                }).collect(Collectors.toList());
        return ResponseEntity.ok(products);
    }

    @GetMapping("/{id}")
    ResponseEntity<Product> findById(@PathVariable Long id){
        Product product = productService.findById(id);
        product.setPort(port);
        return ResponseEntity.ok(product);
    }
}
