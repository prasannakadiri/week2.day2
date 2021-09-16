package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

//load url : "https://acme-test.uipath.com/login"
//Enter email as "kumar.testleaf@gmail.com"
//Password : leaf@12
//click login 
//get the title of the page and print
//click on logout 
//close browser (driver.close())

public class AcmeTest {
	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver1 = new ChromeDriver();
		driver1.manage().window().maximize();
		driver1.get("https://acme-test.uipath.com/login");

		driver1.findElement(By.id("email")).sendKeys("kumar.testleaf@gmail.com");
		driver1.findElement(By.id("password")).sendKeys("leaf@12");

		driver1.findElement(By.xpath("//button[contains(text(),'Login')]")).click();

		// driver.findElement(By.xpath("//button[contains(text(),'Login')]")).click();

		String pageTitle = driver1.getTitle();
		System.out.println("pageTitle is " + " " + pageTitle);

		driver1.findElement(By.linkText("Log Out")).click();
		driver1.close();
	}
}
