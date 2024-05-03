package com.ITTAxMED.hackathonTeam3.Service.User;

import com.ITTAxMED.hackathonTeam3.Repository.User.UserRepository;
import com.ITTAxMED.hackathonTeam3.domain.User.Gender;
import com.ITTAxMED.hackathonTeam3.domain.User.User;
import com.ITTAxMED.hackathonTeam3.web.UserRequestDTO;
import java.time.LocalDate;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    public void createUser(UserRequestDTO userRequestDTO) {
        User user = User.builder()
                .name(userRequestDTO.getName())
                .birthdate(userRequestDTO.getBirthdate())
                .weight(userRequestDTO.getWeight())
                .height(userRequestDTO.getHeight())
                .additionalInfo(userRequestDTO.getAdditionalInfo())
                .gender(userRequestDTO.getGender())
                .build();
        userRepository.save(user);
    }


        public void update (Long userId, UserRequestDTO userRequestDTO){
            // 요청으로부터 사용자 정보 가져오기
            User user = userRepository.findById(userId)
                    .orElseThrow(() -> new IllegalArgumentException("User not found with ID: " + userId));

            // 수정할 필드 업데이트
            if (userRequestDTO.getName() != null) {
                user.setName(userRequestDTO.getName());
            }
            if (userRequestDTO.getBirthdate() != null) {
                // 생년월일 문자열을 LocalDate로 변환하여 업데이트
                user.setBirthdate(userRequestDTO.getBirthdate());
            }
            if (userRequestDTO.getWeight() != 0) {
                user.setWeight(userRequestDTO.getWeight());
            }
            if (userRequestDTO.getHeight() != 0) {
                user.setHeight(userRequestDTO.getHeight());
            }
            if (userRequestDTO.getMedicalHistory() != null) {
                user.setAdditionalInfo(userRequestDTO.getMedicalHistory());
            }
            if (userRequestDTO.getGender() != null) {
                // 성별 문자열을 Gender 열거형으로 변환하여 업데이트
                user.setGender(userRequestDTO.getGender());
            }
            // 업데이트된 사용자 저장
            userRepository.save(user);
        }
    }

