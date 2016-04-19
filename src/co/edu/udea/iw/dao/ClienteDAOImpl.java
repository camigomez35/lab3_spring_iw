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
import co.edu.udea.iw.dto.Cliente;
import co.edu.udea.iw.util.MyException;

/**
 * CRUD Cliente
 * @author CamiGomez318
 * @version 1
 */
public class ClienteDAOImpl extends HibernateDaoSupport implements ClienteDAO {

	@Override
	public void insertar(Cliente cliente) throws MyException {
		Session session = null; 
		try {
			session = getSession();
			Transaction tr = session.beginTransaction();
			session.save(cliente);
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
	public List<Cliente> obtener() throws MyException {
		Session session = null;
		List <Cliente> clientes = null; 
		try {
			session = getSession();
			Criteria criteria = session.createCriteria(Cliente.class)
					.add(Restrictions.eq("eliminado", 1));
		
			clientes = criteria.list();
		} catch (HibernateException e) {
			throw new MyException(e);
		}finally{
			if(session != null){
				session.close();
			}
		}
		return clientes;
	}

	@Override
	public void modificar(Cliente cliente) throws MyException {
		Session session = null; 
		try {
			session = getSession();
			Transaction tr = session.beginTransaction();
			session.update(cliente);
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
	public Cliente obtener(String cedula) throws MyException {
		Cliente cliente = null;
		Session session = null;
		try {
			session = getSession();
			Criteria criteria =  session.createCriteria(Ciudad.class)
					.add(Restrictions.eq("cedula", cedula));
			cliente = (Cliente)criteria.uniqueResult();
		} catch (HibernateException e) {
			throw new MyException(e);
		}finally {
			if (session != null){
				session.close();
			}
		}
		return cliente;
	}

}
