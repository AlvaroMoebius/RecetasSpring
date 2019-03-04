package io.moebius.Recetas.servicios;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.moebius.Recetas.modelos.UnidadMedicion;
import io.moebius.Recetas.repositorios.UnidadMedicionRepositorio;

@Service
public class UnidadMedicionServicio {

	private UnidadMedicionRepositorio unidadMedicionRepositorio;

	public UnidadMedicionServicio(UnidadMedicionRepositorio unidadMedicionRepositorio) {
		this.unidadMedicionRepositorio = unidadMedicionRepositorio;
	}

	// findAll
	public List<UnidadMedicion> obtenerTodasLasUnidades(){
		return unidadMedicionRepositorio.findAll();
	}
	
	// Encontrar por unidadMedicion
	public Optional<UnidadMedicion> obtenerUnidad(String unidadMedicion){
		return unidadMedicionRepositorio.findByUnidadMedicion(unidadMedicion);
	}
	
	// Guardar una unidad de medición
	public UnidadMedicion agregarUnidadMedicion(UnidadMedicion unidadMedicion) {
		return unidadMedicionRepositorio.save(unidadMedicion);
	}
	
	// Actualizar una unidad de medición
	public UnidadMedicion actualizarUnidadMedicion(UnidadMedicion unidadMedicion) {
		return unidadMedicionRepositorio.save(unidadMedicion);
	}
	
	// Eliminar una unidad de medición por ID
	public void eliminarUnidadMedicion(Long id) {
		unidadMedicionRepositorio.deleteById(id);
	}
	
	// Eliminar una unidad de medición por su propia entidad
	public void eliminarUnidadMedicion(UnidadMedicion unidadMedicion) {
		unidadMedicionRepositorio.delete(unidadMedicion);
	}
	
}
