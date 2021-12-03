package com.proyecto.moneda.dao;

import javax.persistence.*;

@Entity
@Table(name="Moneda")
public class Moneda {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private String monedaorigen;
	private String monedadestino;
	private double tipocambio;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getMonedaorigen() {
		return monedaorigen;
	}
	public void setMonedaorigen(String monedaorigen) {
		this.monedaorigen = monedaorigen;
	}
	public String getMonedadestino() {
		return monedadestino;
	}
	public void setMonedadestino(String monedadestino) {
		this.monedadestino = monedadestino;
	}
	public double getTipocambio() {
		return tipocambio;
	}
	public void setTipocambio(double tipocambio) {
		this.tipocambio = tipocambio;
	}
	
	
	 
	

	
}
