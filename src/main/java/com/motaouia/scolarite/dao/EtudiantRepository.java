package com.motaouia.scolarite.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.motaouia.scolarite.entities.Etudiant;

@RepositoryRestResource
public interface EtudiantRepository extends JpaRepository<Etudiant, Long> {
	//@Query("select e from Etudiant e where e.nomEtudiant like :x")
	//public List<Etudiant> listAllEtdsByMc(@Param("x") String mc);
	public List<Etudiant> findByNomEtudiantStartsWith(String mc);

}
