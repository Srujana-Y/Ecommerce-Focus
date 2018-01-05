package com.DaoImpl;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.Dao.SupplierDao;
import com.Model.Supplier;

                                 //@Repository
@Repository("supplierDao")       //@Service
public class SupplierDaoImpl implements SupplierDao{

	@Autowired
	SessionFactory sessionFactory;
	
	                              //@Autowired
	public SupplierDaoImpl(SessionFactory sessionFactory)
	{
		this.sessionFactory=sessionFactory;
	}
	
	@Transactional

	public boolean insertSupplier(Supplier supplier) {
		try
		{
		sessionFactory.getCurrentSession().saveOrUpdate(supplier);
		System.out.println("Insertion successful");
		return true;
		}
		
		catch(Exception e)
		{
		System.out.println("Exception Arised:"+e);
		return false;
		}
		
	}
 
	public List<Supplier> retrieve()
	{
		Session session=sessionFactory.openSession();
		session.beginTransaction();
		List<Supplier> li=session.createQuery("from Supplier").list();
		session.getTransaction().commit();
		return li;
	}
  
	public Supplier findBySuppId(int sid)
	{
		Session session=sessionFactory.openSession();
		Supplier s=null;
		try
		{
			session.beginTransaction();
			s=session.get(Supplier.class, sid);
			session.getTransaction().commit();
		}
		catch(HibernateException e)
		{
			System.out.println(e.getMessage());
			session.getTransaction().rollback();
		}
		return s;
	}
}
