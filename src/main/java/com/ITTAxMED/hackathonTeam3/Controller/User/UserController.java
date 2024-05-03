package com.ITTAxMED.hackathonTeam3.Controller.User;

import com.ITTAxMED.hackathonTeam3.Service.User.UserService;
import com.ITTAxMED.hackathonTeam3.web.UserRequestDTO;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    private UserService userService;


    @PostMapping("/user")
    public ResponseEntity<String> createUser(@RequestBody UserRequestDTO userRequestDTO) {

        userService.createUser(userRequestDTO);
        return ResponseEntity.status(HttpStatus.CREATED)
                .body("User created successfully.");

    }

    @PostMapping("/update/{userId}")
    public ResponseEntity<String> updateUser(@PathVariable Long userId, @RequestBody UserRequestDTO userRequestDTO) {
        userService.update(userId, userRequestDTO);
        return ResponseEntity.status(HttpStatus.CREATED)
            .body("User updated successfully.");

    }
}
