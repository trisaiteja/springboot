package com;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

@CopyRight
public class ConsumerInterface {

	public static void main(String[] args) {

		Consumer<Integer> addition = (a) -> {
			a = a + a + a;
			System.out.println(a);
		};
		
		addition.accept(10);
		
		List<Integer> integerList = new ArrayList<Integer>();
		integerList.add(1);
		integerList.add(2);
		integerList.add(3);

		Consumer<List<Integer>> modifyList = (list) -> {
			for (int i = 0; i < list.size(); i++) {
				list.set(i, 10 * list.get(i));
			}
		};

		Consumer<List<Integer>> andThenList = (addList) -> {
			addList.add(1);
			addList.add(2);
			addList.add(3);
		};

		modifyList.andThen(andThenList).accept(integerList);

		integerList.stream().forEach(i -> System.out.print(i + " "));

	}

}
