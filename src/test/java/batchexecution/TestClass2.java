package batchexecution;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestClass2 {

	@Test
	public void demo1() {
		System.out.println("TestClass2-Demo1");
		Assert.fail();
	}
	@Test
	public void demo2() {
		System.out.println("TestClass2-Demo2");
		//Assert.fail();
}
}
