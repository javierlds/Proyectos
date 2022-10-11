/**
 * Esto es un POJO que contiene la estructura de la tabla
 * */

package com.pruebas.entitys;

import javax.persistence.Entity;
import javax.persistence.GenerationType;
import javax.persistence.*;


@Entity  // objeto que puede ser llevado a la BD y recuperado le indica a SPRING BOOT que es una entidad
@Table(name="producto") // en que tabla se va a grabar
public class Producto {
	
	//todo esto es para que JPA genere la tabla
	@Id  //Es el id de la entidad
	@Column(name= "CODIGO")
	@GeneratedValue(strategy=GenerationType.IDENTITY) // propiedad autoincremental, estrategia que el id se autoincremente
	private int codigo;
	
	@Column(name= "NOMBRE",nullable=false, length= 30) //no puede ser nulo, y debe tener una longitud de 30
	private String nombre;
	
	@Column(name= "DESCRIPCION")
	private String descripcion;

	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
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

}
