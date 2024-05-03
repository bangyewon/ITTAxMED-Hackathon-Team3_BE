package com.ITTAxMED.hackathonTeam3.domain.Food;

import org.hibernate.annotations.processing.SQL;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface FoodRepository extends JpaRepository<Food, Long> {
    Food findByFoodAndBrand(String food, String brand);

    Food findAllByFood(String food);
}
