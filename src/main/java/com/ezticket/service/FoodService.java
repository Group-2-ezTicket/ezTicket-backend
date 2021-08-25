package com.ezticket.service;

import com.ezticket.model.Food;
import com.ezticket.repository.FoodRepository;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class FoodService {
    @Resource
    private FoodRepository foodRepository;

    public List<Food> getAllFoods() {
        return foodRepository.findAll();
    }

}
