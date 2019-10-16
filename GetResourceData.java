package com;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

@CopyRight
public class GetResourceData {
	public static void main(String[] args) {
		Resource r1 = new Resource(100, "Praveen", "20/02/2019");
		Resource r2 = new Resource(101, "Trisaiteja", "07/03/2019");
		Resource r3 = new Resource(102, "Raja Sekhar", "01/03/2019");

		List<Resource> resourceList = new ArrayList<Resource>();
		resourceList.add(r1);
		resourceList.add(r2);
		resourceList.add(r3);

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter resource id to get the details: ");
		int resourceId = scanner.nextInt();
		scanner.close();

		for (Resource resource : resourceList) {
			if (resource.getResourceId() == resourceId) {
				System.out.println("Resource Details:\n" + resource.toString());
			}
		}
	}
}
