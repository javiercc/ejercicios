package com.generics;

import java.util.List;
import java.util.ArrayList;


public class MainGenerico {
	public static void main(String[] args){
		/*List<Integer> lista = new ArrayList<Integer>();
		lista.add(1);
		
		String j = lista.get(0);
		
		System.out.println(j);*/
		
		Generico<Double> p = new Generico<Double>();
		
		p.unobjeto = 1.0;
		p.segundoobjeto = 33.3;
		
		System.out.println(p.sumar());
		
	
		
	}
}
