package com.fiveamsolutions.interview;

import java.util.Arrays;

/**
 * Java Program to check if two Strings are anagrams or not.
 * Any two Strings are said to be anagram, if they contains same set of 
 * characters but in different order
 *
 *@author Balvinder
 */
public class AnagramFinderImpl implements AnagramFinder 
{
	
	/* (non-Javadoc)
	 * @see com.fiveamsolutions.interview.AnagramFinder#checkIfAnagramVersion1(java.lang.String, java.lang.String)
	 */
	public String areAnagrams(String s1, String s2){ 
		
		/*Step 1: Check if any of the input string is null
		 *  
		 * */
		if((s1==null || s2==null)){
			return INVALID_INPUT;
		}
		
		/* Step 2: remove space characters if any */
		s1=s1.replaceAll("\\s","");
	    s2=s2.replaceAll("\\s","");
	    
	    /* Step 3: check for length equality*/
	    if((s1.length()!=s2.length())){
	    	return IS_NOT_ANAGRAM;
	    }
			
		/*Step 4:Convert the string characters to either upper case 
		 * or lowercase for performing the check
		 * */
		s1=s1.toLowerCase();
		s2=s2.toLowerCase();
		
		/*Step 5: As the check is character level , we will first extract all 
		 * characters from each string argument string 
		 * */
		char[] allCharsOfs1 = s1.toCharArray();
		char[] allCharsOfs2 = s2.toCharArray();
		
		/*Step 6: Sort all characters as they need to be checked for equality.
		 * Sorting makes all characters placed in the ascending order
		 * */
		Arrays.sort(allCharsOfs1);
		Arrays.sort(allCharsOfs2);
		
		/*Step 7: check for equality , i.e if Anagram or not*/
		boolean isAnagram=Arrays.equals(allCharsOfs1, allCharsOfs2);
		
		return  (isAnagram)?IS_ANAGRAM:IS_NOT_ANAGRAM;
	}
}
