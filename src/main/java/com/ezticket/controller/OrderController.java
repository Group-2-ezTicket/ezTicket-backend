package com.ezticket.controller;


import com.ezticket.model.Order;
import com.ezticket.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/orders")
public class OrderController {
    @Autowired
    private OrderService orderService;

    @PostMapping
    public Order addOrder(@RequestBody Order newOrder){
        return orderService.addOrder(newOrder);
    }

    @GetMapping("/{orderId}")
    public Order getOrderByOrderId(@PathVariable Integer orderId){
        return orderService.findOrderByOrderId(orderId);
    }


    @GetMapping(params = {"transactionId"})
    public Order getOrdersByTransactionId(@RequestParam String transactionId){
        return orderService.getOrdersByTransactionId(transactionId);
    }


}
