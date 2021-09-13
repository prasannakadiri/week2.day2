package week2.day2;

import java.time.Duration;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateDropdown {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// called for all the find elements

		driver.get("http://www.leafground.com/pages/Dropdown.html");

		// 1 step1 selecting first dropdown box from screen
		WebElement dropDown1 = driver.findElement(By.id("dropdown1"));

		// step2
		Select drop1 = new Select(dropDown1);

		// step3
		drop1.selectByIndex(1);

		// 2 second dropdown 
		
		WebElement dropDown2=driver.findElement(By.name("dropdown2"));
		Select drop2=new Select(dropDown2);
		drop2.selectByIndex(2);
		
		// 3 rd dropdown
		
		WebElement dropDown3=driver.findElement(By.id("dropdown3"));
		Select drop3=new Select(dropDown3);
		drop3.selectByIndex(3);
		
		
	}

}
