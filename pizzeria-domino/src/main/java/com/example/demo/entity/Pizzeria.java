package com.example.demo.entity;

import java.util.List;

public class Pizzeria {

	private Integer idPizzeria;
	
	List<Pizza> listadoPizzas;
	
	private String direccion;
	

	private String sede;


	public Integer getIdPizzeria() {
		return idPizzeria;
	}


	public void setIdPizzeria(Integer idPizzeria) {
		this.idPizzeria = idPizzeria;
	}


	public List<Pizza> getListadoPizzas() {
		return listadoPizzas;
	}


	public void setListadoPizzas(List<Pizza> listadoPizzas) {
		this.listadoPizzas = listadoPizzas;
	}


	public String getDireccion() {
		return direccion;
	}


	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}


	public String getSede() {
		return sede;
	}


	public void setSede(String sede) {
		this.sede = sede;
	}
}
