package com.assignment.hashmapInternal;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class HashMapInternal {

	public static void main(String[] args) {

		/*
		 * HashMap Internal
		 * 
		 * Creating HashMap and loading data into HashTables. Each Node in
		 * HashMap is a Linked List which hold the following details, 1.HashCode
		 * 2.Key 3.Value 4.Next
		 */
		Map<String, Integer> map = new HashMap<>();
		map.put("aaa", 1);
		map.put("bbb", 2);

		/*
		 * Hash Collision
		 * 
		 * Here s1 and s2 generates same HashCode for different keys.
		 */
		String s1 = "FB";
		String s2 = "Ea";
		map.put(s1, 3);
		map.put(s2, 4);

		/*
		 * HashMap Key Duplication
		 * 
		 * Here below two put operations contains the same keys.
		 * In this case the value will be overwritten because the key is same.
		 */
		map.put("sir", 5);
		map.put("sir", 6);

		/*
		 * HashMap null Key input
		 * 
		 * Here below put operation contains the keys as null.
		 * In this case the entry is always loaded into 0th index of HashMap because that is the internal implementation.
		 * https://stackoverflow.com/a/21535089
		 */
		String j2 = null;
		System.out.println(Objects.hashCode(j2));
		map.put(null, 7);
		map.put(j2, 8);		
	}

}
