package com;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@CopyRight
public class HighestRepeatedCharacterInAString {

	public static void main(String[] args) {
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		String s = "gfajhdghjakhaflkhdfhsdkjhflaksdfljdhscbhcdgshafdkjfhkdasgfdsbcfjdbscjdsb";
		char[] ch = s.toCharArray();
		int count = 0;
		for (int i = 0; i < ch.length; i++) {
			if(map.containsKey(ch[i])) {
				count = map.get(ch[i]) + 1;
				map.put(ch[i], count);
			} else {
				map.put(ch[i], 1);
			}
		}
		System.out.println(map);
		
		List<Integer> list = new ArrayList<Integer>(map.values());
		Collections.sort(list);
		
		for(Map.Entry<Character, Integer> m: map.entrySet()) {
			if(m.getValue() == list.get(list.size()-1)) {
				System.out.println(m.getKey() +"  --> "+m.getValue());
			}
		}
	}

}
