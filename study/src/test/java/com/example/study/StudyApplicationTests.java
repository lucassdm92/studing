package com.example.study;

import com.example.study.services.ExerciseServices;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class StudyApplicationTests implements CommandLineRunner {

	@Autowired
	private ExerciseServices exerciseServices;
	@Test
	void contextLoads() {
	}

	@Override
	public void run(String... args) throws Exception {

		exerciseServices.exercise1();
	}
}
