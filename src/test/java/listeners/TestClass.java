package listeners;

import static org.testng.Assert.fail;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

@Listeners(listeners.LIstenerImp.class)

public class TestClass extends BaseClass {
	@Test
	public void test() {
		System.out.println("@Test");
		//Assert.fail();
	}
	@Test(dependsOnMethods = "test")
	public void test1() {
		System.out.println("@Test-test1");
	}
}
