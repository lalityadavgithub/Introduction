package PracticeProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Exception {

	public static void main(String[] args) {
		
		//Create instance of ChromeOptions Class
		ChromeOptions handlingSSL = new ChromeOptions();

		//Using the accept insecure cert method with true as parameter to accept the untrusted certificate
		handlingSSL.setAcceptInsecureCerts(true);
				
		//Creating instance of Chrome driver by passing reference of ChromeOptions object
		WebDriver driver = new ChromeDriver(handlingSSL);
		
		//Launching the URL
		driver.get("https://dtpapptestv1.mloyalcapture.com/");
		System.out.println("The page title is : " +driver.getTitle());
	}


	}


