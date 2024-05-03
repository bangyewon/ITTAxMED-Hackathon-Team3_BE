package com.ITTAxMED.hackathonTeam3.web;

import com.ITTAxMED.hackathonTeam3.domain.User.User;
import java.util.List;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MedicalHistoryRequestDTO {
  private Long id;
  private User user;
  private List<String> condition;
  private String caseHistory;

  public List<String> getConditions() {
    return condition;
  }
}
