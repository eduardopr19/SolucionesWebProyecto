package com.SolucionesT2.demo.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.SolucionesT2.demo.models.entity.Categoria;

public interface ICategoriaDAO extends CrudRepository<Categoria, Long>{

}
