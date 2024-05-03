package com.ITTAxMED.hackathonTeam3.Controller.User;

import com.ITTAxMED.hackathonTeam3.web.UserRequestDTO;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Operation(summary = "Create a new user", description = "Endpoint to create a new user")

    @PostMapping("/users")
    public ResponseEntity<String> createUser(@RequestBody UserRequestDTO userRequestDTO) {

        Long userId = 1000L;

        return ResponseEntity.status(HttpStatus.CREATED).body("User created successfully. User ID: " + userId);
    }
}
