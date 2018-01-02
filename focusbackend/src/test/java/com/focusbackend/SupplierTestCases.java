package com.focusbackend;

import static org.junit.Assert.assertTrue;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.Dao.SupplierDao;
import com.Model.Supplier;

public class SupplierTestCases {

	static SupplierDao supplierDao;
	
	
	@BeforeClass
	public static void initalize()
	{
		System.out.println("Starting into Initializaed Blog Test case ");
		
		AnnotationConfigApplicationContext annotationConfigAppContext=new AnnotationConfigApplicationContext();
		annotationConfigAppContext.scan("com");
		annotationConfigAppContext.refresh();
		
		supplierDao=(SupplierDao)annotationConfigAppContext.getBean("supplierDao");
	
		System.out.println("Ending into Initializaed Supplier Test case ");
	}

	@Test
	public void createSupplierTest() 
	{
		
		System.out.println("Starting into Creating Blog Test case ");
		Supplier supplier=new Supplier();
		

		supplier.setSid(100);
		supplier.setSuppliername("Rakesh");


		assertTrue("Problem in blog creation",supplierDao.insertSupplier(supplier));
		
		System.out.println("Ending... into  Create Supplier Test case ");
	}



}
