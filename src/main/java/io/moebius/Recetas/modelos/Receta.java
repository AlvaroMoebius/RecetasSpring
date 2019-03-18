package io.moebius.Recetas.modelos;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.Lob;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import io.moebius.Recetas.enums.Dificultad;
import lombok.Data;

@Data
@Entity
public class Receta {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String nombre;
	private String descripcion;
	private Integer tiempoPreparacion;
	private Integer tiempoCocina;
	private Integer comensales;
	private String fuente;
	private String url;
	
	@Lob
	private String instrucciones;
	
	@Enumerated(value = EnumType.STRING)
	private Dificultad dificultad;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "receta")
	private Set<Ingrediente> ingredientes = new HashSet<>();
	
	@Lob
	private Byte[] imagen; 
	
	@OneToOne(cascade = CascadeType.ALL)
	private Nota nota;
	
	@ManyToMany
	@JoinTable(name = "receta_categoria",
			joinColumns = @JoinColumn(name = "receta_id"),
			inverseJoinColumns = @JoinColumn(name = "categoria_id"))
	private Set<Categoria> categorias = new HashSet<>();

	
	public void setNota(Nota nota) {
		this.nota = nota;
		nota.setReceta(this);
	}
	
	public Receta agregarIngrediente(Ingrediente ingrediente) {
		ingrediente.setReceta(this);
		this.ingredientes.add(ingrediente);
		return this;
	}
	
}
