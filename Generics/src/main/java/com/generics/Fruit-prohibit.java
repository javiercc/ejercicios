package com.generics;

import java.util.*;
class FruitProh {
    protected String name;
    protected int size;
    public FruitProh (String name, int size) {
	this.name = name; this.size = size;
    }
    public boolean equals (Object o) {
	if (o instanceof Fruit) {
	    Fruit that = (Fruit)o;
	    return this.name == that.name && this.size == that.size;
	} else return false;
    }
    public String toString () {
	return this.name + "(" + size + ")";
    }
}
class OrangeProh extends FruitProh implements Comparable<OrangeProh> {
    public OrangeProh (int size) {
	super("Orange", size);
    }
    public int compareTo (OrangeProh that) {
	return
	    this.size < that.size ? - 1 :
	    this.size == that.size ? 0 : 1 ;
    }
}
class AppleProh extends FruitProh implements Comparable<AppleProh> {
    public AppleProh (int size) {
	super("Apple", size);
    }
    public int compareTo (AppleProh that) {
	return
	    this.size < that.size ? - 1 :
	    this.size == that.size ? 0 : 1 ;
    }
}
class Test4 {
    public static void main (String... args) {
	List<AppleProh> apples  = Arrays.<AppleProh>asList(new AppleProh(1), new AppleProh(10));
	List<OrangeProh> oranges  = Arrays.<OrangeProh>asList(new OrangeProh(1), new OrangeProh(10));
	List<FruitProh> fruits  = Arrays.<FruitProh>asList(new AppleProh(1), new OrangeProh(10));
	assert Collections.max(apples).equals(new AppleProh(10));
	assert Collections.max(oranges).equals(new OrangeProh(10));
	// assert Collections.max(fruits).equals(new Orange(10));  // compile-time error
	System.out.println(Collections.max(apples));
	System.out.println(Collections.max(oranges));
    }
}
