package TestDropDown;



	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.support.ui.Select;

	public class UpdatedDropdown {

		public static void main(String[] args) throws InterruptedException {
			
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\lalit\\chromedriver_win32//chromedriver.exe");

			WebDriver driver = new ChromeDriver();
			driver.get("https://www.spicejet.com/");
			driver.manage().window().maximize();
			
			driver.findElement(By.xpath("//*[@id=\"main-container\"]/div/div[1]/div[3]/div[2]/div[5]/div[1]/div/div[1]/div[2]")).click();
			Thread.sleep(2000L);
			
			System.out.println(driver.findElement(By.xpath("//*[@id=\"main-container\"]/div/div[1]/div[3]/div[2]/div[5]/div[1]/div/div/div[2]/div[1]")).getText());
			for(int i=0;i<5;i++)
			{
				driver.findElement(By.xpath("//*[@id=\"main-container\"]/div/div[1]/div[3]/div[2]/div[5]/div[1]/div/div[2]/div[2]/div/div[1]/div[1]/div[2]/div[3]")).click();

			}

			driver.findElement(By.xpath("//div[@data-testid='home-page-travellers-done-cta']")).click();
			
			Thread.sleep(1000);
			
			System.out.println(driver.findElement(By.xpath("//*[@id=\"main-container\"]/div/div[1]/div[3]/div[2]/div[5]/div[1]/div/div/div[2]/div[1]")).getText());
			
		
			
	}

}
