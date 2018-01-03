package com.Config;

import java.util.Properties;


import javax.sql.DataSource;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBuilder;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.DaoImpl.UserDaoImpl;
import com.Model.Category;
import com.Model.Product;
import com.Model.Supplier;
import com.Model.User;

@Configuration
@ComponentScan("com")  //----doubt---------
@EnableTransactionManagement
public class hiberConfig 
{

	@Bean(name="dataSource")
    public DataSource getH2Data()
    {
    	DriverManagerDataSource dsource=new DriverManagerDataSource();
    	dsource.setDriverClassName("org.h2.Driver");
    	dsource.setUrl("jdbc:h2:tcp://localhost/~/focus");
    	dsource.setUsername("sa");
    	dsource.setPassword("");
    	System.out.println("H2 DataBase Connected");
    	return dsource;
    }

    private Properties getHiber()
    {
    	Properties p=new Properties();
    	p.put("hibernate.dialect","org.hibernate.dialect.H2Dialect");
    	p.put("hibernate.hbm2ddl.auto","update");
    	p.put("hibernate.show_sql", "true");
    	System.out.println("Tables created");
    	return p;
    }
    
    @Bean(name="sessionFactory")
    public SessionFactory getHiberSession(DataSource datasource)
    {
    	LocalSessionFactoryBuilder lsfb=new LocalSessionFactoryBuilder(datasource);
    	lsfb.addProperties(getHiber());
    	lsfb.addAnnotatedClass(User.class);
    	lsfb.addAnnotatedClass(Supplier.class);
    	lsfb.addAnnotatedClass(Category.class);
    	lsfb.addAnnotatedClass(Product.class);
    	return lsfb.buildSessionFactory();
    	
    }
    


    @Bean(name="transactionManager")
    public HibernateTransactionManager getTrans(SessionFactory sf)
    {
    	HibernateTransactionManager htm=new HibernateTransactionManager(sf);
    	return htm;
    }
    
}
