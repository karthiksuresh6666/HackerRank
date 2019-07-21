package com;

import java.util.LinkedHashMap;
import java.util.Map;

public class Sparse_Arrays {
	public static void main(String[] args) {
		String[] strings = { "abcde", "sdaklfj", "asdjf","na","basdn","sdaklfj","asdjf","na","asdjf","na","basdn","sdaklfj","asdjf" };
		String[] queries = { "abcde", "sdaklfj", "asdjf","na","basdn" };
		int[] res = matchingStrings(strings, queries);
		System.out.println(res);
	}

	static int[] matchingStrings(String[] strings, String[] queries) {
		Map<String, Integer> frequencyMap = new LinkedHashMap<>();
		int n1 = queries.length;
		int[] res = new int[n1];
		for (int i = 0; i < n1; i++) {
			frequencyMap.put(queries[i], 0);	
		}
		int n2 = strings.length;
		for (int i = 0; i < n2; i++) {
			if (frequencyMap.containsKey(strings[i])) {
				int value = frequencyMap.get(strings[i]);
				frequencyMap.put(strings[i], ++value);
			}
		}
		int f = 0;
		System.out.println(frequencyMap);
		for (Integer frequency : frequencyMap.values()) {
			res[f] = frequency;
			f++;
		}
		return res;
	}

//	public static void main(String[] args) {
//		Scanner in = new Scanner(System.in);
////		List<String> strings = IntStream.range(0, in.nextInt()).mapToObj(i -> in.next()).collect(Collectors.toList());
////		IntStream.range(0, in.nextInt()).mapToObj(i -> in.next())
////				.mapToLong(q -> strings.stream().filter(q::equals).count()).forEach(System.out::println);
////		in.close();
//		List<String> strings = IntStream.range(0, in.nextInt()).mapToObj(i -> in.next()).collect(Collectors.toList());
//		List<String> queries = IntStream.range(0, in.nextInt()).mapToObj(i -> in.next()).collect(Collectors.toList());
//		IntStream.range(0, in.nextInt()).mapToObj(i -> in.next())
//				.mapToLong(q -> strings.stream().filter(q::equals).count()).forEach(System.out::println);
//		in.close();
//	}

}
