package co.edu.udea.iw.dto;

import java.io.Serializable;

/**
 * Clave primaria de direccionID
 * @author CamiGomez318
 * @version 1
 */
public class DireccionId implements Serializable{
	
	/*
	 * Variables
	 */
	private long codigo;
	private Cliente cliente;
	
	/*
	 * Getters and Setters
	 */
	public long getCodigo() {
		return codigo;
	}
	public void setCodigo(long codigo) {
		this.codigo = codigo;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	
}