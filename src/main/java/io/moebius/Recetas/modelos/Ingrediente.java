package io.moebius.Recetas.modelos;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@EqualsAndHashCode(exclude = {"receta"})
@Entity
public class Ingrediente {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nombre;
	private String estado;
	private BigDecimal cantidad;
	
	@OneToOne(fetch = FetchType.EAGER)
	private UnidadMedicion unidadMedicion;
	
	@ManyToOne
	private Receta receta;
	

	public Ingrediente(String nombre, String estado, BigDecimal cantidad, UnidadMedicion unidadMedicion) {
		this.nombre = nombre;
		this.estado = estado;
		this.cantidad = cantidad;
		this.unidadMedicion = unidadMedicion;
	}

	
	public Ingrediente(String nombre, String estado, BigDecimal cantidad, UnidadMedicion unidadMedicion, Receta receta) {
		this.nombre = nombre;
		this.estado = estado;
		this.cantidad = cantidad;
		this.unidadMedicion = unidadMedicion;
		this.receta = receta;
	}

}
