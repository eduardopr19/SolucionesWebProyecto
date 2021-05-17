package com.SolucionesT2.demo.models.entity;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "categorias")
public class Categoria implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	@Column(name = "cat_id")
	private Long id;
	
	@Column(name = "cat_nombre")
    private String nombre;
	
	@Column(name = "cat_descripcion")
	private String descripcion;
	
	@Column(name = "cat_fecha_creacion")
	@Temporal(TemporalType.TIMESTAMP)
	private java.util.Date fecha_creacion;
	
	@PrePersist
	@PreUpdate
	public void fecha() {
		fecha_creacion=new java.util.Date();
	}

	//setters and getters
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Date getFecha_creacion() {
		return getFecha_creacion();
	}

	public void setFecha_creacion(Date fecha_creacion) {
		this.fecha_creacion = fecha_creacion;
	}
	
	
    
}