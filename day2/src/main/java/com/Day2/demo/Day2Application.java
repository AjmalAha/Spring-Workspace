package com.Day2.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.person.JasonIgnore;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@SpringBootApplication
public class Day2Application {

	public static void main(String[] args) throws JsonProcessingException {
		SpringApplication.run(Day2Application.class, args);
		JasonIgnore jas=new JasonIgnore(1,"Ajmal",21);
		ObjectMapper obj=new ObjectMapper();
		String ign=obj.writeValueAsString(jas);
		System.out.println(ign);
	}

}