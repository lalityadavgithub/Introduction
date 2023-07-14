package PracticeProject;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddmultiProduct {

	public static void main(String[] args) throws InterruptedException {

System.setProperty("webdriver.chrome.driver", "C:\\Users\\lalit\\chromedriver_win32//chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		
		int j=0;
		String[] veggies= {"Cucumber","Brocolli","Beetroot"};
	
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		List<WebElement> products=driver.findElements(By.cssSelector("h4[class='product-name']"));
		
		for (int i=0;i<products.size();i++)
		{
			//Brocolli -1 kg
			//Brocolli, 1 kg  splitted
			
			String[] name=products.get(i).getText().split("-");
			String veggiesName=name[0].trim();
			
			System.out.println(name=products.get(i).getText().split("-"));
			// check whether name you extracted is present in array or not
			//convert array into array list for easy search
			
			List veggiesList=Arrays.asList(veggies);
			
			if(veggiesList.contains("veggiesName"))
			{
				j++;
				//click on Add to Cart
				driver.findElements(By.xpath("//button[text()='ADD TO CART']")).get(i).click();
				
				if(j==3)
				{
					break;
				}
			}
		}
	
	}

}
