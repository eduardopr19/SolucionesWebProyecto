package com.SolucionesT2.demo.models.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.SolucionesT2.demo.models.dao.ICategoriaDAO;
import com.SolucionesT2.demo.models.entity.Categoria;

@Service
public class CategoriaServiceImpl implements ICategoriaService {

	@Autowired
    private ICategoriaDAO categoriaDAO;
	
    @Override
    public void save(Categoria categoria) {
    categoriaDAO.save(categoria);
	}

	@Override
	public List<Categoria> findAll() {
		
		return (List<Categoria>)categoriaDAO.findAll();
	}
    
}
