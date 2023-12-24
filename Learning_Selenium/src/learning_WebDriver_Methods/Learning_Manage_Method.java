package learning_WebDriver_Methods;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;

public class Learning_Manage_Method {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.qspiders.com/");
		
//		methods to fetch height and width
		
		Options option = driver.manage();
		Window window = option.window();
		Dimension size = window.getSize();
		System.out.println(size.getHeight());
		System.out.println(size.getWidth());
		System.out.println("=====================");
//		optimized way
		System.out.println(driver.manage().window().getSize().getHeight());
		System.out.println(driver.manage().window().getSize().getWidth());
		System.out.println("=====================");
		
//		methods to fetch x and y axis
		
		System.out.println(driver.manage().window().getPosition().getX());
		System.out.println(driver.manage().window().getPosition().getY());
		
		
		Thread.sleep(2000);
		//driver.quit();
	}

}
