package com.ITTAxMED.hackathonTeam3.batch;

import com.ITTAxMED.hackathonTeam3.domain.Food.Food;
import com.ITTAxMED.hackathonTeam3.domain.Food.FoodRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class FoodService {
    private final FoodOpenApiClient foodOpenApiClient;
    private final FoodAppender foodAppender;
    private final FoodRepository foodRepository;

    void addFood() {
        List<FoodResponse> food2 = foodOpenApiClient.getFood2();
        foodAppender.addFood(food2);
//        List<FoodResponse> food = foodOpenApiClient.getFood1();
//        foodAppender.addFood(food);
    }

    public FoodResponse getFood(String food) {
        Food result =foodRepository.findAllByFood(food);
        return FoodResponse.builder()
                .menu(result.getFood())
                .brand(result.getBrand())
                .kcal(result.getKcal())
                .carbohydrate(result.getCarbohydrate())
                .protein(result.getProtein())
                .fat(result.getFat())
                .sugar(result.getSugar())
                .natrium(result.getNatrium())
                .cholesterol(result.getCholesterol())
                .fattyAcid(result.getFattyAcid())
                .transFat(result.getTransFat())
                .build();
    }
}
