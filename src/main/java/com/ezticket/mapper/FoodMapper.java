package com.ezticket.mapper;

import com.ezticket.dto.FoodResponse;
import com.ezticket.model.Food;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class FoodMapper {
    public FoodResponse toResponse(Food food){
        FoodResponse foodResponse = new FoodResponse();
        BeanUtils.copyProperties(food, foodResponse);
        return foodResponse;
    }

    public List<FoodResponse> toResponse(List<Food> food){
        return food.stream()
                .map(this::toResponse)
                .collect(Collectors.toList());
    }
}
