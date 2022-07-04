import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.*;

public class Annotation {
	
	//priotity always starts from A-Z and then followed by a-z, -ve to 0 to +ve
	/*
	 * @Test(priority = 0) public void a() { System.out.println("from method a"); }
	 * 
	 * 
	 * @Test(priority = -1) public void b() { System.out.println("From method b"); }
	 * 
	 * @Test(priority = 8) public void A() { System.out.println("from method A"); }
	 */
	//Suite, test, class, 
	
	
	@BeforeTest
	public void method1() {
		System.out.println("from before suite");
	}
	
	
	@AfterSuite
	public void method7() {
		System.out.println("from after suite");
	}
	
	
	@BeforeTest
	public void method2() {
		System.out.println("from before test");
	}
	
	@AfterTest
	public void method6() {
		System.out.println("from after test");
	}
	
	
	@Test
	public void method4() {
		System.out.println("from  test");
	}
	
	@AfterClass
	public void method5() {
		System.out.println("from after class");
	}
	
	@AfterMethod
	public void method8() {
		System.out.println("from after method");
	}
	
	@BeforeMethod
	public void method9() {
		System.out.println("from before method");
	}
	
	
	@BeforeClass
	public void method3() {
		System.out.println("from before class");
	}

	
	

}
