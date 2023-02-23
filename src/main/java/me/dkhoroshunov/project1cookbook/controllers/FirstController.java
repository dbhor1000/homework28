package me.dkhoroshunov.project1cookbook.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstController {

    @GetMapping("/")
    public String initialMessage() {

        return ("Приложение запущено.");

    }
}
