package com.profITsoft.internship.service.serviceInterfaces;

import com.profITsoft.internship.entity.User;

public interface SecurityService {
    User findUser(String login, String password);
}
