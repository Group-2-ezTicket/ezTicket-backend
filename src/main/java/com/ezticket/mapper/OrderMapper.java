package com.ezticket.mapper;

import com.ezticket.dto.MovieResponse;
import com.ezticket.dto.OrderResponse;
import com.ezticket.model.Cinema;
import com.ezticket.model.Movie;
import com.ezticket.model.Order;
import com.ezticket.model.Schedule;
import com.ezticket.service.CinemaService;
import com.ezticket.service.MovieService;
import com.ezticket.service.OrderService;
import com.ezticket.service.ScheduleService;

import org.aspectj.weaver.ast.Or;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class OrderMapper {

    public OrderResponse toResponse(Order order, Schedule schedule, Movie movie, Cinema cinema){
        String formattedSchedule = schedule.getSelectedDate() + ": " +   schedule.getTimeStart() +" - "+ schedule.getTimeEnd();
        OrderResponse orderResponse = new OrderResponse(cinema.getName(),formattedSchedule, movie.getMovieTitle(), movie.getPrice(), order.getFoodList(), order.getTotalPrice(), order.getOrderStatus());
//        orderResponse.setCinemaName(cinema.getName());
//        orderResponse.setSchedule(formattedSchedule);
//        orderResponse.setMovieName(movie.getMovieTitle());
//        orderResponse.setMoviePrice(movie.getPrice());
//        orderResponse.setFoodOrder(order.getFoodList());
//        orderResponse.setTotalPrice(order.getTotalPrice());
//        orderResponse.setOrderStatus(order.getOrderStatus());
        return orderResponse;
    }
}