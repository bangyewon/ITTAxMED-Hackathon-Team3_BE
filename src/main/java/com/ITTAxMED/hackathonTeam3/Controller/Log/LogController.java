package com.ITTAxMED.hackathonTeam3.Controller.Log;

import com.ITTAxMED.hackathonTeam3.Service.Log.LogService;
import com.ITTAxMED.hackathonTeam3.domain.User.MedicalHistory;
import com.ITTAxMED.hackathonTeam3.domain.User.User;
import com.ITTAxMED.hackathonTeam3.web.MedicalHistoryRequestDTO;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class LogController {
  private final LogService logService;

  @GetMapping("/{user}/medicalHistory")
  public ResponseEntity<List<MedicalHistory>> getMedicalHistory(@PathVariable User user) {
    List<MedicalHistory> medicalHistories = logService.getMedicalHistory(user);
    return ResponseEntity.ok().body(medicalHistories);
  }

  @PostMapping("/{user}/medicalHistory")
  public ResponseEntity<String> checkCondition(@PathVariable User user, @RequestBody MedicalHistoryRequestDTO medicalHistoryRequestDTO) {
    logService.saveCondition(user, medicalHistoryRequestDTO);
    return ResponseEntity.status(HttpStatus.CREATED)
        .body("User Condition saved successfully.");
  }


}
