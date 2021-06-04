package com.learn.part3.collections.map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class MapUserDefinedEx {
	public static void main(String[] args) {
		Map<Employee, String> map = new LinkedHashMap<Employee, String>();
		
		Employee e1 = new Employee(1, "Sasi", 8767);
		Employee e2 = new Employee(2, "Prasad", 876898);
		Employee e3 = new Employee(1, "Sasi", 87687787);
		
		map.put(e1, e1.getEmpName());
		map.put(e2, e2.getEmpName());
		map.put(e3, e3.getEmpName());
		
		System.out.println(map.size());
		
	}
}
