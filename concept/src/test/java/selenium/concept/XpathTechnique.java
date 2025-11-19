package selenium.concept;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathTechnique {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(Config.appUrl);
		// tagName[@attributeName='value']
		driver.findElement(By.xpath("//input[@placeholder='Enter Name']")).sendKeys("Shabbir");

		// tagName[starts-with(@attributeName,'value)']
		driver.findElement(By.xpath("//input[starts-with(@class,'form-check')]")).click();

		// tagName[contains(@attributeName,'value')]
		driver.findElement(By.xpath("//input[contains(@value,'mon')]")).click();

		// tagName[contains(text(),'value')]
		driver.findElement(By.xpath("//a[contains(text(),'Hidden Elements')]")).click();

		// tagName[text()='value')]
		driver.findElement(By.xpath("//a[text()='Home']")).click();
		
		//logical operator- and
		driver.findElement(By.xpath("//input[@value='male' and @id='male']")).click();
		
		//logical operator- or
		driver.findElement(By.xpath("//input[@value='female' or @id='female' ]")).click();
		
		driver.close();
	}

}
