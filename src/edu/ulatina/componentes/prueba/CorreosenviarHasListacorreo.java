package edu.ulatina.componentes.prueba;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the correosenviar_has_listacorreos database table.
 * 
 */
@Entity
@Table(name="correosenviar_has_listacorreos")
@NamedQuery(name="CorreosenviarHasListacorreo.findAll", query="SELECT c FROM CorreosenviarHasListacorreo c")
public class CorreosenviarHasListacorreo implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private CorreosenviarHasListacorreoPK id;

	public CorreosenviarHasListacorreo() {
	}

	public CorreosenviarHasListacorreoPK getId() {
		return this.id;
	}

	public void setId(CorreosenviarHasListacorreoPK id) {
		this.id = id;
	}

}