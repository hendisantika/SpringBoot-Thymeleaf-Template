package com.hendisantika.springbootthymeleaftemplate.service;

import com.hendisantika.springbootthymeleaftemplate.model.User;

/**
 * Created by IntelliJ IDEA.
 * Project : springboot-thymeleaf-template
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 2019-04-04
 * Time: 06:50
 */
public interface UserService {

    User findByUsername(String username);

    User findByEmail(String email);

    User saveUser(User user);

}