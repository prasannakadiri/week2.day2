package week2.day2;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditFields {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver1 = new ChromeDriver();
		driver1.manage().window().maximize();

		driver1.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver1.get("http://leafground.com/pages/Edit.html");

		// Enter the values
		driver1.findElement(By.id("email")).sendKeys("testmail@gamil.com");

		// When there is no Id or name to locate a webelement we go for Xpath

		driver1.findElement(By.xpath("//input[@value='Append ']")).sendKeys("Text added to to check Append");
		System.out
				.println("Default text entered " + "" + driver1.findElement(By.name("username")).getAttribute("value"));
		driver1.findElement(By.xpath("//input[@value='Clear me!!']")).clear();
		WebElement ChkEnabled = driver1.findElement(By.xpath("//input[@disabled='true']"));

		boolean enabled = ChkEnabled.isEnabled();

		if (enabled)
			System.out.println("Edit field is Enabled");
		else
			System.out.println("Edit Field is Disabled");
	}
}
