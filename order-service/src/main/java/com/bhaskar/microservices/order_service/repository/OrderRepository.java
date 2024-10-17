package com.bhaskar.microservices.order_service.repository;

import com.bhaskar.microservices.order_service.model.Order;
import io.micrometer.observation.annotation.Observed;
import org.springframework.data.jpa.repository.JpaRepository;

@Observed
public interface OrderRepository extends JpaRepository<Order, Long> {
}
