package co.edu.udea.iw.dto;

import java.util.Date;
import java.util.Set;

/**
 *  
 * @author CamiGomez318
 * @version 1
 */
public class Cliente {

	//Variables
	private String cedula;
	private String nombres;
	private String apellidos;
	private String email;
	private Cliente UsuarioCrea;
	private Date fechaCreacion;
	private Cliente usuarioModifica;
	private Date fechaModificacion;
	private boolean eliminado;
	private Cliente usuarioElimina;
	private Date fechaEliminacion;
	private Set<Direccion> direccion;
	
	
	/*
	 * Metodos getters and Setters
	 */
	public String getCedula() {
		return cedula;
	}
	public void setCedula(String cedula) {
		this.cedula = cedula;
	}
	public String getNombres() {
		return nombres;
	}
	public void setNombres(String nombres) {
		this.nombres = nombres;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Cliente getUsuarioCrea() {
		return UsuarioCrea;
	}
	public void setUsuarioCrea(Cliente usuarioCrea) {
		UsuarioCrea = usuarioCrea;
	}
	public Date getFechaCreacion() {
		return fechaCreacion;
	}
	public void setFechaCreacion(Date fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}
	public Cliente getUsuarioModifica() {
		return usuarioModifica;
	}
	public void setUsuarioModifica(Cliente usuarioModificaa) {
		this.usuarioModifica = usuarioModifica;
	}
	public Date getFechaModificacion() {
		return fechaModificacion;
	}
	public void setFechaModificacion(Date fechaModificacion) {
		this.fechaModificacion = fechaModificacion;
	}
	public boolean isEliminado() {
		return eliminado;
	}
	public void setEliminado(boolean eliminado) {
		this.eliminado = eliminado;
	}
	public Cliente getUsuarioElimina() {
		return usuarioElimina;
	}
	public void setUsuarioElimina(Cliente usuarioElimina) {
		this.usuarioElimina = usuarioElimina;
	}
	public Date getFechaEliminacion() {
		return fechaEliminacion;
	}
	public void setFechaEliminacion(Date fechaEliminacion) {
		this.fechaEliminacion = fechaEliminacion;
	}
	public Set<Direccion> getDireccion() {
		return direccion;
	}
	public void setDireccion(Set<Direccion> direccion) {
		this.direccion = direccion;
	}
	
	
}
