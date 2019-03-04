package io.moebius.Recetas.modelos;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.OneToOne;

@Entity
public class Receta {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String descripción;
	private Integer tiempoPreparacion;
	private Integer tiempoCocina;
	private Integer comensales;
	private String fuente;
	private String url;
	private String instrucciones;
	
	//private Dificultad dificultad;
	@Lob
	private Byte[] imagen; 
	
	@OneToOne(cascade=CascadeType.ALL)
	private Nota nota;

	// GETTERS AND SETTERS
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	public String getDescripción() {
		return descripción;
	}

	

	public void setDescripción(String descripción) {
		this.descripción = descripción;
	}

	public Integer getTiempoPreparacion() {
		return tiempoPreparacion;
	}

	public void setTiempoPreparacion(Integer tiempoPreparacion) {
		this.tiempoPreparacion = tiempoPreparacion;
	}

	public Integer getTiempoCocina() {
		return tiempoCocina;
	}

	public void setTiempoCocina(Integer tiempoCocina) {
		this.tiempoCocina = tiempoCocina;
	}

	public Integer getComensales() {
		return comensales;
	}

	public void setComensales(Integer comensales) {
		this.comensales = comensales;
	}

	public String getFuente() {
		return fuente;
	}

	public void setFuente(String fuente) {
		this.fuente = fuente;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getInstrucciones() {
		return instrucciones;
	}

	public void setInstrucciones(String instrucciones) {
		this.instrucciones = instrucciones;
	}

	public Byte[] getImagen() {
		return imagen;
	}

	public void setImagen(Byte[] imagen) {
		this.imagen = imagen;
	}

	public Nota getNota() {
		return nota;
	}

	public void setNota(Nota nota) {
		this.nota = nota;
	}
	
	
	
}