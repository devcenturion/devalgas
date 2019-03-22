package com.demo.devalgas.devalgas.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController{

    @GetMapping("/index")
    public String index(){
        return "index";
    }
}
