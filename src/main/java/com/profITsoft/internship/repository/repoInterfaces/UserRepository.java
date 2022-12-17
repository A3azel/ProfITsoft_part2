package com.profITsoft.internship.repository.repoInterfaces;

import com.profITsoft.internship.entity.User;

import java.util.List;

public interface UserRepository {
    List<User> findAllUsers();
}
