package com.crosstown.spring5petclinic.controllers;

import com.crosstown.spring5petclinic.services.VetService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author developer
 * @date 2018-12-01
 * @time 01:47
 */
@Controller
public class VetController {

    private final VetService vetService;

    public VetController(VetService vetService) {
        this.vetService = vetService;
    }

    @RequestMapping({"/vets", "vets/index", "/vets/index.html"})
    public String listVets(Model model)
    {
        model.addAttribute("vets", vetService.findAll());

        return "vets/index";
    }
}
