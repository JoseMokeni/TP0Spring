package com.example.tp0.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MonControlleur {
	
	//@GetMapping(value = "/index")
	/*public String affiche(@RequestParam(value = "nom", required = false, defaultValue = "JEE") String nom) {
		System.out.println(nom);
		return "index.html";
	}*/
	@GetMapping(value="/index/{nom}")
	public String affiche(@PathVariable(value = "nom") String nom) {
		System.out.println(nom);
		return "index.html";
	}
}
