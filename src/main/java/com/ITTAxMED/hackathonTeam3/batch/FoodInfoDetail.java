package com.ITTAxMED.hackathonTeam3.batch;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;

@JsonIgnoreProperties(ignoreUnknown = true)
public class FoodInfoDetail {
    private int NUTR_CONT8;
    private int NUTR_CONT9;
    private int NUTR_CONT4;
    private int NUTR_CONT5;
    private int NUTR_CONT6;
    private String NUM;
    private int NUTR_CONT7;
    private int NUTR_CONT1;
    private int NUTR_CONT2;
    private String SUB_REF_NAME;
    private int NUTR_CONT3;
    private String RESEARCH_YEAR;
    private String MAKER_NAME;
    private String GROUP_NAME;
    private String SERVING_SIZE;
    private String SERVING_UNIT;
    private String SAMPLING_REGION_NAME;
    private String SAMPLING_MONTH_CD;
    private String SAMPLING_MONTH_NAME;
    private String DESC_KOR;
    private String SAMPLING_REGION_CD;
    private String FOOD_CD;
}
