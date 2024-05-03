package com.ITTAxMED.hackathonTeam3.Service.User;

import com.ITTAxMED.hackathonTeam3.Repository.User.UserRepository;
import com.ITTAxMED.hackathonTeam3.domain.User.User;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    private UserRepository userRepository;
    public void createUser(User user) {
        userRepository.save(user);
    }
}
