package lk.tda.RestController.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("pathVariable")
public class PathVariableController {

    @GetMapping(path = "{C001}")
    public String test(@PathVariable("C001") String id){//alies
        return id;
    }

    @GetMapping(path = "{id}/{name}")
    public String test2(@PathVariable String id,@PathVariable String name){
        return id+" : "+name;
    }
}
