package com.ITTAxMED.hackathonTeam3.web;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserRequestDTO {
    private String name;
    private String birthdate;
    private float weight;
    private float height;
    private String medicalHistory;
    private String gender;
}
