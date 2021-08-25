package com.ezticket.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.ezticket.model.Order;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends JpaRepository<Order,Integer> {
}
