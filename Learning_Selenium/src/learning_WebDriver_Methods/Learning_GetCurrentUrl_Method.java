package learning_WebDriver_Methods;

import org.openqa.selenium.chrome.ChromeDriver;

public class Learning_GetCurrentUrl_Method {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.qspiders.com/");
		
		String url = driver.getCurrentUrl();
		System.out.println(url);
		
		
	}

}
