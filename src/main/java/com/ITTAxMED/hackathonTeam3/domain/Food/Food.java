package com.ITTAxMED.hackathonTeam3.domain.Food;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

    @Entity
    @Getter
    @NoArgsConstructor
    @AllArgsConstructor
    @Builder
    public class Food {
        @Id
        private Long id;

        @Column(nullable = false)
        private String food;
        private  String brand;


        @Column(name = "kcal", nullable = true)
        private int kcal;

        @Column(name = "carbohydrate", nullable = true)
        private int carbohydrate;

        @Column(name = "protein", nullable = true)
        private int protein;

        @Column(name = "fat", nullable = true)
        private int fat;

        @Column(name = "sugar", nullable = true)
        private int sugar;

        @Column(name = "natrium", nullable = true)
        private int natrium;

        @Column(name = "cholesterol", nullable = true)
        private int cholesterol;

        @Column(name = "fattyAcid", nullable = true)
        private int fattyAcid;

        @Column(name = "transFat", nullable = true)
        private int transFat;
    }
