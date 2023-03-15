package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    @GetMapping("/")
    public String index(){
        return "Hello Ikhra"; //Det jeg skriver kan jeg se på en hjemmeside hvis jeg skriver localhost 8080
        //test ændring
    }
}
