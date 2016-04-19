package co.edu.udea.iw.dao;

import java.util.List;
import co.edu.udea.iw.dto.Cliente;
import co.edu.udea.iw.util.MyException;

/**
 * Interface Cliente
 * @author CamiGomez318
 * @version 1
 */

public interface ClienteDAO {

	public void insertar(Cliente cliente) throws MyException;
	public List<Cliente> obtener() throws MyException;
	public void modificar(Cliente cliente) throws MyException;
	public Cliente obtener(String cedula) throws MyException;
	
}
