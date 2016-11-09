package com.tests.generics;

import static org.junit.Assert.*;

import org.junit.Test;

import com.generics.Generico;

public class TestGenerics {

	@Test
	public void test() {
		//fail("Not yet implemented");
		
	Generico<Double> p = new Generico<Double>();
		
		p.unobjeto = 1.0;
		p.segundoobjeto = 1.3;
		
		System.out.println(p.sumar());
		assertEquals(p.sumar(), 4.3,.1);
		
		
	}

}
