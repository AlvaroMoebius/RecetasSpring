package io.moebius.Recetas.repositorios;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import io.moebius.Recetas.modelos.Receta;


public interface RecetaRepositorio extends JpaRepository<Receta, Long> {
	
	public Optional<Receta> findByNombre(String nombre);

	
}
