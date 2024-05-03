package com.ITTAxMED.hackathonTeam3.batch;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@AllArgsConstructor
@RestController
public class FoodController {
    private final FoodService foodService;

    @GetMapping("/addFood")
    void addFood(){
        foodService.addFood();
    }
}
