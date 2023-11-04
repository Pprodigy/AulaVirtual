package com.aulavirtual.aulavirtualproyecto.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/hisnotas")
public class HisNotasController {
    @RequestMapping("/")
    public String hisnotas(){
        return "hist_notas/index";
    }
}
