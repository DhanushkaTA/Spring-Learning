package lk.tda.RestController.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("exact")
public class ExactMappingController {

    @GetMapping(path = "test1")//Handler Mapping
    public String test(){ // Handler/Mapping Method
        return "Test Method invoked";
    }//...exact/test1

    @GetMapping(path = "test1/io/tt2")//Handler Mapping
    public String test02(){ // Handler/Mapping Method
        return "Test 02 Method invoked";
    }//...exact/test1/io/tt2

    @GetMapping(path = "get/test3")//Handler Mapping
    public String test03(){ // Handler/Mapping Method
        return "Test 03 Method invoked";
    }//...exact/get/test3
}
