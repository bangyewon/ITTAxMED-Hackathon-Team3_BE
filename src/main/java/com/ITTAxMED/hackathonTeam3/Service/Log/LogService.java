package com.ITTAxMED.hackathonTeam3.Service.Log;


import com.ITTAxMED.hackathonTeam3.Repository.Log.LogRepository;
import com.ITTAxMED.hackathonTeam3.Repository.User.UserRepository;
import com.ITTAxMED.hackathonTeam3.domain.User.MedicalHistory;
import com.ITTAxMED.hackathonTeam3.domain.User.User;
import com.ITTAxMED.hackathonTeam3.web.MedicalHistoryRequestDTO;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class LogService {
  private final LogRepository logRepository;
  private final UserRepository userRepository;


  public List<MedicalHistory> getMedicalHistory(Long userId) {
    return logRepository.findAllByUserId(userId);
  }

  public void saveCondition(Long userid, MedicalHistoryRequestDTO requestDTO) {
    Optional<User> user = userRepository.findById(userid);
    MedicalHistory medicalHistories = (MedicalHistory) requestDTO.getConditions().stream()
        .map(condition -> MedicalHistory.builder()
                .user(user.orElseThrow())
            .medicalCondition(condition)
            .caseHistory(requestDTO.getCaseHistory())
            .build());

      logRepository.save(medicalHistories);
  }
}
