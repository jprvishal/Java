package com.sharma.datastructure.heap;

import java.lang.reflect.Array;

public class Heap<T> {

	private static final int MAX_SIZE = 40;
    private T[] array;
	private int count;
	
	Heap(T classz, int size) {
		int actualSize = MAX_SIZE;
		if (size > 0 && size < MAX_SIZE) {
			actualSize = size;
		}

		array = (T[]) Array.newInstance(classz.getClass(), actualSize);
	}
	
	public int size() {
		if (array == null) {
			return 0;
		}
		
		return array.length;
	}
	
	public void print() {
		for (T obj : array) {
			System.out.println(obj.toString());
		}
	}
	
	public void addElement(T element) {
		
	}
	
	public T getElement() {
		return array[0];
	}
	
	public static void main(String[] args) {
		Heap<Integer> intHeap = new Heap(Integer.class, 10);
		
		System.out.println(" Array size == " + intHeap.size());
		
		intHeap.print();
	}
}
