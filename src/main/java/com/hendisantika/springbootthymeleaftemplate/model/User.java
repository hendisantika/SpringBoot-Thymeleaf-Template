package com.hendisantika.springbootthymeleaftemplate.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.hibernate.validator.constraints.Length;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import java.util.Collection;

/**
 * Created by IntelliJ IDEA.
 * Project : springboot-thymeleaf-template
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 2019-04-04
 * Time: 06:45
 */
@Entity
@Table(name = "user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "user_id")
    private Long id;

    @Email(message = "*Please provide a valid Email")
    @NotEmpty(message = "*Please provide an email")
    @Column(name = "email", unique = true, nullable = false)
    private String email;

    @Length(min = 5, message = "*Your password must have at least 5 characters")
    @NotEmpty(message = "*Please provide your password")
    @JsonIgnore
    @Column(name = "password", nullable = false)
    private String password;

    @Length(min = 5, message = "*Your username must have at least 5 characters")
    @NotEmpty(message = "*Please provide your name")
    @Column(name = "username", nullable = false, unique = true)
    private String username;

    @NotEmpty(message = "*Please provide your name")
    @Column(name = "name")
    private String name;

    @NotEmpty(message = "*Please provide your last name")
    @Column(name = "last_name")
    private String lastName;

    @Column(name = "active", nullable = false)
    private int active;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "user_role", joinColumns = @JoinColumn(name = "user_id"), inverseJoinColumns = @JoinColumn(name = "role_id"))
    private Collection<Role> roles;

}
