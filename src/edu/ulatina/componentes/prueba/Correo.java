package edu.ulatina.componentes.prueba;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the correos_ database table.
 * 
 */
@Entity
@Table(name="correos")
@NamedQuery(name="Correo.findAll", query="SELECT c FROM Correo c")
public class Correo implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	private String correo;

	//bi-directional many-to-many association to Listacorreo
	@ManyToMany(mappedBy="correos")
	private List<Listacorreo> listacorreos;

	public Correo() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCorreo() {
		return this.correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public List<Listacorreo> getListacorreos() {
		return this.listacorreos;
	}

	public void setListacorreos(List<Listacorreo> listacorreos) {
		this.listacorreos = listacorreos;
	}

}