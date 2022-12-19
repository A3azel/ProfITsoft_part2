package com.profITsoft.internship.dto;

import com.profITsoft.internship.entity.User;
import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class UserDto {
    private String login;
    private String username;

    public static UserDto createUserDTO(User user){
        return UserDto.builder()
                .username(user.getUsername())
                .login(user.getLogin())
                .build();
    }
}
