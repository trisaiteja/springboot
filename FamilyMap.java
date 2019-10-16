package com;

import java.util.Hashtable;
import java.util.Map;

public class FamilyMap {

	public static void main(String[] args) {
		Map<String,String> map = new Hashtable<String,String>();
		map.put("Trisaiteja", "Myself");
		map.put("Venkateswara Rao", "Father");
		map.put("Lakshmi Someswari", "Mother");
		map.put("Manikantha", "Brother");
		map.put("Kamala", "Grand Mother");
		map.put("Venkataramayya", "Grand Father");
		
		for(Map.Entry<String, String> m: map.entrySet()) {
			System.out.println(m.getValue()+"-->"+m.getValue());
		}
	}
}