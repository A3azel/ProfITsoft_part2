package com.profITsoft.internship.service.serviceImpl;

import com.profITsoft.internship.entity.User;
import com.profITsoft.internship.repository.UserDB;
import com.profITsoft.internship.service.serviceInterfaces.SecurityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SecurityServiceI implements SecurityService {

    private final UserDB userDB;

    @Autowired
    public SecurityServiceI(UserDB userDB) {
        this.userDB = userDB;
    }

    @Override
    public User findUser(String login, String password) {
        return userDB.getAllUsers().stream()
                .filter(x -> x.getLogin().equals(login) && x.getPassword().equals(password))
                .findFirst().orElse(null);
    }

}
