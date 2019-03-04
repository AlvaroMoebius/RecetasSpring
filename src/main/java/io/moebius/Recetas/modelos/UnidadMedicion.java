package io.moebius.Recetas.modelos;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class UnidadMedicion {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String unidadMedicion;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUnidadMedicion() {
		return unidadMedicion;
	}

	public void setUnidadMedicion(String unidadMedicion) {
		this.unidadMedicion = unidadMedicion;
	}
	
	
	
}
