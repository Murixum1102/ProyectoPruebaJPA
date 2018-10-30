package edu.ulatina.componentes.prueba;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the correosenviar database table.
 * 
 */
@Entity
@NamedQuery(name="Correosenviar.findAll", query="SELECT c FROM Correosenviar c")
public class Correosenviar implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private CorreosenviarPK id;

	@Lob
	private String asunto;

	private String contenido;

	//bi-directional many-to-one association to Persona
	@ManyToOne
	private Persona persona;

	public Correosenviar() {
	}

	public CorreosenviarPK getId() {
		return this.id;
	}

	public void setId(CorreosenviarPK id) {
		this.id = id;
	}

	public String getAsunto() {
		return this.asunto;
	}

	public void setAsunto(String asunto) {
		this.asunto = asunto;
	}

	public String getContenido() {
		return this.contenido;
	}

	public void setContenido(String contenido) {
		this.contenido = contenido;
	}

	public Persona getPersona() {
		return this.persona;
	}

	public void setPersona(Persona persona) {
		this.persona = persona;
	}

}