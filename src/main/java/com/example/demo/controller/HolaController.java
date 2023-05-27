package com.example.demo.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class HolaController {
	
	@GetMapping("/")
	public String hola(Model modelo) {
	    //modelo.addAttribute("saludo", "Hola");
	    //modelo.addAttribute("nombre", " Gibson");
		//modelo.addAttribute("mensaje"," desde thymeleaf");
		//modelo.addAttribute("x", 4-2.5);
		return "redirect:/categorias";
	  
	 }
}
