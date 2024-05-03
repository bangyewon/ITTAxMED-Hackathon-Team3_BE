package com.ITTAxMED.hackathonTeam3.web;

import com.ITTAxMED.hackathonTeam3.domain.User.Gender;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class UserRequestDTO {
    private String name;
    private LocalDate birthdate;
    private float weight;
    private float height;
    private String medicalHistory;
    private String additionalInfo;
    private Gender gender;
}
