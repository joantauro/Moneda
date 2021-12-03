package com.proyecto.moneda.service;

import java.util.List;

import com.proyecto.moneda.dao.Moneda;
import com.proyecto.moneda.response.MonedaResponse;

public interface MonedaService {
	
	List<Moneda> findAll();
	MonedaResponse calcularMonto(double monto,String monedaOrigen,String monedaDestino);
}
