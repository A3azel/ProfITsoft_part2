package com.profITsoft.internship.repository.repoImpl;

import com.profITsoft.internship.SimpleDB;
import com.profITsoft.internship.entity.User;
import com.profITsoft.internship.repository.repoInterfaces.UserRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserRepositoryI implements UserRepository {
    @Override
    public List<User> findAllUsers() {
        return SimpleDB.userList;
    }
}
