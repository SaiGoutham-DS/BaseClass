package org.sample1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Collections {

	public static void main(String[] args) {

		Map<Integer, String> s = new LinkedHashMap<>();

		s.put(27, "java");
		s.put(50, "jenkins");
		s.put(50, "maven");
		s.put(20, "Git");
		s.put(47, "Git Bash");
		s.put(56, "selenium");
		s.put(21, "maven");

		Set<Entry<Integer, String>> a = s.entrySet();

		for (Entry<Integer, String> A : a) {

			System.out.println(A);

		}

	}
}
