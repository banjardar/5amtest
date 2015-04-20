package com.fiveamsolutions.interview;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * 
 * @author Balvinder
 * Junit Test to check for Anagrams
 *
 */
public class AnagramFinderTest {

	static AnagramFinder anagramFinder;
	
	@BeforeClass
	public static void initialize(){
		anagramFinder=new AnagramFinderImpl();
	}
	
	@Test
	public void testIsAnagram() {
		Assert.assertEquals(AnagramFinder.IS_ANAGRAM,anagramFinder.areAnagrams("ZZYZX", "X Y ZZZ"));
		Assert.assertEquals(AnagramFinder.INVALID_INPUT,anagramFinder.areAnagrams("ZZYZX", null));
		Assert.assertEquals(AnagramFinder.IS_NOT_ANAGRAM,anagramFinder.areAnagrams("ZZYZX", "ZZYZZX"));
		Assert.assertEquals(AnagramFinder.IS_ANAGRAM,anagramFinder.areAnagrams("a telescope", "to see place"));
		Assert.assertEquals(AnagramFinder.IS_ANAGRAM,anagramFinder.areAnagrams("PostMaster", "stamp sto RE"));
		Assert.assertEquals(AnagramFinder.IS_ANAGRAM,anagramFinder.areAnagrams("Balvinder Singh", "Singh BALVINDEr"));
		Assert.assertEquals(AnagramFinder.IS_NOT_ANAGRAM,anagramFinder.areAnagrams("Balvin derr Singh", "Singh BALVINDEr"));
	}
	
	@AfterClass
	public static void cleanup(){
		anagramFinder=null;
	}
}
