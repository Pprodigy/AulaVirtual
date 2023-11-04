package com.aulavirtual.aulavirtualproyecto.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/cursos")
public class CursosController {
    @RequestMapping("/")
    public String cursos(){
        return "cursos/index";
    }
}
