package com.actitime.generic;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import com.actitime.pom.HomePage;
import com.actitime.pom.LoginPage;

public class BaseClass {
	public WebDriver driver;
	public FileLib f=new FileLib();
	@Parameters("browser")
	@BeforeClass
	public void openBrowser(String browser) throws IOException {
		if(browser.equals("chrome")) {
			 driver=new ChromeDriver();
		}else if(browser.equals("edge")) {
			 driver=new EdgeDriver();
		}else {
			 driver=new FirefoxDriver();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		String url = f.readDataFromProperty("url");
		driver.get(url);
	}	@BeforeMethod
	public void login() throws IOException {
		String un = f.readDataFromProperty("un");
		String pwd=f.readDataFromProperty("pwd");
		LoginPage l=new LoginPage(driver);
		l.login(un, pwd);
	}@AfterMethod
	public void logout() {
		HomePage h=new HomePage(driver);
		h.logout();
	}@AfterClass
	public void closeBrowser() {
		driver.quit();
	}
}
