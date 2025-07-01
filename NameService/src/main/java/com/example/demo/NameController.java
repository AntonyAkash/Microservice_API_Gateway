package com.example.demo;

import java.util.Random;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/name")
public class NameController {
    @GetMapping("/first")
    public String getName() {
        return "Name: Immanuel";
    }
    
    @GetMapping("/aim")
    public String getAim() {
        return "Java Developer";
    }
    
    @GetMapping("/savings")
    public String getbalance() {
        return String.valueOf(new Random().nextInt(100000));
    }
      
}
