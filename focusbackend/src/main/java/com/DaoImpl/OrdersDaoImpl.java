package com.DaoImpl;

import javax.transaction.Transactional;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.Dao.OrdersDao;
import com.Model.Orders;

@Repository("ordersDaoImpl")
public class OrdersDaoImpl implements OrdersDao
{
   @Autowired
   SessionFactory sessionFactory;
   
   public OrdersDaoImpl(SessionFactory sessioFactory)
   {
	   this.sessionFactory=sessionFactory;
   }
   
    @Transactional
    public  void insert(Orders orders) {
    	Session session=sessionFactory.openSession();
	 session.persist(orders);
	
    }
}
