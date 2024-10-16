package com.example.SpringSecurityFileStorage.Controller;

import com.example.SpringSecurityFileStorage.DTO.JwtAuthenticationResponse;
import com.example.SpringSecurityFileStorage.DTO.RefreshTokenRequest;
import com.example.SpringSecurityFileStorage.DTO.SignInRequest;
import com.example.SpringSecurityFileStorage.DTO.SignUpRequest;
import com.example.SpringSecurityFileStorage.Entity.User;
import com.example.SpringSecurityFileStorage.Service.AuthenticationService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/auth")
@RequiredArgsConstructor
public class AuthenticationController {

    private final AuthenticationService authenticationService;
    @PostMapping("/signup")
    public ResponseEntity<User> signup(@RequestBody SignUpRequest signUpRequest) {
        return ResponseEntity.ok(authenticationService.signup(signUpRequest));
    }

    @PostMapping("/signin")
    public ResponseEntity<JwtAuthenticationResponse> signin(@RequestBody SignInRequest signInRequest){
        return ResponseEntity.ok(authenticationService.signIn(signInRequest));
    }

    @PostMapping("/refresh")
    public ResponseEntity<JwtAuthenticationResponse> refresh(@RequestBody RefreshTokenRequest refreshTokenRequest){
        return ResponseEntity.ok(authenticationService.refreshToken(refreshTokenRequest));
    }
}
