package com.profITsoft.internship.service.serviceImpl;

import com.profITsoft.internship.entity.User;
import com.profITsoft.internship.repository.repoInterfaces.SecurityRepository;
import com.profITsoft.internship.service.serviceInterfaces.SecurityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SecurityServiceI implements SecurityService {

    private final SecurityRepository securityRepository;

    @Autowired
    public SecurityServiceI(SecurityRepository securityRepository) {
        this.securityRepository = securityRepository;
    }

    @Override
    public User findUser(String login, String password) {
        return securityRepository.findUserByLoginAndPassword(login, password);
    }
}
