package co.edu.udea.iw.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.spi.ThrowableRendererSupport;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import co.edu.udea.iw.dto.Ciudad;
import co.edu.udea.iw.util.MyException;

/**
 * CRUD ciudad
 * @author CamiGomez318
 * @version 1
 */
public class CiudadDAOImpl extends HibernateDaoSupport implements CiudadDAO {

	@Override
	public void insertar(Ciudad ciudad) throws MyException {
		Session session = null; 
		try {
			session = getSession();
			Transaction tr = session.beginTransaction();
			session.save(ciudad);
			tr.commit();
		} catch (HibernateException e) {
			throw new MyException(e);
		}finally{
			if(session != null){
				session.close();
			}
		}
		
	}

	@Override
	public List<Ciudad> obtener() throws MyException {
		Session session = null;
		List <Ciudad> ciudades = null; 
		try {
			session = getSession();
			Criteria criteria = session.createCriteria(Ciudad.class);
			ciudades = criteria.list();
		} catch (HibernateException e) {
			throw new MyException(e);
		}finally{
			if(session != null){
				session.close();
			}
		}
		return ciudades;
	}

	@Override
	public void modificar(Ciudad ciudad) throws MyException {
		Session session = null; 
		try {
			session = getSession();
			Transaction tr = session.beginTransaction();
			session.update(ciudad);
			tr.commit();
		} catch (HibernateException e) {
			throw new MyException(e);
		}finally{
			if(session != null){
				session.close();
			}
		}
		
	}

	@Override
	public void eliminar(Ciudad ciudad) throws MyException {
		Session session = null; 
		try {
			session = getSession();
			Transaction tr = session.beginTransaction();
			session.delete(ciudad);
			tr.commit();
		} catch (HibernateException e) {
			throw new MyException(e);
		}finally{
			if(session != null){
				session.close();
			}
		}
		
	}

	@Override
	public Ciudad obtener(Long codigo) throws MyException {
		Ciudad ciudad = null;
		Session session = null;
		try {
			session = getSession();
			Criteria criteria =  session.createCriteria(Ciudad.class)
					.add(Restrictions.eq("codigo", codigo));
			ciudad = (Ciudad)criteria.uniqueResult();
		} catch (HibernateException e) {
			throw new MyException(e);
		}finally {
			if (session != null){
				session.close();
			}
		}
		return ciudad;
	}

}
