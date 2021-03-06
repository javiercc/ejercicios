package com.generics.evolvestack.g;

import java.util.*;
class ArrayStack<E> implements Stack<E> {
    private List<E> list;
    public ArrayStack() { list = new ArrayList<E>(); }
    public boolean empty() { return list.size()==0; }
    public void push(E elt) { list.add(elt); }
    public E pop() {
	E elt = list.get(list.size()-1);
	list.remove(list.size()-1);
	return elt;
    }
    public String toString() { return "stack"+list.toString(); }
}
