package com.javatechie.k8s;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/createMessage")
    public String displayMessage(){
        return "hello to kubernetes !!";
    }
}
