package com.lingzst.containers;

import java.util.AbstractMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

public class SimpleHashMap<K, V> extends AbstractMap<K, V> {
	static final int SIZE = 997;
	private K key;
	private V value;
	@SuppressWarnings("unchecked")
	LinkedList<Entry<K, V>>[] buckets = new LinkedList[SIZE];
	public V put(K key, V value) {
		V oldValue = null;
		int index = Math.abs(key.hashCode()) % SIZE;
		if(buckets[index] == null) {
			buckets[index] = new LinkedList<Entry<K, V>>();
			buckets[index].add(new MapEntry(key , value));
		}
		LinkedList<Entry<K, V>> bucket = buckets[index];
		
		for(Entry<K,V> entry : bucket) {
			if (key == entry.getKey())
				entry.setValue(value);
		}
		bucket.add(new MapEntry(key,value));
		return oldValue;
	}
	@Override
	public V get(Object key) {
		int index = Math.abs(key.hashCode()) % SIZE;
		if(!(buckets[index] == null))
			for(Entry entry : buckets[index])
				if(key == entry.getKey())
					return (V) entry.getValue();
		return null;
	}
	
	@Override
	public Set<Entry<K, V>> entrySet() {
		// TODO Auto-generated method stub
		Set<Entry<K,V>> set = new HashSet<>();
		for(LinkedList<Entry<K,V>> bucket : buckets) {
			if(bucket == null) continue;
			for(Entry entry : bucket)
				set.add(entry);
		}
		return set;
	}
	public static void main(String[] args) {
		SimpleHashMap<String, String> m = new SimpleHashMap<>();
		m.put("1","fefe");
		m.put("2", "fefe");
		System.out.println(m);
		System.out.println(m.entrySet());
		System.out.println(m.get("2"));
	}
}
