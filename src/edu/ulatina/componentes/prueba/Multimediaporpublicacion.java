package edu.ulatina.componentes.prueba;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the multimediaporpublicacion database table.
 * 
 */
@Entity
@NamedQuery(name="Multimediaporpublicacion.findAll", query="SELECT m FROM Multimediaporpublicacion m")
public class Multimediaporpublicacion implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private MultimediaporpublicacionPK id;

	public Multimediaporpublicacion() {
	}

	public MultimediaporpublicacionPK getId() {
		return this.id;
	}

	public void setId(MultimediaporpublicacionPK id) {
		this.id = id;
	}

}