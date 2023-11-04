package com.aulavirtual.aulavirtualproyecto.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/horario")
public class HorarioController {
    @RequestMapping("/")
    public String horario(){
        return "horario/index";
    }
}
