import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class AnnotationwithDiffTags {
	
	WebDriver driver;
	
	@BeforeSuite
	public void beforeSuite() {
		
		System.setProperty("", "");
		 driver = new ChromeDriver();
	}
	
	@BeforeMethod
	public void beforetest() {
		
		System.out.println("from before test");
	}
	
	@Test
	public void Test() {
		
		System.out.println("from  test");
	}
	
	@Test
	public void Test1() {
		
		System.out.println("from  test1");
	}
	
	@AfterMethod
	public void Aftertest() {
		
		System.out.println("from after test");
	}
	
	@AfterSuite
	public void aftersuite() {
		driver.quit();
	}
	
	

}
