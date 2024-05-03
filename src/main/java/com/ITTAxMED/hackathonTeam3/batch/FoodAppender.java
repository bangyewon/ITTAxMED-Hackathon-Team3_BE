package com.ITTAxMED.hackathonTeam3.batch;

import com.ITTAxMED.hackathonTeam3.domain.Food.Food;
import com.ITTAxMED.hackathonTeam3.domain.Food.FoodRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class FoodAppender {

    private final FoodRepository foodRepository;

    void addFood (List<FoodResponse> foods) {
        for (FoodResponse food : foods) {
            if (foodRepository.findByFoodAndBrand(food.getMenu(), food.getBrand()) == null) {
                Food newFood = Food.builder()
                        .food(food.getMenu())
                        .brand(food.getBrand())
                        .kcal(food.getKcal())
                        .carbohydrate(food.getCarbohydrate())
                        .protein(food.getProtein())
                        .fat(food.getFat())
                        .sugar(food.getSugar())
                        .natrium(food.getNatrium())
                        .cholesterol(food.getCholesterol())
                        .fattyAcid(food.getFattyAcid())
                        .transFat(food.getTransFat())
                        .build();

                foodRepository.save(newFood);
            }
        }
    }
}
