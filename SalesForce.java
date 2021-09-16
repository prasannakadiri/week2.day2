package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

//sales force 
//Download and set the path 
//Launch chrome browser
//Load https:www.salesforce.com/in/form/signup/freetrial-sales/?d=70130000000Enyk
//Maximize window 
//add implicit wait
//Fill all the elements or controls

public class SalesForce {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver1 = new ChromeDriver();
		driver1.get("https:www.salesforce.com/in/form/signup/freetrial-sales/?d=70130000000Enyk");
		driver1.manage().window().maximize();

		driver1.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver1.findElement(By.xpath("//input[@name='UserFirstName']")).sendKeys("prasanna");
		driver1.findElement(By.xpath("//input[@name='UserLastName']")).sendKeys("M");
		driver1.findElement(By.xpath("//input[@name='UserEmail']")).sendKeys("prasannamuddisetty@gmail.com");

		WebElement dropdown1 = driver1.findElement(By.xpath("//select[@name='UserTitle']"));
		Select Option1 = new Select(dropdown1);
		Option1.selectByVisibleText("Sales Manager");

		driver1.findElement(By.xpath("//input[@name='CompanyName']")).sendKeys("Tcs");

		WebElement dropDown2 = driver1.findElement(By.xpath("//select[@name='CompanyEmployees']"));
		Select option2 = new Select(dropDown2);
		option2.selectByValue("950");

		driver1.findElement(By.xpath("//input[@name='UserPhone']")).sendKeys("4086099592");

		WebElement dropDown3 = driver1.findElement(By.xpath("//select[@name='CompanyCountry']"));
		Select option3 = new Select(dropDown3);
		option3.selectByValue("US");
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	//	driver1.findElement(By.xpath"(//div[@class='checkbox-ui']")[1]")).click();
		
		driver1.findElement(By.xpath("(//div[@class='checkbox-ui'])[1]")).click();
		
		System.out.println("Completed!!!!");
		
		driver1.close();

	}
}
