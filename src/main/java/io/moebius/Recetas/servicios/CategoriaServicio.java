package io.moebius.Recetas.servicios;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import io.moebius.Recetas.modelos.Categoria;
import io.moebius.Recetas.repositorios.CategoriaRepositorio;

@Service
public class CategoriaServicio {

	private CategoriaRepositorio categoriaRepositorio;

	public CategoriaServicio(CategoriaRepositorio categoriaRepositorio) {
		this.categoriaRepositorio = categoriaRepositorio;
	}

	// findAll
	public List<Categoria> obtenerTodasLasCategorias() {
		return categoriaRepositorio.findAll();
	}

	// Encontrar por nombre de categoria
	public Optional<Categoria> obtenerCategoria(String nombre) {
		return categoriaRepositorio.findByNombre(nombre);
	}

	// Guardar una categoria
	public Categoria agregarCategoria(Categoria categoria) {
		return categoriaRepositorio.save(categoria);
	}

	// Guardar varias
	public List<Categoria> agregarCategorias(List<Categoria> categorias) {
		return categoriaRepositorio.saveAll(categorias);

	}

	// Actualizar una categoria
	public Categoria actualizarCategoria(Categoria categoria) {
		return categoriaRepositorio.save(categoria);
	}

	// Eliminar una categoria por ID
	public void eliminarCategoria(Long id) {
		categoriaRepositorio.deleteById(id);
	}

	// Eliminar una categoria por su propia entidad
	public void eliminarCategoria(Categoria categoria) {
		categoriaRepositorio.delete(categoria);
	}
}
