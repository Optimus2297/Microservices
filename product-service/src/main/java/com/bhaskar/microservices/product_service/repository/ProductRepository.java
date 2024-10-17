package com.bhaskar.microservices.product_service.repository;

import com.bhaskar.microservices.product_service.model.Product;
import io.micrometer.observation.annotation.Observed;
import org.springframework.data.mongodb.repository.MongoRepository;

@Observed
public interface ProductRepository extends MongoRepository<Product, String> {
}
