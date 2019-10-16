package com;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

@CopyRight
public class HighestRepeatedWordCount {

	public static final String INPUT_FILE = "News.txt";

	public static void main(String[] args) throws IOException {

		String news = "";
		Scanner scanner = new Scanner(new File(INPUT_FILE));
		while (scanner.hasNextLine()) {
			news += scanner.nextLine();
		}
		scanner.close();

		String[] s = news.split(" ");
		Map<String, Integer> map = new HashMap<String, Integer>();
		int count = 0;

		for (int i = 0; i < s.length; i++) {
			if (map.containsKey(s[i])) {
				count = map.get(s[i]) + 1;
				map.put(s[i], count);
			} else {
				map.put(s[i], 1);
			}
		}

		List<Integer> list = new ArrayList<Integer>();
		for (Map.Entry<String, Integer> m : map.entrySet()) {
			list.add(m.getValue());
		}
		Collections.sort(list);

		for (Map.Entry<String, Integer> m : map.entrySet()) {
			if (m.getValue() == list.get(list.size() - 1)) {
				System.out.println(m.getKey() + " -> " + m.getValue());
			}
		}
	}
}
