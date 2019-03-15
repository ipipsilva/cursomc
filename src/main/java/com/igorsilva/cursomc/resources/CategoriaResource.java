package com.igorsilva.cursomc.resources;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.igorsilva.cursomc.domain.Categoria;

@RestController
@RequestMapping(value = "/categorias")
public class CategoriaResource implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3971382025645401918L;

	@RequestMapping(method = RequestMethod.GET)
	public List<Categoria> listar() {

		Categoria categoria1 = new Categoria(1, "Informática");
		Categoria categoria2 = new Categoria(2, "Escritório");

		List<Categoria> categorias = new ArrayList<Categoria>();

		categorias.add(categoria1);
		categorias.add(categoria2);

		return categorias;
	}
}