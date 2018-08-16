package com.hector.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ServicioController {
    
	@GetMapping("/servicios")
	public String formAlumno(Model model){
		
		model.addAttribute("titulo", "Lista de Servicios");
		return  "ListaServicios";
	}
//	@GetMapping("/form/{id}")
//	public String editar(Model model){
//		
//		return "form"
//	} 
}
