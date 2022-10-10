package VerificationTestNG;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertPractice {
	
	String str="Hello";
	@Test
	public void sample() {
		
		SoftAssert soft=new SoftAssert();
		soft.assertEquals(str, "Hi");
		
		
		soft.assertEquals(str,str);
		System.out.println(str);
		soft.assertAll();
	}

}
