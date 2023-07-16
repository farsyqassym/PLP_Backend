package com.example.lastsmida.Model;

import lombok.*;

@AllArgsConstructor
@Setter
@Getter
public class JwtResponse {
    private User user;
    private String jwtToken;
}
