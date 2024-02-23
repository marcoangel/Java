package com.marco.citas.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import ch.qos.logback.core.model.Model;

@Controller
public class PacienteController {

    @GetMapping("/pacientes")
    public String pacientesList(Model model){
        return "pacientes";
    }
    
    @GetMapping("/nuevopaciente")
    public String newPaciente(Model model){
        return "newpaciente";
    }

    @GetMapping("/paciente")
    public String paciente(Model model){
        return "paciente";
    }
}