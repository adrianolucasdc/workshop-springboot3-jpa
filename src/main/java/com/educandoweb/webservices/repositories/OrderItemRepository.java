package com.educandoweb.webservices.repositories;

import com.educandoweb.webservices.entities.OrderItem;
import com.educandoweb.webservices.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
}
