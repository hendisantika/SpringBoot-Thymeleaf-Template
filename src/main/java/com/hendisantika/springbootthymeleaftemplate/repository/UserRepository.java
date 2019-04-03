package com.hendisantika.springbootthymeleaftemplate.repository;

import com.hendisantika.springbootthymeleaftemplate.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

/**
 * Created by IntelliJ IDEA.
 * Project : springboot-thymeleaf-template
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 2019-04-04
 * Time: 06:49
 */
public interface UserRepository extends JpaRepository<User, Long> {
    User findByEmail(@Param("email") String email);

    User findByUsername(@Param("username") String username);
}