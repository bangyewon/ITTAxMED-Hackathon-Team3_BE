package com.ITTAxMED.hackathonTeam3.batch;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class FoodInfo {
    private List<FoodInfoDetail> row;

    public List<FoodInfoDetail> getRow() {
        return row;
    }

    public void setRow(List<FoodInfoDetail> row) {
        this.row = row;
    }
}
