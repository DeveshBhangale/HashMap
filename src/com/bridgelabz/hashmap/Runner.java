package com.bridgelabz.hashmap;

public class Runner {

	public static void main(String[] args) {
		
		// Use Case 1s
//		String sentence = "To be or Not to be";
		String sentence = "Paranoids are not paranoid because they are paranoid "
				+ "but because they keep putting themselves deliberately into paranoid avoidable situations";
		MyHashMap<String, Integer> myHashMap = new MyHashMap<>();
		String[] words = sentence.toLowerCase().split(" ");
		for(String word: words) {
			Integer value = myHashMap.get(word);
			if(value == null)
				value = 1;
			else
				value += 1;
			myHashMap.add(word, value);
		}
		System.out.println(myHashMap);
		System.out.println(myHashMap.get("paranoid"));

	}

}
