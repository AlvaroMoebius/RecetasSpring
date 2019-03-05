package io.moebius.Recetas.modelos;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

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
	

	public Ingrediente(String nombre, String estado, BigDecimal cantidad, UnidadMedicion unidadMedicion, Receta receta) {
		super();
		this.nombre = nombre;
		this.estado = estado;
		this.cantidad = cantidad;
		this.unidadMedicion = unidadMedicion;
		this.receta = receta;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescripcion() {
		return nombre;
	}

	public void setDescripcion(String descripcion) {
		this.nombre = descripcion;
	}

	public BigDecimal getCantidad() {
		return cantidad;
	}

	public void setCantidad(BigDecimal cantidad) {
		this.cantidad = cantidad;
	}

	public Receta getReceta() {
		return receta;
	}

	public void setReceta(Receta receta) {
		this.receta = receta;
	}

	public UnidadMedicion getUnidadMedicion() {
		return unidadMedicion;
	}

	public void setUnidadMedicion(UnidadMedicion unidadMedicion) {
		this.unidadMedicion = unidadMedicion;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}
	
	
	
	
}
