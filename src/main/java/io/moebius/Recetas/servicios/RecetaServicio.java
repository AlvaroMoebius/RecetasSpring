package io.moebius.Recetas.servicios;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.moebius.Recetas.modelos.Receta;
import io.moebius.Recetas.repositorios.RecetaRepositorio;

@Service
public class RecetaServicio {

	private RecetaRepositorio recetaRepositorio;

	public RecetaServicio(RecetaRepositorio recetaRepositorio) {
		this.recetaRepositorio = recetaRepositorio;
	}

	// findAll
	public List<Receta> obtenerTodasLasRecetas() {
		return recetaRepositorio.findAll();
	}

	// Encontrar por nombre de receta
	public Optional<Receta> obtenerReceta(String nombre) {
		return recetaRepositorio.findByNombre(nombre);
	}

	// Guardar una receta
	public Receta agregarReceta(Receta receta) {
		return recetaRepositorio.save(receta);
	}

	// Guardar varias
	public List<Receta> agregarRecetas(List<Receta> recetas) {
		return recetaRepositorio.saveAll(recetas);

	}

	// Actualizar una receta
	public Receta actualizarReceta(Receta receta) {
		return recetaRepositorio.save(receta);
	}

	// Eliminar una receta por ID
	public void eliminarReceta(Long id) {
		recetaRepositorio.deleteById(id);
	}

	// Eliminar una receta por su propia entidad
	public void eliminarReceta(Receta receta) {
		recetaRepositorio.delete(receta);
	}

}
