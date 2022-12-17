package com.profITsoft.internship.repository.repoInterfaces;

import com.profITsoft.internship.entity.User;

public interface SecurityRepository {
    User findUserByLoginAndPassword(String Login, String password);
}
