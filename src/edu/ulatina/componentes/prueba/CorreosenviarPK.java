package edu.ulatina.componentes.prueba;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the correosenviar database table.
 * 
 */
@Embeddable
public class CorreosenviarPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	private int id;

	@Column(insertable=false, updatable=false)
	private int persona_id;

	public CorreosenviarPK() {
	}
	public int getId() {
		return this.id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getPersona_id() {
		return this.persona_id;
	}
	public void setPersona_id(int persona_id) {
		this.persona_id = persona_id;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof CorreosenviarPK)) {
			return false;
		}
		CorreosenviarPK castOther = (CorreosenviarPK)other;
		return 
			(this.id == castOther.id)
			&& (this.persona_id == castOther.persona_id);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.id;
		hash = hash * prime + this.persona_id;
		
		return hash;
	}
}