package com.sc.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;

@Controller
@RequestMapping("/say")
public class HelloController {

    @RequestMapping("hello")
    @ResponseBody
    public Object sayHello(){
        HashMap<String, String> map = new HashMap<>();
        map.put("name", "alice");
        return map;
    }

}
