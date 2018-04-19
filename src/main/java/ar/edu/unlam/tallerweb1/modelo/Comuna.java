package ar.edu.unlam.tallerweb1.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;



@Entity
@Table(name="Comuna")
public class Comuna {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private Long id;
	
	@Column(name="nombre")
	private String nombre;
	
	@OneToMany
	private Barrio barrio;

	
	
	
	
	// CONSTRUCTORES
	public Comuna() {
	}

	
	public Comuna(Long id, String nombre, Barrio barrio) {
		this.id = id;
		this.nombre = nombre;
		this.barrio = barrio;
	}


	
	// METODOS
	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public Barrio getBarrio() {
		return barrio;
	}


	public void setBarrio(Barrio barrio) {
		this.barrio = barrio;
	}
	
	
	
	
}
