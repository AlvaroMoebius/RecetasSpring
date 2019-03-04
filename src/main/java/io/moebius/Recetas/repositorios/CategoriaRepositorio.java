package io.moebius.Recetas.repositorios;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import io.moebius.Recetas.modelos.Categoria;

public interface CategoriaRepositorio extends JpaRepository<Categoria, Long> {
	
	Optional<Categoria> findByNombre(String nombre);

}
