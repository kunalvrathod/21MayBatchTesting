package VerificationTestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertClass {
	
	private static final String Null = null;
	//1.AssertEquals()==>This method is used to verify expected and actual result.If both result are equal then test case is pass otherwise fail.
	
//	String s1="Hello";
//	String s2="Hello";
	
//	@Test
//	public void sample() {
//		Assert.assertEquals(s2, s1);
//	}
	
	//2.AssertNotEquals==>This method is used to verify expected and actual result.If both result are not equal then test case is pass otherwise fail
	
//	String s1="Hello";
//	String s2="Hi";
//	@Test
//	public void sample() {
//		Assert.assertNotEquals(s2, s1);
//	}
	
	//3.AssertNull
	
//	String s1="Hello";
//	String s2=Null;
//	
//	@Test
//	public void check() {
//		Assert.assertNull(s2);
//	}
	
	//4.AssertNotNull
	
	String s1="Hello";
	String s2="Hi";
	
	@Test
	public void test() {
		Assert.assertNotNull(s2);
	}
	
	//5.AssertFail
	public void fail() {
		System.out.println("This method is used to fail test case purposefully");
		Assert.fail();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
