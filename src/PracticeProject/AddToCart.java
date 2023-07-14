package PracticeProject;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddToCart {

	public static void main(String[] args) {

		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\lalit\\chromedriver_win32//chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
	
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		driver.manage().window().maximize();
		
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		List<WebElement> products=driver.findElements(By.cssSelector("h4[class='product-name']"));
		
		for (int i=0;i<products.size();i++)
		{
			String name=products.get(i).getText();
			
			if(name.contains("Cucumber"))
				
			{
				//click on the Add to Cart
				driver.findElements(By.xpath("//button[text()='ADD TO CART']")).get(i).click();
				
				break;
			}
		}
	}

}
