package co.edu.udea.iw.dao;

import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import co.edu.udea.iw.dto.Usuario;
import co.edu.udea.iw.util.MyException;

/**
 * CRUD Usuario 
 * @author CamiGomez318
 * @version 1
 */
public class UsuarioDAOImpl extends HibernateDaoSupport implements UsuarioDAO{
	
	
	@Override
	public Usuario obtener(String login) throws MyException {
		Usuario usuario = null;
		Session session = null;
		try {
			session = getSession();
			Criteria criteria =  session.createCriteria(Usuario.class)
					.add(Restrictions.eq("login", login));
			usuario = (Usuario)criteria.uniqueResult();
		} catch (HibernateException e) {
			throw new MyException(e);
		}finally {
			if (session != null){
				session.close();
			}
		}
		return usuario;
	}

}
