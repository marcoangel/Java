package com.example.demo.controlller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.model.Persona;

import org.springframework.ui.Model;



@Controller
class PersonaController{ 
    private List<Persona> lista=new ArrayList<Persona>();

    @GetMapping("/listadopersonas")
    public String mostrarListado(Model model){
        model.addAttribute("personas", lista);
        return "listadopersonas";
    }

    @GetMapping("/form")
    public String formPersona(Model model){
        model.addAttribute("persona", new Persona());
        return "form";
    }

    @PostMapping("/registro")
    public String registroPersona(Persona persona){
        lista.add(persona);
        return "redirect:/listadopersonas";
    }
}