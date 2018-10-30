package edu.ulatina.componentes.prueba;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the persona database table.
 * 
 */
@Entity
@NamedQuery(name="Persona.findAll", query="SELECT p FROM Persona p")
public class Persona implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	private String apellido;

	private String contrasena;

	private String correo;

	@Temporal(TemporalType.DATE)
	private Date fechaNacimiento;

	private String nombre;

	private String segundoApellido;

	private String sexo;

	private String telefono;

	//bi-directional many-to-one association to Correosenviar
	@OneToMany(mappedBy="persona")
	private List<Correosenviar> correosenviars;

	//bi-directional many-to-many association to Role
	@ManyToMany(mappedBy="personas")
	private List<Role> roles;

	//bi-directional many-to-one association to Publicacione
	@OneToMany(mappedBy="persona")
	private List<Publicacione> publicaciones;

	public Persona() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getApellido() {
		return this.apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getContrasena() {
		return this.contrasena;
	}

	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}

	public String getCorreo() {
		return this.correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public Date getFechaNacimiento() {
		return this.fechaNacimiento;
	}

	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getSegundoApellido() {
		return this.segundoApellido;
	}

	public void setSegundoApellido(String segundoApellido) {
		this.segundoApellido = segundoApellido;
	}

	public String getSexo() {
		return this.sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getTelefono() {
		return this.telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public List<Correosenviar> getCorreosenviars() {
		return this.correosenviars;
	}

	public void setCorreosenviars(List<Correosenviar> correosenviars) {
		this.correosenviars = correosenviars;
	}

	public Correosenviar addCorreosenviar(Correosenviar correosenviar) {
		getCorreosenviars().add(correosenviar);
		correosenviar.setPersona(this);

		return correosenviar;
	}

	public Correosenviar removeCorreosenviar(Correosenviar correosenviar) {
		getCorreosenviars().remove(correosenviar);
		correosenviar.setPersona(null);

		return correosenviar;
	}

	public List<Role> getRoles() {
		return this.roles;
	}

	public void setRoles(List<Role> roles) {
		this.roles = roles;
	}

	public List<Publicacione> getPublicaciones() {
		return this.publicaciones;
	}

	public void setPublicaciones(List<Publicacione> publicaciones) {
		this.publicaciones = publicaciones;
	}

	public Publicacione addPublicacione(Publicacione publicacione) {
		getPublicaciones().add(publicacione);
		publicacione.setPersona(this);

		return publicacione;
	}

	public Publicacione removePublicacione(Publicacione publicacione) {
		getPublicaciones().remove(publicacione);
		publicacione.setPersona(null);

		return publicacione;
	}

}