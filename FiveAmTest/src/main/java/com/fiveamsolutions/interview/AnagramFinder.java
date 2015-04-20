package com.fiveamsolutions.interview;

public interface AnagramFinder {

	public static final String IS_ANAGRAM = "IsAnagram";
	public static final String IS_NOT_ANAGRAM = "IsNotAnagram";
	public static final String INVALID_INPUT = "Invalid Input";

	/**
	 *
	 *This program assumes that string characters can be of any case(lower or upper)
	 *as we will be transforming the strings to of of the cases for effective solution
	 *
	 * @return true, if the String inputs are Anagram.
	 */
	public abstract String areAnagrams(String s1, String s2);

}