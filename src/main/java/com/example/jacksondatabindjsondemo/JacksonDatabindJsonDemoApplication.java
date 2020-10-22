package com.example.jacksondatabindjsondemo;

import com.example.jacksondatabindjsondemo.domain.Student;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.File;
import java.io.IOException;

@SpringBootApplication
public class JacksonDatabindJsonDemoApplication {

	public static void main(String[] args) {

		SpringApplication.run(JacksonDatabindJsonDemoApplication.class, args);


		try {

			// create object mapper
			ObjectMapper mapper = new ObjectMapper();

			//read json file and convert to Java POJO
			Student myStudent = mapper.readValue(new File("data/sample-lite.json"), Student.class);

			//print
			System.out.println(myStudent);

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
