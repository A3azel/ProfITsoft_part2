package com.profITsoft.internship.service.serviceInterfaces;

import com.profITsoft.internship.dto.UserDto;

import java.util.List;

public interface UserService {
    List<UserDto> findAllUserDTOs();
}
