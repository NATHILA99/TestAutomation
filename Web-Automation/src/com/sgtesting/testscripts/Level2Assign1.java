package com.sgtesting.testscripts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Level2Assign1 {

	public static WebDriver oBrowser=null;
	public static void main(String[] args) {
		launchBrowser();
		navigate();
		login();
		minimizeFlyOutWindow();
		createUser1();
		logout();
		loginAsUserName1();
		createUser2();
		modifyUser2Password();
		logout();
		loginAsUser2();
		createUser3();
		logout();
		login();
		changePWDU1();
		logout();
		loginAsUser1();
		logout();
		loginAsUser2();
		deleteUser3();
//   	logout();
//		loginAsUser1();
//		deleteUser2();
//		logout();
//		login();
//		deleteUser1();
//		logout();
		

	}
	
	public static void launchBrowser()
	{
		try	
		{
			String path=System.getProperty("user.dir");
			System.setProperty("webdriver.chrome.driver",path+"\\Library\\driver\\chromedriver.exe");
			oBrowser=new ChromeDriver();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public static void navigate()
	{
		try
		{
			oBrowser.get("http://localhost:82/login.do");
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void login()
	{
		try
		{
			oBrowser.findElement(By.id("username")).sendKeys("admin");
			oBrowser.findElement(By.name("pwd")).sendKeys("manager");
			oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			Thread.sleep(5000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void minimizeFlyOutWindow()
	{
		try
		{
			oBrowser.findElement(By.id("gettingStartedShortcutsPanelId")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void createUser1()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[5]/a/div[2]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id='createUserDiv']/div/div[2]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.name("firstName")).sendKeys("name1");
			oBrowser.findElement(By.name("lastName")).sendKeys("user");
			oBrowser.findElement(By.name("email")).sendKeys("user1@gmail.com");
			oBrowser.findElement(By.name("username")).sendKeys("User1");
			oBrowser.findElement(By.name("password")).sendKeys("Sample1");
			oBrowser.findElement(By.name("passwordCopy")).sendKeys("Sample1");
			oBrowser.findElement(By.xpath("//*[@id='userDataLightBox_commitBtn']/div/span")).click();
			Thread.sleep(4000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}

	}
	static void logout()
	{
		try
		{
			oBrowser.findElement(By.linkText("Logout")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void loginAsUserName1()
	{
		try
		{
			oBrowser.findElement(By.id("username")).sendKeys("User1");
			Thread.sleep(2000);
			oBrowser.findElement(By.name("pwd")).sendKeys("Sample1");
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\'loginButton\']/div")).click();
			Thread.sleep(5000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void createUser2()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id=\'welcomeScreenBoxId\']/div[3]/div")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[5]/a/div[2]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id='createUserDiv']/div/div[2]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.name("firstName")).sendKeys("name2");
			oBrowser.findElement(By.name("lastName")).sendKeys("user");
			oBrowser.findElement(By.name("email")).sendKeys("user1@gmail.com");
			oBrowser.findElement(By.name("username")).sendKeys("User2");
			oBrowser.findElement(By.name("password")).sendKeys("Sample2");
			oBrowser.findElement(By.name("passwordCopy")).sendKeys("Sample2");
			oBrowser.findElement(By.xpath("//*[@id='userDataLightBox_commitBtn']/div/span")).click();
			Thread.sleep(4000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}

	}
	static void modifyUser2Password()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id=\'userListTableContainer\']/table/tbody/tr[2]/td[1]/table/tbody/tr/td/div[1]/span[2]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.name("password")).sendKeys("gubbi");
			Thread.sleep(2000);
			oBrowser.findElement(By.name("passwordCopy")).sendKeys("gubbi");
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_commitBtn\']/div/span")).click();
		}catch(Exception e)
		{
			e.printStackTrace();
		}	
	}
	
	static void loginAsUser2()
	{
		try
		{
			oBrowser.findElement(By.id("username")).sendKeys("User2");
			Thread.sleep(2000);
			oBrowser.findElement(By.name("pwd")).sendKeys("gubbi");
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\'loginButton\']/div")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\'welcomeScreenBoxId\']/div[3]/div")).click();
			Thread.sleep(5000);
			oBrowser.findElement(By.xpath("//*[@id=\'SubmitTTButton\']")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void createUser3()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr[1]/td[5]/a/div[2]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\'createUserDiv\']/div/div[2]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.name("firstName")).sendKeys("name3");
			oBrowser.findElement(By.name("lastName")).sendKeys("user");
			oBrowser.findElement(By.name("email")).sendKeys("user3@gmail.com");
			oBrowser.findElement(By.name("username")).sendKeys("User3");
			oBrowser.findElement(By.name("password")).sendKeys("maaz");
			oBrowser.findElement(By.name("passwordCopy")).sendKeys("maaz");
			oBrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_commitBtn\']")).click();
			Thread.sleep(5000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	static void changePWDU1()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr[1]/td[5]/a")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\'userListTableContainer\']/table/tbody/tr[2]/td[1]/table/tbody/tr/td/div[1]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.name("password")).sendKeys("6789");
			Thread.sleep(2000);
			oBrowser.findElement(By.name("passwordCopy")).sendKeys("6789");
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_commitBtn\']/div/span")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void loginAsUser1()
	{
		try
		{
			oBrowser.findElement(By.name("username")).sendKeys("User1");
			Thread.sleep(2000);
			oBrowser.findElement(By.name("pwd")).sendKeys("6789");
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\'loginButton\']/div")).click();
			Thread.sleep(5000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
		
	static void deleteUser3()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr[1]/td[5]/a/div[1]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\'userListTableContainer\']/table/tbody/tr[4]/td[1]/table/tbody/tr/td/div[1]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.id("userDataLightBox_deleteBtn")).click();
			Thread.sleep(2000);
			Alert oAlert=oBrowser.switchTo().alert();
			String textcontent=oAlert.getText();
			System.out.println(textcontent);
			oAlert.accept();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	static void closeApplication()
	{
		try
		{
			oBrowser.close();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
}
