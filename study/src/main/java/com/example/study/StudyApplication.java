package com.example.study;

import com.example.study.services.ExerciseServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StudyApplication implements CommandLineRunner {

	@Autowired
	private ExerciseServices exerciseServices;
	public static void main(String[] args) {
		SpringApplication.run(StudyApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		exerciseServices.exercise1(); // Merge LinkedList

	}
}
