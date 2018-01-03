package com.focusbackend;

import static org.junit.Assert.assertTrue;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.Dao.ProductDao;
import com.Model.Product;

public class ProductTestCase {

static ProductDao productDao;
	
	
	@BeforeClass
	public static void initalize()
	{
		System.out.println("Starting into Initializaed Product Test case ");
		
		AnnotationConfigApplicationContext annotationConfigAppContext=new AnnotationConfigApplicationContext();
		annotationConfigAppContext.scan("com");
		annotationConfigAppContext.refresh();
		
		productDao=(ProductDao)annotationConfigAppContext.getBean("productDao");
	
		System.out.println("Ending into Initializaed Product Test case ");
	}

	@Test
	public void createProductTest() 
	{
		
		System.out.println("Starting into Creating Blog Test case ");
		
		Product product=new Product();
		

		product.setId(10);
		product.setName("product1");
		product.setPrice(15000);
		product.setPrice(2000.10f);
		product.setStock(40);
		product.setDescription("Good Product");
		
		
		assertTrue("Problem in Product creation",productDao.insertProduct(product));
		
		System.out.println("Ending... into  Create Product Test case ");
	}


}
