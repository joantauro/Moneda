package com.proyecto.moneda.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.proyecto.moneda.dao.Moneda;
import com.proyecto.moneda.response.MonedaResponse;
import com.proyecto.moneda.service.MonedaService;

@RestController
@RequestMapping (value="Moneda")
public class MonedaController {

	@Autowired
	private MonedaService monedaService;
	
	@GetMapping(value="listarMonedas")
	public List<Moneda> getTasks() {
		return monedaService.findAll();
	}
	
	@GetMapping(value="Calcular")
	public MonedaResponse getCalcular(@RequestParam double monto,@RequestParam String monedaOrigen,@RequestParam String monedaDestino) {
		return monedaService.calcularMonto(monto, monedaOrigen, monedaDestino);
	}
}
