package com.focusbackend;

import static org.junit.Assert.assertTrue;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.Dao.CategoryDao;
import com.Model.Category;

public class CategoryTestCases
{
static CategoryDao categoryDao;
	
	
@BeforeClass
public static void initalize(){
	System.out.println("Starting into Initializaed Blog Test case ");
	
	AnnotationConfigApplicationContext annotationConfigAppContext=new AnnotationConfigApplicationContext();
	annotationConfigAppContext.scan("com");
	annotationConfigAppContext.refresh();
	
	categoryDao=(CategoryDao)annotationConfigAppContext.getBean("categoryDao");

	System.out.println("Ending into Initializaed Supplier Test case ");
}

	@Test
	public void createCategoryTest() 
	{
		
		System.out.println("Starting into Creating Blog Test case ");
		Category category=new Category();
		

		category.setCid(100);
		category.setCname("Digital");


		assertTrue("Problem in blog creation",categoryDao.insertCategory(category));
		
		System.out.println("Ending... into  Create Category Test case ");
	}
}
