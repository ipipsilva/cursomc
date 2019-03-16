package com.igorsilva.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.igorsilva.cursomc.domain.Categoria;
import com.igorsilva.cursomc.repositories.CategoriaRepository;
import com.igorsilva.cursomc.services.exceptions.ObjectNotFoundException;

@Service
public class CategoriaService {

	@Autowired
	private CategoriaRepository categoriaRepository;

	public Categoria buscar(Integer idCategoria) {
		Optional<Categoria> categoriaRetorno = categoriaRepository.findById(idCategoria);
		return categoriaRetorno.orElseThrow(()-> new ObjectNotFoundException("Objeto não encontrado! Id: " + idCategoria + ", Tipo: " + Categoria.class.getName()));
	}
}