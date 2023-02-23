package me.dkhoroshunov.project1cookbook.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
public class SecondController {

    @GetMapping("info")

    public String mainInformation() {

        return ("Дмитрий Хорошунов, Project1Cookbook" + LocalDateTime.now() + "Это проект книги рецептов Project1Cookbook. Веб-приложение позволяет получить доступ к рецептам разных блюд.\n" +
                "\tВ приложении задействованы технологии Java, Spring, Maven. Основным языком проекта является Java.");

    }

}
