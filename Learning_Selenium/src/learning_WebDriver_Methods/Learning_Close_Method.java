package learning_WebDriver_Methods;

import org.openqa.selenium.chrome.ChromeDriver;

public class Learning_Close_Method {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.qspiders.com/");
		
		Thread.sleep(2000);
		driver.close();
	} 

}
