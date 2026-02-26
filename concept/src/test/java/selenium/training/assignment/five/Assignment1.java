package selenium.training.assignment.five;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment1 {

	/*
	 * Assignment 1 - >
	 * 
	 * URL -> https://demo.automationtesting.in/Frames.html Click on “Iframe with in
	 * an Iframe”.
	 * 
	 * Write your name in the text box located inside “iFrame Demo”
	 * 
	 */

	public static void main(String[] args) {
		String appUrl = "https://demo.automationtesting.in/Frames.html";
		String frameInFrameLinkXpath = "//a[@href='#Multiple']";
		String outerframe = "//iframe[contains(@src,'MultipleFrames')]";
		String innerframe = "//iframe[contains(@src,'SingleFrame') and not(@id='singleframe')]";
		String textBoxXpath = "/html/body/section/div/div/div/input";
		String text = "Shabbir";
		int waitTimeInSec = 5;
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(appUrl);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(waitTimeInSec));
		driver.findElement(By.xpath(frameInFrameLinkXpath)).click();
		driver.switchTo().frame(driver.findElement(By.xpath(outerframe)));
		driver.switchTo().frame(driver.findElement(By.xpath(innerframe)));
		driver.findElement(By.xpath(textBoxXpath)).sendKeys(text);
		driver.close();

	}

}
