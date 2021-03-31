package day2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstSeleniumScript {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Which browser are we going to use, and what is the location of driver
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\NobleProg\\Downloads\\chromedriver_win32\\chromedriver.exe");
		// WebDriver was an interface
		// ChromeDriver is a class
		WebDriver driver = new ChromeDriver();
		// The chromeDriver is giving the implementation of the Abstract methods in
		// WebDriver
		driver.get("https://www.google.com");
		// get method that is used to launch the URL for testing a website
	}

}
