package com;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

@CopyRight
public class GetPincode {

	public static void main(String[] args) {
		Map<String, Integer> wgAreaMap = new HashMap<String, Integer>();
		wgAreaMap.put("Bhimavaram", 100);
		wgAreaMap.put("Palakollu", 101);
		wgAreaMap.put("Narsapuram", 102);

		Map<String, Integer> egAreaMap = new HashMap<String, Integer>();
		egAreaMap.put("Rajahmundry", 103);
		egAreaMap.put("Kakinada", 104);
		egAreaMap.put("Annavaram", 105);

		Map<String, Integer> karAreaMap = new HashMap<String, Integer>();
		karAreaMap.put("Nandyala", 106);
		karAreaMap.put("Adoni", 107);
		karAreaMap.put("Nandikotukuru", 108);

		Map<String, Map<String, Integer>> finalMap = new HashMap<String, Map<String, Integer>>();
		finalMap.put("West Godavari", wgAreaMap);
		finalMap.put("East Godavari", egAreaMap);
		finalMap.put("Kurnool", karAreaMap);

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the area name to get the pincode: ");
		String areaName = scanner.next();
		scanner.close();

		finalMap.entrySet().forEach(pm -> {
			pm.getValue().entrySet().forEach(cm -> {
				if (cm.getKey().equals(areaName)) {
					System.out.println(areaName + " --> " + cm.getValue());
				}
			});
		});
	}
}
