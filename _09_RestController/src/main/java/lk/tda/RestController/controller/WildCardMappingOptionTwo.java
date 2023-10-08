package lk.tda.RestController.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("wildCardOp2")
public class WildCardMappingOptionTwo {

    @GetMapping(path = "test/**/search")//Handler Mapping
    public String test(){ // Handler/Mapping Method
        return "WildCardMapping Test Method invoked";
    }
    //...wildCardOp2/test/sds/search    -> matched
    //...wildCardOp2/test/1/search      -> matched
    //...wildCardOp2/test/1/df/search   -> matched
    //...wildCardOp2/test//search       -> matched
    //...wildCardOp2/test/search        -> matched


    @GetMapping(path = "/**")//Handler Mapping
    public String test3(){ // Handler/Mapping Method
        return " WildCardMapping Test 3 Method invoked";
    }
    //...wildCardOp2/sdgedg
    //...wildCardOp2/sdgedg/sdgdg/45d
}
