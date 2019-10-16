package com;

import java.util.ArrayList;
import java.util.List;

public enum WEEKDAYS {
	INSTANCE, SUNDAY("Sunday"), MONDAY("Monday"), TUESDAY("Tuesday"), WEDNESDAY("Wednesday"), THURSDAY("Thursday"),
	FRIDAY("Friday"), SATURDAY("Saturday"), STRING_TO_NUMBER("One", 1);

	private String day;

	private String s;

	private int i;

	private final List<String> list = new ArrayList<String>();

	private WEEKDAYS() {
	}

	private WEEKDAYS(String day) {
		this.day = day;
	}

	private WEEKDAYS(String s, int i) {
		this.s = s;
		this.i = i;
	}

	public String getDay() {
		return day;
	}

	public String getS() {
		return s;
	}

	public int getI() {
		return i;
	}

	public List<String> getList() {
		list.add("One");
		list.add("Two");
		list.add("Three");
		list.add("Four");
		return list;
	}

	public static void main(String[] args) {
		for (WEEKDAYS weekDay : WEEKDAYS.values()) {
			System.out.println(weekDay.getDay());
		}

		for (String s : INSTANCE.getList()) {
			System.out.println(s);
		}

		System.out.println(WEEKDAYS.STRING_TO_NUMBER.getS() + " --> " + WEEKDAYS.STRING_TO_NUMBER.getI());
	}
}
