package com.profITsoft.internship.service.serviceImpl;

import com.profITsoft.internship.dto.UserDto;
import com.profITsoft.internship.entity.User;
import com.profITsoft.internship.repository.repoInterfaces.UserRepository;
import com.profITsoft.internship.service.serviceInterfaces.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserServiceI implements UserService {

    private final UserRepository userRepository;

    @Autowired
    public UserServiceI(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public List<UserDto> findAllUserDTOs() {
        List<User> userList = userRepository.findAllUsers();
        return userList.stream()
                .map(UserDto::createUserDTO)
                .collect(Collectors.toList());
    }
}
