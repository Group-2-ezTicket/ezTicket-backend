package com.ezticket.controller;

import com.ezticket.dto.FoodResponse;
import com.ezticket.mapper.FoodMapper;
import com.ezticket.service.FoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/foods")
public class FoodController {
    @Autowired
    private FoodService foodService;

    @Autowired
    private FoodMapper foodMapper;

    @GetMapping
    private List<FoodResponse> getAllFoods() {
        return foodMapper.toResponse(foodService.getAllFoods());
    }
}
