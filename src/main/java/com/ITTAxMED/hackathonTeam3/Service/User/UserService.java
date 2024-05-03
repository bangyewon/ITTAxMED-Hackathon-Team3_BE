package com.ITTAxMED.hackathonTeam3.Service.User;

import com.ITTAxMED.hackathonTeam3.Repository.User.UserRepository;
import com.ITTAxMED.hackathonTeam3.domain.User.User;
import com.ITTAxMED.hackathonTeam3.web.UserRequestDTO;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    private UserRepository userRepository;

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
}
