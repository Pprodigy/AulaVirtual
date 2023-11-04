package com.aulavirtual.aulavirtualproyecto.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/bolnotas")
public class BolNotasController {
    @RequestMapping("/")
    public String bolnotas(){
        return "boleta_notas/index";
    }
}
