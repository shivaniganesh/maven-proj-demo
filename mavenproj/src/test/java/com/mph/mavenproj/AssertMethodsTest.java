package com.mph.mavenproj;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class AssertMethodsTest {

	@Test
	public void testAllAssertMethods()
	{
		String str1 = new String("Shi");
		String str2 = new String("Shi");
		String str3 = null;
		String str4 = "shivani";
		String str5 = "shivani";
		
		int val1 =5;
		int val2 = 6;
		
		String[] arr1 = {"one","two","three"};
		String[] arr2 = {"one","two","three"};
		assertEquals(str1, str2);
		assertNotNull(str1);
		assertNull(str3);
		assertSame(str4, str5);
		assertTrue(val1<val2);
		assertFalse(val1>val2);
		assertArrayEquals(arr1, arr2);
		
		
		
		
		
		
		
		
	}
}