// Java Program to convert
// HashMap to TreeMap in Java 8

import java.util.*;
import java.util.stream.*;

class GFG {

	
	public static <K, V> Map<K, V> convertToTreeMap(Map<K, V> hashMap)
	{
		Map<K, V>
			treeMap = hashMap
						
						.entrySet()

						
						.stream()

						
						.collect(
							Collectors

								
								.toMap(
									Map.Entry::getKey,
									Map.Entry::getValue,
									(oldValue,
									newValue)
										-> newValue,
									TreeMap::new));

		
		return treeMap;
	}

	public static void main(String args[])
	{
		
		Map<String, String> hashMap = new HashMap<>();

		
		hashMap.put("1", "Geeks");
		hashMap.put("2", "forGeeks");
		hashMap.put("3", "A computer Portal");

		
		System.out.println("HashMap: " + hashMap);

		
		Map<String, String> treeMap = convertToTreeMap(hashMap);

		
		System.out.println("TreeMap: " + treeMap);
	}
}
