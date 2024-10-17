package com.bhaskar.microservices.product_service.service;

import com.bhaskar.microservices.product_service.dto.ProductRequest;
import com.bhaskar.microservices.product_service.dto.ProductResponse;
import com.bhaskar.microservices.product_service.model.Product;
import com.bhaskar.microservices.product_service.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
public class ProductService {

    private final ProductRepository productRepository;

    public ProductResponse createProduct(ProductRequest productRequest){
        Product product = Product.builder()
                .name(productRequest.name())
                .description(productRequest.description())
                .skuCode(productRequest.skuCode())
                .price(productRequest.price())
                .build();
        productRepository.save(product);
        log.info("Product created Successfully");
        return new ProductResponse(product.getId(), product.getName(), product.getDescription(), product.getSkuCode(), product.getPrice());
    }

    public List<ProductResponse> getAllProducts(){
        return productRepository.findAll()
                .stream().map(p-> new ProductResponse(p.getId(), p.getName(),p.getDescription(), p.getSkuCode(), p.getPrice()))
                .toList();
    }
}

