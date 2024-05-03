package com.ITTAxMED.hackathonTeam3.domain.User;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

@Entity
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class User {
    @Id
    private Long id;

    @Column(nullable = false)
    private String name;
    private LocalDate birthdate;
    private Float weight;
    private Float height;

    @Column(nullable = true)
    private String additionalInfo;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private Gender gender;
}
