package com.DaoImpl;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.Dao.ProductDao;
import com.Model.Product;

@Repository("productDao")
public class productDaoImpl implements ProductDao
{
	@Autowired
	SessionFactory sessionFactory;
	public productDaoImpl(SessionFactory sessionFactory)
	{
		this.sessionFactory=sessionFactory;
	}
	
	
	@Transactional
	
	public boolean insertProduct(Product product){
		try
		{
		sessionFactory.getCurrentSession().saveOrUpdate(product);
		System.out.println("Insertion successful");
		return true;
		}
		
		catch(Exception e)
		{
		System.out.println("Exception Arised:"+e);
		return false;
		}
	}
}
