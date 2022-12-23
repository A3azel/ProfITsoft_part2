package com.profITsoft.internship.service.serviceImpl;

import com.profITsoft.internship.dto.UserDto;
import com.profITsoft.internship.entity.User;
import com.profITsoft.internship.repository.UserDB;
import com.profITsoft.internship.service.serviceInterfaces.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserServiceI implements UserService {

    private final UserDB userDB;

    @Autowired
    public UserServiceI(UserDB userDB) {
        this.userDB = userDB;
    }

    @Override
    public List<UserDto> findAllUserDTOs() {
        List<User> userList = userDB.getAllUsers();
        return userList.stream()
                .map(UserDto::createUserDTO)
                .collect(Collectors.toList());
    }

}

