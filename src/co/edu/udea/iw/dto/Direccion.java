package co.edu.udea.iw.dto;

/**
 * 
 * @author CamiGomez318
 * @version 1
 */
public class Direccion {

	/*
	 * Variables glovales
	 */
	private DireccionId direccionId;
	private Ciudad ciudad;
	private String direccion;
	private String telefono;
	private Boolean preferida;

	
	/*
	 * Getters and Setters
	 */
	
	public DireccionId getDireccionId() {
		return direccionId;
	}
	public void setDireccionId(DireccionId direccionId) {
		this.direccionId = direccionId;
	}
	public Ciudad getCiudad() {
		return ciudad;
	}
	public void setCiudad(Ciudad ciudad) {
		this.ciudad = ciudad;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public Boolean getPreferida() {
		return preferida;
	}
	public void setPreferida(Boolean preferida) {
		this.preferida = preferida;
	}
	
}
