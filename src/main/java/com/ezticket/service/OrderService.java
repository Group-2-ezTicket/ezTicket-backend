package com.ezticket.service;

import com.ezticket.model.Order;
import com.ezticket.repository.OrderRepository;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class OrderService {

    @Resource
    private OrderRepository orderRepository;

    public Order addOrder(Order newOrder){
        return orderRepository.save(newOrder);
    }

    public Order findOrderByOrderId(Integer orderId){
        return orderRepository.findById(orderId).orElse(null);
    }

}
