package com.hendisantika.springbootthymeleaftemplate.repository;

import com.hendisantika.springbootthymeleaftemplate.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

/**
 * Created by IntelliJ IDEA.
 * Project : springboot-thymeleaf-template
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 2019-04-04
 * Time: 06:48
 */
public interface RoleRepository extends JpaRepository<Role, Long> {
    Role findByRole(@Param("role") String role);
}