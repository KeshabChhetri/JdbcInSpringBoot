package com.springbootjdbc;

import com.springbootjdbc.dao.ProfessorDao;
import com.springbootjdbc.model.Professor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootJdbcApplication implements CommandLineRunner {

	@Autowired
	private ProfessorDao professorDao;
	public static void main(String[] args) {

		SpringApplication.run(SpringBootJdbcApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		//createProfessor();
		
	//getProfessorById();
		
	//professorDao.updateProfessorP_nameById(2, "Nurologist");
		
	professorDao.deleteProfessorById(1);
		
	}

	private void getProfessorById() {
		Professor prof = professorDao.getProfessorById(2);
		System.out.println("Professor info by id number");
		System.out.println(prof);
	}

	
	private void createProfessor() {
		Professor prof = new Professor();
		prof.setP_name("Limnology");
		prof.setS_name("Dr.Suntali");

		professorDao.createProfessor(prof);
	}
}
