package com.ITTAxMED.hackathonTeam3.batch;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
public class FoodResponse {
    private String menu;
    private String brand;
    private String kcal;   //NUTR_CONT1   열량(kcal)(1회제공량당)
    private String carbohydrate;   //NUTR_CONT2   탄수화물(g)(1회제공량당)
    private String protein; //NUTR_CONT3   단백질(g)(1회제공량당)
    private String fat; //NUTR_CONT4   지방(g)(1회제공량당)
    private String sugar; //NUTR_CONT5   당류(g)(1회제공량당)
    private String natrium; //NUTR_CONT6   나트륨(mg)(1회제공량당)
    private String cholesterol; //NUTR_CONT7   콜레스테롤(mg)(1회제공량당)
    private String fattyAcid; //NUTR_CONT8   포화지방산(g)(1회제공량당)
    private String transFat;//NUTR_CONT9   트랜스지방(g)(1회제공량당)

}
