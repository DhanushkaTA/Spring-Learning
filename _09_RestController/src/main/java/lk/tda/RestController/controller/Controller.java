package lk.tda.RestController.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("controller")//Handler Mapping
public class Controller {

    @GetMapping//Handler Mapping
    public String getMethod(){ // Handler/Mapping Method
        return "Get Method invoked";
    }
    //...controller

//    @GetMapping//Handler Mapping
//    public String getMethodTwo(){ // Handler/Mapping Method
//        return "Get Method invoked";
//    }
//    //Error :- Ambiguous Mapping

    @GetMapping(path = "search")//Handler Mapping
    public String getSearchMethod(){ // Handler/Mapping Method
        return "Get Search Method invoked";
    }
    //.../controller/search


    @PutMapping//Handler Mapping
    public String putMethod(){ // Handler/Mapping Method
        return "Put Method invoked";
    }

    @DeleteMapping//Handler Mapping
    public String deleteMethod(){ // Handler/Mapping Method
        return "Delete Method invoked";
    }

    @PostMapping//Handler Mapping
    public String postMethod(){ // Handler/Mapping Method
        return "Post Method invoked";
    }
}
