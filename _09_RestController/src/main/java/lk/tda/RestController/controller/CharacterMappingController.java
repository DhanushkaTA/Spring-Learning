package lk.tda.RestController.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("character")
public class CharacterMappingController {

    @GetMapping(path = "I???")//Handler Mapping
    public String test(){ // Handler/Mapping Method
        return "Test Method invoked";
    }//...character/I123 .../character/Iabc

    @GetMapping(path = "????/search")//Handler Mapping
    public String test2(){ // Handler/Mapping Method
        return "Test 2 Method invoked";
    }//...character/12sd/search

    @GetMapping(path = "???")//Handler Mapping
    public String test3(){ // Handler/Mapping Method
        return "Test 3 Method invoked";
    }//...character/5555


}
