package io.moebius.Recetas.controladores;

import java.util.Optional;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import io.moebius.Recetas.modelos.Categoria;
import io.moebius.Recetas.modelos.UnidadMedicion;
import io.moebius.Recetas.repositorios.CategoriaRepositorio;
import io.moebius.Recetas.repositorios.UnidadMedicionRepositorio;

@Controller
public class IndexController {
	
	private CategoriaRepositorio categoriaRepositorio;
	private UnidadMedicionRepositorio unidadMedicionRepositorio;
	
	
	
	
	// Injección de dependencias mediante constructori
	public IndexController(CategoriaRepositorio categoriaRepositorio, UnidadMedicionRepositorio unidadMedicionRepositorio) {
		this.categoriaRepositorio = categoriaRepositorio;
		this.unidadMedicionRepositorio = unidadMedicionRepositorio;
	}





	@RequestMapping({"", "/", "/index", "index.html"})
	public String getIndexPage() {
		
		Optional<Categoria> categoriaOpcional = categoriaRepositorio.findByNombre("Ensaladas");
		Optional<UnidadMedicion> UnidadMedicionOpcional = unidadMedicionRepositorio.findByUnidadMedicion("gr");
		
		System.out.printf("El id de la categoría es %s\n", categoriaOpcional.get().getId());
		System.out.printf("El id de la unidad de medición es %s", UnidadMedicionOpcional.get().getId());
		
		return "web/index";
	}

}
