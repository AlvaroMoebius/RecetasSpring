package io.moebius.Recetas.modelos;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(exclude = {"recetas"})
@Entity
public class Categoria {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nombre;
	private String descripcion;
	
	// Indicamos el ATRIBUTO del otro objeto por medio del cual están relacionados en la nueva tabla
	@ManyToMany(mappedBy = "categorias")
	private Set<Receta> recetas;
	
	
}
