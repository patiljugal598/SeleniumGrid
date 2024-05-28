package com.selgrid;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class GoogleHomePageTest {
	
	@Test
	public void test() throws MalformedURLException, URISyntaxException {
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setBrowserName("chrome");
		cap.setPlatform(Platform.WIN10);
		cap.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		
		WebDriver driver = new RemoteWebDriver(new URI("http://192.168.1.3:4444").toURL(), cap);
		
		driver.get("http://google.com");
		
		driver.findElement(By.cssSelector("#APjFqb")).sendKeys("Jugal Patil");
		
		System.out.println(driver.getTitle());
	}

}
