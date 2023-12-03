package com.marco.citas.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.List;
import java.util.ArrayList;
import ch.qos.logback.core.model.Model;
import com.marco.citas.model.Paciente;

@Controller
public class PacienteController {
    private List<Paciente> pacientes=new ArrayList();

    @GetMapping("pacientes")
    public String pacientesList(Model model){
        return "pacientes";
    }
        
}