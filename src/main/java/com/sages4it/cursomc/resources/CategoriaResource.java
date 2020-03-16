package com.sages4it.cursomc.resources;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.sages4it.cursomc.domain.Categoria;

@RestController
@RequestMapping(value = "/categorias")
public class CategoriaResource {

	@RequestMapping(method = RequestMethod.GET)
	public List<Categoria> listar() {
	Categoria cat1 = new Categoria(1, "Informatica");
	Categoria cat2 = new Categoria(2, "Escritorio");
	
	List<Categoria> list = new ArrayList<>();
	list.addAll(Arrays.asList(cat1, cat2));
		
		return list;
	}
}
