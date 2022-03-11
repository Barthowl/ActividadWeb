package com.nttdata.actividadweb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.nttdata.actividadweb.service.AsignaturaService;

@Controller
public class WebController {
	
	@Autowired
	AsignaturaService asignaturaService;
	
	@GetMapping("/listarAsignaturas")
	@Cacheable(value="asignatura")
	public String listarAsig(Model model) {
		model.addAttribute("listaAsig" , asignaturaService.listar());
		return "listarAsignaturas";
	}
	
	@GetMapping("/error")
	public String error_page() {
		return "error";
	}

}
