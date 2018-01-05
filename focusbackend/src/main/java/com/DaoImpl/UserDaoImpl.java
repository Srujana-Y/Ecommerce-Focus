package com.DaoImpl;

import javax.transaction.Transactional;


import org.hibernate.Session;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.Dao.UserDao;
import com.Model.User;

@Repository("userDao")
public class UserDaoImpl implements UserDao{

	@Autowired
	SessionFactory sessionFactory;
	
	public UserDaoImpl(SessionFactory sessionFactory)
	{
		this.sessionFactory=sessionFactory;
	}
	
	@Transactional

	public boolean insertUser(User user) {
		try
		{
		sessionFactory.getCurrentSession().saveOrUpdate(user);
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
