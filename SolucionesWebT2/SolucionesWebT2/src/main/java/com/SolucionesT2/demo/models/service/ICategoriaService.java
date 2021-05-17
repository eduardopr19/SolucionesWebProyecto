package com.SolucionesT2.demo.models.service;


import java.util.List;

import com.SolucionesT2.demo.models.entity.Categoria;

public interface ICategoriaService {
	
	public void save(Categoria categoria);
	public List<Categoria> findAll();
}
