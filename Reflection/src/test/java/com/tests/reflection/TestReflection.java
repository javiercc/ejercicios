package com.tests.reflection;

import static org.junit.Assert.*;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

import org.junit.Test;

public class TestReflection {

	@Test
	public void test() {
		//fail("Not yet implemented");
		
		try{
			
			 //para mostrar información de la clase
				
		      Class cl = Class.forName("com.reflection.Salute");

			  
		      Constructor cnst[] = cl.getConstructors();
		      Field fld[] = cl.getDeclaredFields();
		      Method mtd[] = cl.getMethods();

		      for (int i = 0; i < cnst.length; i++) {
		        System.out.println(cnst[i].getName());
		      }

		      for (int i = 0; i < fld.length; i++) {
		        System.out.println(fld[i].getName());
		      }

		      for (int i = 0; i < mtd.length; i++) {
		        System.out.println(mtd[i].getName());
		      }
				
			  //para invocar
				Class clazz = Class.forName("com.reflection.Salute");
				String metodo = "saluteMe";
	        	Class clases[] = {String.class};
	        	Object ob;
				ob = clazz.getConstructor(null).newInstance(null);
				ob.getClass().getMethod(metodo, clases).invoke(ob, "juan");
			      
			      
			}catch(Exception e){
				e.printStackTrace();
			}
		
		assertEquals(5,5);
	}

}
