package com.example.demo.controller;


import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.repositories.CategoriaRepository;
import com.example.demo.entities.Categoria;

@RestController
@RequestMapping("/categorias")
public class CategoriaController {

/*
	@Autowired
	CategoriaRepository categoriaRepository;
	
	@GetMapping("/{id}")
	public String categoriaById(@PathVariable Integer  id) {
		Optional<Categoria> categoria = categoriaRepository.findById(id);
		
		if (categoria.isPresent()) {
			return categoria.get().getDescripcion();
		}
		
		return null;
	}
	
	
*/
	
	@GetMapping("/list")
	public String allCategorias() {
		return "Listar categorias";
	}

	@PostMapping
	public String addCategorias(@RequestBody Categoria categoria) {
		return "Post categorias";
	}
	
	@PutMapping("/{id}")
	public String updateCategoria(@PathVariable Integer id, @RequestBody Categoria categoria) {
		return "Actualizar categoria "+ id;
	}
	
	@DeleteMapping("/{id}")
	public String deleteCategoria(@PathVariable Integer id) {
		return "Categoria eliminada";
	}
	
	@GetMapping("/status")
	public String status() {
		return "El pepe";
	}
	

}
