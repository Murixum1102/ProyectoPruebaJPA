package edu.ulatina.componentes.prueba;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the redsocial database table.
 * 
 */
@Entity
@NamedQuery(name="Redsocial.findAll", query="SELECT r FROM Redsocial r")
public class Redsocial implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	private String descripcion;

	private String nombre;

	//bi-directional many-to-one association to Publicacione
	@OneToMany(mappedBy="redsocial")
	private List<Publicacione> publicaciones;

	public Redsocial() {
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

	public List<Publicacione> getPublicaciones() {
		return this.publicaciones;
	}

	public void setPublicaciones(List<Publicacione> publicaciones) {
		this.publicaciones = publicaciones;
	}

	public Publicacione addPublicacione(Publicacione publicacione) {
		getPublicaciones().add(publicacione);
		publicacione.setRedsocial(this);

		return publicacione;
	}

	public Publicacione removePublicacione(Publicacione publicacione) {
		getPublicaciones().remove(publicacione);
		publicacione.setRedsocial(null);

		return publicacione;
	}

}