package com.Nvr.Backend;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.Nvr.Backend.dao.*;
import com.Nvr.Backend.model.*;


public class CategoryDaoTest 
{
   public static void main(String args[])
   {
	    AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
		context.scan("com.Nvr.Backend.*");
		context.refresh();
		CategoryDAO categoryDao=(CategoryDAO) context.getBean("categoryDao");
		Category category= (Category)context.getBean("category");
		//category.setCid(43);
		/*category.setCname("nalavala");*/
		//categoryDao.deleteCategory(2);
		
		List<Category> list=(List<Category>)categoryDao.showCategory();
		for(Category cat:list)
		{
			System.out.println(cat.getCid());
		}
		
   }
}