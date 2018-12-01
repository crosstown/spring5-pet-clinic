package com.crosstown.spring5petclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author developer
 * @date 2018-12-01
 * @time 01:47
 */
@Controller
public class VetController {

    @RequestMapping({"/vets", "vets/index", "/vets/index.html"})
    public String listVets() {
        return "vets/index";
    }
}
