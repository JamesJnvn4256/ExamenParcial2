package com.example.ExamenParcialVelezmoroE2.controller;

import com.example.ExamenParcialVelezmoroE2.model.RegistroVentaModel;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class RegistroController {

    // Mostrar formulario directamente en la raíz (localhost/)
    @GetMapping("/")
    public String mostrarFormulario(Model model) {
        model.addAttribute("registro", new RegistroVentaModel());
        return "formulario"; // Página del formulario
    }

   @PostMapping("/exito")
    public String mostrarPaginaExito(@ModelAttribute("registro") RegistroVentaModel registro, Model model) {
        model.addAttribute("registro", registro);
        return "exito"; // Página de éxito
    }

}
