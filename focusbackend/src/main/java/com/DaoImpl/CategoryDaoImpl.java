package com.DaoImpl;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.Dao.CategoryDao;
import com.Model.Category;
import com.Model.Supplier;

@Repository("categoryDao")
public class CategoryDaoImpl implements CategoryDao{

	@Autowired
	SessionFactory sessionFactory;
	
	public CategoryDaoImpl(SessionFactory sessionFactory)
	{
		this.sessionFactory=sessionFactory;
	}
	
	@Transactional
	
	 public boolean insertCategory(Category category) 
	{
		
		try
		{
		sessionFactory.getCurrentSession().saveOrUpdate(category);
		System.out.println("Insertion successful");
		return true;
		}
		
		catch(Exception e)
		{
		System.out.println("Exception Arised:"+e);
		return false;
		}
		
	}

	public List<Category> retrieve()
	{
		Session session=sessionFactory.openSession();
		session.beginTransaction();
		List<Category> li=session.createQuery("from Category").list();
		session.getTransaction().commit();
		return li;
	}
  
	public Category findByCatId(int cid)
	{
		Session session=sessionFactory.openSession();
		Category c=null;
		try
		{
			session.beginTransaction();
			c=session.get(Category.class, cid);
			session.getTransaction().commit();
		}
		catch(HibernateException e)
		{
			System.out.println(e.getMessage());
			session.getTransaction().rollback();
		}
		return c;
	}
	
}
