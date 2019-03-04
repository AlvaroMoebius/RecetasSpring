package io.moebius.Recetas.repositorios;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import io.moebius.Recetas.modelos.UnidadMedicion;

public interface UnidadMedicionRepositorio extends JpaRepository<UnidadMedicion, Long> {
	
	// Encuentra por descriptción de la unidad de medición
	Optional<UnidadMedicion> findByUnidadMedicion(String unidadMedicion);

}
