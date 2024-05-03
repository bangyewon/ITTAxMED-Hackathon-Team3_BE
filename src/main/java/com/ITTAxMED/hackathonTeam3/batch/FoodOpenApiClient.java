package com.ITTAxMED.hackathonTeam3.batch;

import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import org.springframework.web.util.UriBuilder;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Service
public class FoodOpenApiClient {
    List<FoodResponse> getFood1() {
        List<FoodResponse> resultList = new ArrayList<>();
        for (int i = 1; i < 12790; i += 200) {
            String apiUrl = String.format("https://openapi.foodsafetykorea.go.kr/api/b91c61f1bcd045c3a9a8/I2790/json/%d/%d", i, i + 199);
            WebClient webClient = WebClient.create(apiUrl);
            String result = webClient.get()
                    .uri(UriBuilder::build)
                    .retrieve()
                    .bodyToMono(String.class)
                    .block();

            JSONObject jsonObject = new JSONObject(Objects.requireNonNull(result));
            JSONArray foodInfoArray = jsonObject.getJSONObject("I2790").getJSONArray("row");

            resultList.addAll(convertToFoodResponseList(foodInfoArray));
        }
        return resultList;
    }

    List<FoodResponse> getFood2() {

        String apiUrl = "https://openapi.foodsafetykorea.go.kr/api/b91c61f1bcd045c3a9a8/I2790/json/12601/12790";
        WebClient webClient = WebClient.create(apiUrl);
        String result = webClient.get()
                .uri(UriBuilder::build)
                .retrieve()
                .bodyToMono(String.class)
                .block();

        JSONObject jsonObject = new JSONObject(Objects.requireNonNull(result));
        JSONArray foodInfoArray = jsonObject.getJSONObject("I2790").getJSONArray("row");

        return convertToFoodResponseList(foodInfoArray);
    }

    private List<FoodResponse> convertToFoodResponseList(JSONArray foodInfoArray) {
        List<FoodResponse> foodResponseList = new ArrayList<>();

        for (int i = 0; i < foodInfoArray.length(); i++) {
            JSONObject foodObject = foodInfoArray.getJSONObject(i);

            String descKor = foodObject.getString("DESC_KOR");
            String makerName = foodObject.getString("MAKER_NAME");
            String nutrCont1 = foodObject.getString("NUTR_CONT1");
            String nutrCont2 = foodObject.getString("NUTR_CONT2");
            String nutrCont3 = foodObject.getString("NUTR_CONT3");
            String nutrCont4 = foodObject.getString("NUTR_CONT4");
            String nutrCont5 = foodObject.getString("NUTR_CONT5");
            String nutrCont6 = foodObject.getString("NUTR_CONT6");
            String nutrCont7 = foodObject.getString("NUTR_CONT7");
            String nutrCont8 = foodObject.getString("NUTR_CONT8");
            String nutrCont9 = foodObject.getString("NUTR_CONT9");

            FoodResponse foodResponse = new FoodResponse(
                    descKor, makerName, nutrCont1, nutrCont2, nutrCont3, nutrCont4,
                    nutrCont5, nutrCont6, nutrCont7, nutrCont8, nutrCont9
            );
            foodResponseList.add(foodResponse);
        }

        return foodResponseList;
    }
}
