package edu.ulatina.componentes.prueba;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the listacorreos database table.
 * 
 */
@Entity
@Table(name="listacorreos")
@NamedQuery(name="Listacorreo.findAll", query="SELECT l FROM Listacorreo l")
public class Listacorreo implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	private String descripcion;

	private String nombre;

	//bi-directional many-to-many association to Correo
	@ManyToMany
	@JoinTable(
		name="correoporlistacorreos"
		, joinColumns={
			@JoinColumn(name="ListaCorreos_id")
			}
		, inverseJoinColumns={
			@JoinColumn(name="Correos_id")
			}
		)
	private List<Correo> correos;

	public Listacorreo() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<Correo> getCorreos() {
		return this.correos;
	}

	public void setCorreos(List<Correo> correos) {
		this.correos = correos;
	}

}