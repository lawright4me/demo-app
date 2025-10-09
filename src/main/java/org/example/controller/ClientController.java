package org.example.controller;

import org.example.service.CountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class ClientController {

    @Autowired
    private CountService countService;

    @GetMapping("/client")
    public String handleClientRequest() {
        countService.incrementRequestCount(); // увеличиваем счетчик запросов
        return "Hello!";
    }
}