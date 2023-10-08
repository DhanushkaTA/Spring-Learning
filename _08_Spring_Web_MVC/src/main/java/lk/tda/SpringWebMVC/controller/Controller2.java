package lk.tda.SpringWebMVC.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@org.springframework.stereotype.Controller
@RequestMapping("customer")
public class Controller2 {

    @GetMapping
    public String testMethod(){
        return "customer";
    }

}
