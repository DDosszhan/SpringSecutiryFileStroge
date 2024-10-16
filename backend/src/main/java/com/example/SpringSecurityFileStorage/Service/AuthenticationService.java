package com.example.SpringSecurityFileStorage.Service;

import com.example.SpringSecurityFileStorage.DTO.JwtAuthenticationResponse;
import com.example.SpringSecurityFileStorage.DTO.RefreshTokenRequest;
import com.example.SpringSecurityFileStorage.DTO.SignInRequest;
import com.example.SpringSecurityFileStorage.DTO.SignUpRequest;
import com.example.SpringSecurityFileStorage.Entity.User;

public interface AuthenticationService {
    User signup(SignUpRequest signUpRequest);

    JwtAuthenticationResponse signIn(SignInRequest signInRequest);

    JwtAuthenticationResponse refreshToken(RefreshTokenRequest refreshTokenRequest);
}
