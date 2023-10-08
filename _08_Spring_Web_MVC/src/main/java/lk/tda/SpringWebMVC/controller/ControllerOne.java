package lk.tda.SpringWebMVC.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//@RestController
//@RequestMapping("controllerOne")
public class ControllerOne {
    public ControllerOne() {
        System.out.println("ControllerOne Object Created");
    }

    @GetMapping
    public String testMethod(){
        System.out.println("Request Received");
        return "Tharindu Dhanushka Abeywickrama";
    }
}