package com.hendisantika.springbootthymeleaftemplate.service;

import com.hendisantika.springbootthymeleaftemplate.model.User;
import com.hendisantika.springbootthymeleaftemplate.repository.RoleRepository;
import com.hendisantika.springbootthymeleaftemplate.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Arrays;

/**
 * Created by IntelliJ IDEA.
 * Project : springboot-thymeleaf-template
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 2019-04-04
 * Time: 06:50
 */

@Service
public class UserServiceImp implements UserService {
    Autowired
    public static final String USER_ROLE = "ROLE_USER";

    private UserRepository userRepository;

    @Autowired
    private RoleRepository roleRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Override
    public User findByUsername(String username) {
        return userRepository.findByUsername(username);
    }

    @Override
    public User findByEmail(String email) {
        return userRepository.findByEmail(email);
    }

    @Override
    public User saveUser(User user) {
        // Encode plaintext password
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        user.setActive(1);
        // Set Role to ROLE_USER
        user.setRoles(Arrays.asList(roleRepository.findByRole(USER_ROLE)));
        return userRepository.saveAndFlush(user);
    }
}
