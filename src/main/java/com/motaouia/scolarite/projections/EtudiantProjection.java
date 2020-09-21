package com.motaouia.scolarite.projections;

import org.springframework.data.rest.core.config.Projection;

import com.motaouia.scolarite.entities.Etudiant;

@Projection(name="p1", types = {Etudiant.class})
public interface EtudiantProjection {
	public String getNomEtudiant();
}