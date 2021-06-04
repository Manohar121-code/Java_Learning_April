package com.learn.part3.collections.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapPrimitivesEx {
	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(10, "Sachin");
		map.put(7, "Dhoni");
		map.put(18, "Kohli");
		map.put(45, "Rohit");
		map.put(7, "MS Dhoni");
		map.put(17, "MS Dhoni");
		
		System.out.println(map.size());
		
		String val = map.get(10);
		System.out.println(val);
		
		System.out.println(map.get(7));
		
		System.out.println("-------------");
		
		Set<Integer> keySet = map.keySet();
		for (Integer key : keySet) {
			String value = map.get(key);
			System.out.println(key+" - "+value);
		}
		
		System.out.println("-------------");
		
		Set<Entry<Integer, String>> entrySet = map.entrySet();
		for (Entry<Integer, String> entry : entrySet) {
			Integer key = entry.getKey();
			String value = entry.getValue();
			System.out.println(key+" - "+value);
		}
		
		System.out.println("--------------");
		
		System.out.println(map.containsKey(45));
		
		System.out.println(map.get(7));
		map.remove(7);
		System.out.println(map.get(7));
		
		System.out.println("-----------------");
		
		Collection<String> values = map.values();
		for (String string : values) {
			System.out.println(string);
		}
	}
}
