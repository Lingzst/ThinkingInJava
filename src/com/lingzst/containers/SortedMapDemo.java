package com.lingzst.containers;

import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

public class SortedMapDemo {
	public static void main(String[] args) {
		SortedMap<Integer, String> sortedMap = new TreeMap<>(new CountingMapData(10));
		System.out.println(sortedMap);
		Integer firstKey = sortedMap.firstKey();
		Integer lastKey = sortedMap.lastKey();
		System.out.println("de"+ firstKey + lastKey );
		Iterator<Entry<Integer, String>> it = sortedMap.entrySet().iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		Set<Entry<Integer, String>> entrySet = sortedMap.entrySet();
		System.out.println(entrySet);
		for(Entry en : entrySet) {
			System.out.println(en);
		}
		Set<Integer> keySet = sortedMap.keySet();
		System.out.println(keySet);
	}
}
