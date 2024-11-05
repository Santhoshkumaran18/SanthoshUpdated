package introduction;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class CheckBoxExerciseTwo {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:/Users/S Santhosh Kumaran/Documents/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		String checkbox = "(//div[@class='css-76zvg2 r-cqee49 r-1enofrn r-1ozqkpa'][text()='Senior Citizen'])";
		driver.get("https://www.spicejet.com");
		System.out.println(driver.findElement(By.xpath(checkbox)).isSelected());
		Assert.assertFalse(driver.findElement(By.xpath(checkbox)).isSelected());
		driver.findElement(By.xpath(checkbox)).click();
		Thread.sleep(7000);
		System.out.println(driver.findElement(By.xpath(checkbox)).isSelected());
		driver.navigate().to("https://www.tutorialspoint.com/selenium/practice/radio-button.php");
		List<WebElement> checkboxes = driver.findElements(By.xpath("//input[@type='radio']"));
		System.out.println(checkboxes.size());
		driver.findElement(By.xpath("(//input[@type='radio'])[2]")).click();
		Thread.sleep(2000);
		System.out.println(driver.findElement(By.xpath("(//input[@type='radio'])[2]")).isSelected());

	}

}
