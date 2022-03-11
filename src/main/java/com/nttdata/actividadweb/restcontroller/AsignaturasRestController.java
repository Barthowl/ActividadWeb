package com.nttdata.actividadweb.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nttdata.actividadweb.repository.entity.Asignatura;
import com.nttdata.actividadweb.service.AsignaturaService;


@RestController
@RequestMapping ("/rest/Asignaturas")
public class AsignaturasRestController {

	@Autowired
	AsignaturaService asignaturaService;
	
	@GetMapping
	@Cacheable(value="asignatura")
	public List<Asignatura> listarAsignatura(){
		try {
			Thread.sleep(1500);
		} catch(InterruptedException e) {}
		return asignaturaService.listar();
	}
}
