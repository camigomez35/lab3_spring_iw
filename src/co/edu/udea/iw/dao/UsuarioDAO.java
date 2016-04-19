package co.edu.udea.iw.dao;

import co.edu.udea.iw.dto.Usuario;
import co.edu.udea.iw.util.MyException;

/**
 * Interface usuario
 * @author CamiGomez318
 * @version 1
 */
public interface UsuarioDAO {

	/**
	 * Metodo obtener
	 * @param login
	 * @return
	 * @throws MyException
	 */
	public Usuario obtener(String login) throws MyException;
}

