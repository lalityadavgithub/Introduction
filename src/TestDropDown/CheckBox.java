package TestDropDown;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class CheckBox {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\lalit\\chromedriver_win32//chromedriver.exe");
		ChromeDriver driver =new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		driver.manage().window().maximize();
		
		Assert.assertFalse(driver.findElement(By.xpath("//*[text()='Family & Friends']")).isSelected()); 
	    //System.out.println(driver.findElement(By.xpath("//*[text()='Family & Friends']")).isSelected());	
	     driver.findElement(By.xpath("//*[text()='Family & Friends']")).click();
	     
	     Thread.sleep(3000);
	     //System.out.println(driver.findElement(By.xpath("//*[text()='Family & Friends']")).isSelected());	

		Assert.assertFalse(driver.findElement(By.xpath("//*[text()='Family & Friends']")).isSelected());
		
		driver.getScreenshotAs(null);
	}

}
