package com.ITTAxMED.hackathonTeam3.batch;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class FoodService {
    private final FoodOpenApiClient foodOpenApiClient;
    private final FoodAppender foodAppender;

    void addFood() {
        List<FoodResponse> food2 = foodOpenApiClient.getFood2();
        foodAppender.addFood(food2);
        List<FoodResponse> food = foodOpenApiClient.getFood1();
        foodAppender.addFood(food);
    }
}
