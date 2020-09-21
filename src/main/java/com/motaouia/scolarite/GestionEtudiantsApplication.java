package com.motaouia.scolarite;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;

import com.motaouia.scolarite.dao.EtudiantRepository;
import com.motaouia.scolarite.dao.FormationRepository;
import com.motaouia.scolarite.entities.Etudiant;
import com.motaouia.scolarite.entities.Formation;

@SpringBootApplication
public class GestionEtudiantsApplication implements CommandLineRunner{
	private Logger logger = LoggerFactory.getLogger(GestionEtudiantsApplication.class);
	@Autowired
	private EtudiantRepository etudiantRepository;
	
	@Autowired
	private FormationRepository formationRepository;
	
	@Autowired
	private RepositoryRestConfiguration repositoryRestConfiguration;

	public static void main(String[] args) {
		SpringApplication.run(GestionEtudiantsApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		logger.info("Inside the function run()...");
		repositoryRestConfiguration.exposeIdsFor(Formation.class, Etudiant.class);
		
		/*Formation f1= formationRepository.save(new Formation(null, "DevOps", 12, null));
		Formation f2= formationRepository.save(new Formation(null, "Java EE", 8, null));
		Formation f3= formationRepository.save(new Formation(null, "Design Pettern", 4, null));
		Formation f4= formationRepository.save(new Formation(null, "Angular", 5, null));
		
		
		//Etudiant  
		DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
		etudiantRepository.save(new Etudiant(null, "ELBERQUAOUI", "Ahmed", df.parse("30/03/1992"),f2));
		etudiantRepository.save(new Etudiant(null, "ELMEHDAOUI", "Badr", df.parse("18/10/1990"),f4));
		etudiantRepository.save(new Etudiant(null, "AZIZI", "Charaf eddine", df.parse("12/05/1989"),f1));*/
		
		etudiantRepository.findAll().forEach(etd -> {
			logger.info(etd.getNomEtudiant());
		});
		
		
	}

}
