package batchexecution;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestClass1 {
	
	@Test
	public void demo1() {
		System.out.println("TestClass1-Demo1");
		Assert.fail();
	}
	@Test
	public void demo2() {
		System.out.println("TestClass1-Demo2");
		Assert.fail();
	}
}
