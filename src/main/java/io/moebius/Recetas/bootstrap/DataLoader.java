package io.moebius.Recetas.bootstrap;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

import io.moebius.Recetas.enums.Dificultad;
import io.moebius.Recetas.modelos.Categoria;
import io.moebius.Recetas.modelos.Ingrediente;
import io.moebius.Recetas.modelos.Nota;
import io.moebius.Recetas.modelos.Receta;
import io.moebius.Recetas.modelos.UnidadMedicion;
import io.moebius.Recetas.servicios.CategoriaServicio;
import io.moebius.Recetas.servicios.RecetaServicio;
import io.moebius.Recetas.servicios.UnidadMedicionServicio;

public class DataLoader implements CommandLineRunner {


	@Override
	public void run(String... args) throws Exception {
		
		List<Receta> recetas = new ArrayList<>();

		// Inicialización de los datos
		if (recetaServicio.obtenerTodasLasRecetas().size() == 0) {
			recetas = cargarRecetas();
		}
		
		
	}

	

}
