package io.moebius.Recetas.controladores;

import java.util.Optional;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import io.moebius.Recetas.modelos.Categoria;
import io.moebius.Recetas.modelos.UnidadMedicion;
import io.moebius.Recetas.repositorios.CategoriaRepositorio;
import io.moebius.Recetas.repositorios.UnidadMedicionRepositorio;
import io.moebius.Recetas.servicios.RecetaServicio;

@Controller
public class IndexController {
	
	private final RecetaServicio recetaServicio;
	
	
	
	
	// Injección de dependencias mediante constructor
	public IndexController(RecetaServicio recetaServicio) {
		this.recetaServicio = recetaServicio;
	}

	


	@RequestMapping({"", "/", "/index", "index.html"})
	public String getIndexPage(Model model) {
		
		model.addAttribute("recetas", recetaServicio.obtenerTodasLasRecetas());		
		return "web/index";
	}




	
}
