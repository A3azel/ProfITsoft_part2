package com.profITsoft.internship.repository.repoImpl;

import com.profITsoft.internship.SimpleDB;
import com.profITsoft.internship.entity.User;
import com.profITsoft.internship.repository.repoInterfaces.SecurityRepository;
import org.springframework.stereotype.Repository;

@Repository
public class SecurityRepositoryI implements SecurityRepository {
    @Override
    public User findUserByLoginAndPassword(String login, String password) {
        return SimpleDB.userList.stream()
                .filter(x -> x.getLogin().equals(login) && x.getPassword().equals(password))
                .findFirst().orElse(null);
    }
}
