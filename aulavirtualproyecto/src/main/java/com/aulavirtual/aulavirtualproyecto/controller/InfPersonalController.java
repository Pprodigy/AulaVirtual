package com.aulavirtual.aulavirtualproyecto.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/infpersonal")
public class InfPersonalController {
    @RequestMapping("/")
    public String info_personal(){
        return "inf_personal/index";
    }
}
