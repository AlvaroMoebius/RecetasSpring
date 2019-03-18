package io.moebius.Recetas.controladores;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import io.moebius.Recetas.servicios.RecetaServicio;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
public class IndexController {
	
	private final RecetaServicio recetaServicio;
	
	
	
	
	// Injección de dependencias mediante constructor
	public IndexController(RecetaServicio recetaServicio) {
		this.recetaServicio = recetaServicio;
	}

	


	@RequestMapping({"", "/", "/index", "index.html"})
	public String getIndexPage(Model model) {
		log.debug("Accediendo a la página de inicio.");
		
		model.addAttribute("recetas", recetaServicio.obtenerTodasLasRecetas());		
		return "web/index";
	}




	
}
