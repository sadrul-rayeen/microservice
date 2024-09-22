package com.adil.product_service.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.adil.product_service.model.Product;

public interface ProductRepository extends MongoRepository<Product, String> {

}
