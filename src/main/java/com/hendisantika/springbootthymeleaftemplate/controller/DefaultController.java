package com.hendisantika.springbootthymeleaftemplate.controller;

import com.hendisantika.springbootthymeleaftemplate.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by IntelliJ IDEA.
 * Project : springboot-thymeleaf-template
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 2019-04-04
 * Time: 06:58
 */
@Controller
@RequestMapping
public class DefaultController {

    @Autowired
    private UserService userService;

    @GetMapping({"/home", "/"})
    public String admin() {
        return "/home";
    }

    @GetMapping("/403")
    public String error403() {
        return "/403";
    }

}