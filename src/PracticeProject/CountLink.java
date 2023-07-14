package PracticeProject;

import java.util.Set;

import java.util.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CountLink {

	public static void main(String[] args) throws InterruptedException {
		
		//1. Give me the count of links on the page.

		//a

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\lalit\\chromedriver_win32//chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		System.out.println( driver.findElements(By.tagName("a")).size());
		
		//2.limiting webdriver scope ---count links on footer section
		WebElement footerDriver=driver.findElement(By.id("gf-BIG"));  
		System.out.println( footerDriver.findElements(By.tagName("a")).size());
		
		//3. Count links on the column section
		WebElement ColumnDriver=footerDriver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
		System.out.println(ColumnDriver.findElements(By.tagName("a")).size());
		
		//4. click on each link in the column and check if the pages are opening
		for(int i=1;i<ColumnDriver.findElements(By.tagName("a")).size(); i++ )
		{
			String ClickonlinkTab=Keys.chord(Keys.CONTROL,Keys.ENTER);
			ColumnDriver.findElements(By.tagName("a")).get(i).sendKeys(ClickonlinkTab);
			Thread.sleep(5000);
		}// opens all the tabs
		Set<String> abc=driver.getWindowHandles();//4
		Iterator<String> it=abc.iterator();
		
		while(it.hasNext())
		{
			
		   driver.switchTo().window(it.next());
		   System.out.println(driver.getTitle());
		
		}
			}
		
	}


