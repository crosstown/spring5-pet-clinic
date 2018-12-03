package com.crosstown.spring5petclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author developer
 * @date 2018-11-29
 * @time 22:58
 */
@Controller
public class IndexController {

    @RequestMapping({"","/", "index", "index.html"})
    public  String index(){
        return "index";
    }


    @RequestMapping("/oups")
    public String oupsHandler() {
        return "notimplemented";
    }
}
