package com.nagarro.hellok8s;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloK8sController {

    @GetMapping("/greetings")
    public String greet(){
        return "Hello World!";
    }
}
