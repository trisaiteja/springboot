package com;

import java.util.ArrayList;
import java.util.List;

public class ProjectLogic {
	public static void main(String[] args) {
		List<Project> list = new ArrayList<Project>();
		Project p1 = new Project(1, "John Hancock", new String[]{"Radha","Prerana","Anusha","Purna","Bala"});
		Project p2 = new Project(2, "DePenning & DePenning", new String[]{"Santhosh","Chinna", "Sandeep", "Muthu","Raghavan"});
		list.add(p1);
		list.add(p2);
		System.out.println(list);
	}
}
