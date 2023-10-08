package lk.tda.RestController.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("wildCardOp1")
public class WildCardMappingOptionOne {

    @GetMapping(path = "test/*/search")//Handler Mapping
    public String test(){ // Handler/Mapping Method
        return "WildCardMapping Test Method invoked";
    }
    //...wildCardOp1/test/sds/search    -> matched
    //...wildCardOp1/test/1/search      -> matched
    //...wildCardOp1/test/1/df/search   -> not matched
    //...wildCardOp1/test//search       -> not matched

    @GetMapping(path = "test/*/*/search")//Handler Mapping
    public String test2(){ // Handler/Mapping Method
        return " WildCardMapping Test 2 Method invoked";
    }
    //...wildCardOp1/test/sd/sf/search

    @GetMapping(path = "/*")//Handler Mapping
    public String test3(){ // Handler/Mapping Method
        return " WildCardMapping Test 3 Method invoked";
    }
    //...wildCardOp1/sdgedg
}
