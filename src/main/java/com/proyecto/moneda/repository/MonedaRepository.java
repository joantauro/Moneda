package com.proyecto.moneda.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.proyecto.moneda.dao.Moneda;

@Repository
public interface MonedaRepository extends JpaRepository<Moneda, Long>{
	
	@Query("select m from Moneda m where monedaOrigen=:monOrigen and monedaDestino=:monDestino")
	Moneda findByDescripcion(String monOrigen,String monDestino);
}
