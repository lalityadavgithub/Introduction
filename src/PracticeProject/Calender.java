package PracticeProject;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calender {

	public static void main(String[] args) throws InterruptedException  {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\lalit\\chromedriver_win32//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.path2usa.com/travel-companion");
		driver.manage().window().maximize();
		Thread.sleep(5000);

		WebElement Submit = driver.findElement(By.xpath("//input[@id='form-field-travel_comp_date']"));

		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("arguments[0].click();", Submit);

		//driver.findElement(By.xpath("//input[@id='form-field-travel_comp_date']")).click();

		//August 23
		//driver.findElement(By.id("form-field-travel_comp_date")).click();
		//System.out.println("Test");
		
		
	}

}
