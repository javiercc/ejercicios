package com.generics;


public class Generico<T extends Number> {
	public T unobjeto;
	public T segundoobjeto;
	public T getObjeto(){
		return unobjeto;
	}
	
	
	//sumando
	public double sumar(){
		return unobjeto.doubleValue() + segundoobjeto.doubleValue();
	}
}
