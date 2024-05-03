package com.ITTAxMED.hackathonTeam3.Service.Log;


import com.ITTAxMED.hackathonTeam3.Repository.Log.LogRepository;
import com.ITTAxMED.hackathonTeam3.domain.User.MedicalHistory;
import com.ITTAxMED.hackathonTeam3.domain.User.User;
import com.ITTAxMED.hackathonTeam3.web.MedicalHistoryRequestDTO;
import java.util.List;
import java.util.stream.Collectors;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class LogService {
  private final LogRepository logRepository;

  public List<MedicalHistory> getMedicalHistory(User user) {
    return logRepository.findByUser(user);
  }

  public void saveCondition(User user, MedicalHistoryRequestDTO requestDTO) {
    List<MedicalHistory> medicalHistories = requestDTO.getConditions().stream()
        .map(condition -> MedicalHistory.builder()
            .user(user)
            .condition(condition)
            .caseHistory(requestDTO.getCaseHistory())
            .build())
        .collect(Collectors.toList());

    logRepository.saveAll(medicalHistories);
  }
}
