package com.igorsilva.cursomc.resources;

import java.io.Serializable;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/categorias")
public class CategoriaResource implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3971382025645401918L;

	@RequestMapping(method = RequestMethod.GET)
	public String listar() {
		return "REST está funcionando!";
	}
}