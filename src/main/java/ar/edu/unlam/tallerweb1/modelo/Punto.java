package ar.edu.unlam.tallerweb1.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;




@Entity
@Table(name="Punto")
public class Punto {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private Long id;
	
	@Column(name="latitud")
	private String latitud;
	
	@Column(name="longitud")
	private String longitud;

	
	// CONSTRUCTORES
	public Punto() {
	}


	public Punto(Long id, String latitud, String longitud) {
		this.id = id;
		this.latitud = latitud;
		this.longitud = longitud;
	}


	
	// METODOS
	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getLatitud() {
		return latitud;
	}


	public void setLatitud(String latitud) {
		this.latitud = latitud;
	}


	public String getLongitud() {
		return longitud;
	}


	public void setLongitud(String longitud) {
		this.longitud = longitud;
	}
	
	
	
	
	
	
	
}
