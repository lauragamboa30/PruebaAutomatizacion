package com.qualitystream.tutorial;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chorme.ChormeDriver;

public class GoogleSearchTest {
	
	private WebDriver driver;

	@Before
	public void setUp() {
		
		System.setProperty("webdriver.chorme.driver", "./src/test/resources/chromedriver/chromedriver.exe");		
		driver =new ChormeDriver();
		driver.manage().window().maximize();
		driver.get("http://200.29.19.109/Panacea/LogOnForm.aspx?ReturnUrl=%2fPanacea");	
	}
	
	@Test
	public void testGooglePage() {
		
		WebElement searchbox = driver.findElement(By.name(""));
		
		searchbox.clear();
		
		searchbox.sendKeys("LG");
		
		searchbox.submit();
	}
}

