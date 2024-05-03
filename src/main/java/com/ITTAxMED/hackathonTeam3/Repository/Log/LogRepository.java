package com.ITTAxMED.hackathonTeam3.Repository.Log;

import com.ITTAxMED.hackathonTeam3.domain.User.MedicalHistory;
import com.ITTAxMED.hackathonTeam3.domain.User.User;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LogRepository extends JpaRepository<MedicalHistory,User> {
  List<MedicalHistory> findByUser(User user);
}
