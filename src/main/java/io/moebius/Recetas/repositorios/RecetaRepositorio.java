package io.moebius.Recetas.repositorios;

import org.springframework.data.repository.CrudRepository;

import io.moebius.Recetas.modelos.Receta;


public interface RecetaRepositorio extends CrudRepository<Receta, Long> {

	
}
