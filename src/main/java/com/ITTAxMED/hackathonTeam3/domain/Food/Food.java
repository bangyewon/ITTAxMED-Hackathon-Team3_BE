package com.ITTAxMED.hackathonTeam3.domain.Food;

import jakarta.persistence.*;
import lombok.*;

    @Entity
    @Getter
    @NoArgsConstructor
    @AllArgsConstructor
    @Builder
    public class Food {
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        private Long id;

        @Column(nullable = false)
        private String food;
        private  String brand;


        @Column(name = "kcal", nullable = true)
        private String kcal;

        @Column(name = "carbohydrate", nullable = true)
        private String carbohydrate;

        @Column(name = "protein", nullable = true)
        private String protein;

        @Column(name = "fat", nullable = true)
        private String fat;

        @Column(name = "sugar", nullable = true)
        private String sugar;

        @Column(name = "natrium", nullable = true)
        private String natrium;

        @Column(name = "cholesterol", nullable = true)
        private String cholesterol;

        @Column(name = "fattyAcid", nullable = true)
        private String fattyAcid;

        @Column(name = "transFat", nullable = true)
        private String transFat;
    }
