package com.proyecto.moneda.service.impl;

import java.util.List;

import org.hibernate.criterion.Example;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.proyecto.moneda.dao.Moneda;
import com.proyecto.moneda.repository.MonedaRepository;
import com.proyecto.moneda.response.MonedaResponse;
import com.proyecto.moneda.service.MonedaService;

@Service
public class MonedaServiceImpl implements MonedaService{

	@Autowired
	private MonedaRepository monedaRepository;
	
	@Override
	public List<Moneda> findAll() {
	 
		return  monedaRepository.findAll();
	 
	}

	@Override
	public MonedaResponse calcularMonto(double monto, String monedaOrigen, String monedaDestino) {

		double tipoCambio = monedaRepository.findByDescripcion(monedaOrigen,monedaDestino).getTipocambio();
		double montoDevuelto = monto*tipoCambio;
		
		MonedaResponse response  = new MonedaResponse();
		response.setMonto(monto);
		response.setMontoConTipoCambio(montoDevuelto);
		response.setTipoDeCambio(tipoCambio);
		response.setMonedaOrigen(monedaOrigen);
		response.setMonedaDestino(monedaDestino);

		return response;
	}

}
