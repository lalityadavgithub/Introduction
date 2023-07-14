import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Selintro {

	public static void main(String[] args) {
		
		
		//invoking Browser
		

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\lalit\\chromedriver_win32//chromedriver.exe");
		
		ChromeOptions options = new ChromeOptions();
	 	options.setExperimentalOption("excludeSwitches", new String[] {"enable-automation"} );//// chrome id being controlled by automated test software (message displayed on chrome)

	      options.addArguments("--remote-allow-origins=*");
	      ChromeDriver driver = new ChromeDriver(options);
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com");
		driver.manage().window().maximize();
	}

}
