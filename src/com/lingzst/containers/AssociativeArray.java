package com.lingzst.containers;

import java.util.Arrays;

public class AssociativeArray<K, V> {
	private Object[][] pair;
	private int index;
	private int length;
	public AssociativeArray(int length) {
		this.length = length;
	}
	public void add(K key, V value) {
		if (index > length -1) {
			throw new ArrayIndexOutOfBoundsException();
		}
		pair[index++] = new Object[] { key, value};
	}
	@SuppressWarnings("unchecked")
	public V get(K key) {
		for(int i = 0; i < length; i++) {
			if(pair[i][0] == key)
				return	(V) pair[i][1];
		}
		return null;
	}
	public String toString() {
		StringBuilder result = new StringBuilder();
		for(int i = 0; i < index; i++) {
			result = result.append(pair[i][0].toString());
			result = result.append(" : ");
			result = result.append(pair[i][1]);
			if(i < index)
				result.append("\n");
		}
		return result.toString();
	}
	public static void main(String[] args) {
		AssociativeArray<Integer, String> a = new AssociativeArray<>(5);
		a.add(1,"dfe");
		a.add(2, "ffe");
		System.out.println(a.get(3));
		System.out.println(a);
		String b = "fefewf";
		b.substring(1,2);
		
		
	}
}
