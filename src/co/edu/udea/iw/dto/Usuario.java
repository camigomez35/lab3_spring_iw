package co.edu.udea.iw.dto;

/**
 * 
 * @author CamiGomez318
 * @version 1
 */
public class Usuario {
	
	/*
	 * Variables
	 */
	String login;
	String nombre;
	String apellidos;
	Rol rol;
	String Contrasena;
	
	/*
	 * Metodos getters and setters
	 */
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
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
	
	
	public Rol getRol() {
		return rol;
	}
	public void setRol(Rol rol) {
		this.rol = rol;
	}
	
	public String getContrasena() {
		return Contrasena;
	}
	public void setContrasena(String contrasena) {
		Contrasena = contrasena;
	}
	
	
}
