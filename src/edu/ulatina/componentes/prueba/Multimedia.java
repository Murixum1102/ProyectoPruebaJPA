package edu.ulatina.componentes.prueba;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the multimedia database table.
 * 
 */
@Entity
@NamedQuery(name="Multimedia.findAll", query="SELECT m FROM Multimedia m")
public class Multimedia implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	private String url;

	public Multimedia() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUrl() {
		return this.url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

}