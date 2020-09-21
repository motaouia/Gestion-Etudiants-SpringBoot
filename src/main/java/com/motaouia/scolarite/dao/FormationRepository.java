package com.motaouia.scolarite.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.motaouia.scolarite.entities.Formation;


public interface FormationRepository extends JpaRepository<Formation, Long> {

}
