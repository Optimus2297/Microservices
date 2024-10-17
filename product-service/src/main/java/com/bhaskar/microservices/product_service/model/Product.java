package com.bhaskar.microservices.product_service.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;

@Document(value ="product")
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
public class Product {
    @Id
    private String id;
    private String name;
    private String description;
    private String skuCode;
    private BigDecimal price;
}
