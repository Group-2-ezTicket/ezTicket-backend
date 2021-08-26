package com.ezticket.controller;


import com.ezticket.dto.OrderResponse;
import com.ezticket.mapper.OrderMapper;
import com.ezticket.model.Cinema;
import com.ezticket.model.Movie;
import com.ezticket.model.Order;
import com.ezticket.model.Schedule;
import com.ezticket.service.CinemaService;
import com.ezticket.service.MovieService;
import com.ezticket.service.OrderService;
import com.ezticket.service.ScheduleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/orders")
public class OrderController {
    @Autowired
    private OrderService orderService;

    @Autowired
    private MovieService movieService;

    @Autowired
    private CinemaService cinemaService;

    @Autowired
    private ScheduleService scheduleService;

    private OrderMapper orderMapper;

    @PostMapping
    public Order addOrder(@RequestBody Order newOrder){
        return orderService.addOrder(newOrder);
    }

    @GetMapping("/{orderId}")
    public Order getOrderByOrderId(@PathVariable Integer orderId){
        return orderService.findOrderByOrderId(orderId);
    }

    @PutMapping(path = "/{transactionId}")
    public Order updateOrder(@PathVariable String transactionId, @RequestBody Order order) {
        return orderService.updateOrder(transactionId, order);
    }

    @GetMapping(params = {"transactionId"})
    public OrderResponse getOrdersByTransactionId(@RequestParam String transactionId){
        Order order = orderService.getOrdersByTransactionId(transactionId);
        Schedule schedule = scheduleService.getAllSchedules().stream().filter(sched -> sched.getScheduleId().equals(order.getScheduleId())).findFirst().orElse(null);
        Movie movie = movieService.getMovieById(schedule.getMovieId());
        Cinema cinema = cinemaService.getAllCinemas().get(schedule.getCinemaId());
        String formattedSchedule = schedule.getSelectedDate() + ": " +   schedule.getTimeStart() +" - "+ schedule.getTimeEnd();

        return new OrderResponse(cinema.getName(),formattedSchedule, movie.getMovieTitle(), movie.getPrice(), order.getFoodList(), order.getTotalPrice(), order.getOrderStatus());
    }
}
