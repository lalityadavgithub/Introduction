package TestDropDown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicDropDown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\lalit\\chromedriver_win32//chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//div[@data-testid='to-testID-origin']//input[@type='text']")).click();
		driver.findElement(By.xpath("//*[text()='Pandit Deen Dayal Upadhyay Airport']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[text()='Chhatrapati Shivaji International Airport']")).click();
	}

}
