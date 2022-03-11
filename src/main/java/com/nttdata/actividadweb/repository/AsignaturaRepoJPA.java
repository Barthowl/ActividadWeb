package com.nttdata.actividadweb.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nttdata.actividadweb.repository.entity.Asignatura;

@Repository
public interface AsignaturaRepoJPA extends JpaRepository<Asignatura, Integer>{
	
}
