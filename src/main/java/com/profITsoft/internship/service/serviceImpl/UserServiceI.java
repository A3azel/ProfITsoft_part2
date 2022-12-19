package com.profITsoft.internship.service.serviceImpl;

import com.profITsoft.internship.dto.UserDto;
import com.profITsoft.internship.entity.User;
import com.profITsoft.internship.repository.SimpleDB;
import com.profITsoft.internship.service.serviceInterfaces.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserServiceI implements UserService {

    private final SimpleDB simpleDB;

    @Autowired
    public UserServiceI(SimpleDB simpleDB) {
        this.simpleDB = simpleDB;
    }
    @Override
    public List<UserDto> findAllUserDTOs() {
        List<User> userList = simpleDB.getSimpleUserDB();
        return userList.stream()
                .map(UserDto::createUserDTO)
                .collect(Collectors.toList());
    }
}
