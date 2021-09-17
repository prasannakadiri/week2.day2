package week2.day2;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BondWithButtons {

	public static void main(String[] args) {

		// instantiate chrome driver

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver1 = new ChromeDriver();
		driver1.manage().window().maximize();

		driver1.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		// get the Browser url

		driver1.get("http://leafground.com/pages/Button.html");

		// Click home page button

		driver1.findElement(By.id("home")).click();
		driver1.findElement(By.xpath("//img[@alt='Buttons']")).click();
		System.out.println("Position" + " " + driver1.findElement(By.id("position")).getLocation());
		System.out.println("Color" + " " + driver1.findElement(By.id("color")).getCssValue("background-color"));
		System.out.println("Size" + " " + driver1.findElement(By.id("size")).getSize());

	}
}
