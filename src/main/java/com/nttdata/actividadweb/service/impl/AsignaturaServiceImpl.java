package com.nttdata.actividadweb.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nttdata.actividadweb.repository.AsignaturaRepoJPA;
import com.nttdata.actividadweb.repository.entity.Asignatura;
import com.nttdata.actividadweb.service.AsignaturaService;

@Service
public class AsignaturaServiceImpl implements AsignaturaService {
	
	@Autowired
	AsignaturaRepoJPA asignaturaRepoJPA;
	


	@Override
	public List<Asignatura> listar() {
		// TODO Auto-generated method stub
		return asignaturaRepoJPA.findAll();
	}

}
