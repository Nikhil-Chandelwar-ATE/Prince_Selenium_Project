package launching_Empty_Browsers;

import org.openqa.selenium.chrome.ChromeDriver;

public class Launching_Empty_Chrome_Browser {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		new ChromeDriver();
	}

}
