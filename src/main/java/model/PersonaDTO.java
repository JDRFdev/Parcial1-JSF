package model;

import java.io.Serializable;

public class PersonaDTO implements Serializable{

	private static final long serialVersionUID = -7655699643466439244L;
	private String nombre;
	private String apellidos;
	private String correo;
	private String telefono;
	public PersonaDTO() {}
	public PersonaDTO(String nombre, String apellidos, String correo, String telefono) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.correo = correo;
		this.telefono = telefono;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	
	

}
