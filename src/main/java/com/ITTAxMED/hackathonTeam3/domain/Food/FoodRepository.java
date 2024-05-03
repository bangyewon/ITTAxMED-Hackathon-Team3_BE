package com.ITTAxMED.hackathonTeam3.domain.Food;

import org.springframework.data.jpa.repository.JpaRepository;

public interface FoodRepository extends JpaRepository<Food, Long> {
    Food findByFoodAndBrand(String food, String brand);
}
