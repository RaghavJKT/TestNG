package com.testNG;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class DependsOnMethods {
	
	@Test(dependsOnMethods = "b")
	public void A() {
		System.out.println("From method a ");
	}
	
	@Test
	public void b() {
		System.out.println("from method b");
	}
	
	@Test
	public void C() {
		System.out.println("from method C");
	}
	
	@Test 
	  public void d() {
	  System.out.println("from method D"); }
	 
}
