package com.baizhi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/boot")
public class test {
    @RequestMapping("/test")
    /*@ResponseBody
    public String test(){
        return "lalala";
    }*/
    //小可爱
    //你才是个小可爱鸭
    public String test() {
        return "index";
    }
}
