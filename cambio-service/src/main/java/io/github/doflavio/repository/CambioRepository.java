package io.github.doflavio.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import io.github.doflavio.model.Cambio;

public interface CambioRepository extends JpaRepository<Cambio, Long> {

	Cambio findByFromAndTo(String from, String to);
	
}