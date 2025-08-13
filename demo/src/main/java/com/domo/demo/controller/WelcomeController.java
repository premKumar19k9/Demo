package com.domo.demo.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/welcome")
public class WelcomeController {

    @GetMapping
    public String greet() {
        log.info("Accessed the welcome endpoint");
        return "<html> <b><i>Welcome to the Domo Application! <b><i> </html>";
    }
}
