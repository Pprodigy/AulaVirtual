package com.aulavirtual.aulavirtualproyecto.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/soporte")
public class SoporteController {
    @RequestMapping("/")
    public String soporte(){
        return "sop_tec/index";
    }
}
