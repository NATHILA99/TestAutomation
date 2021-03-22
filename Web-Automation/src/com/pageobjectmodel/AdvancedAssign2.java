package com.pageobjectmodel;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AdvancedAssign2 {

	public static WebDriver oBrowser=null;
	public static ActiTimePage oPage=null;
	public static void main(String[] args) {
		launchBrowser();
		navigate();
		login();
		minimizeFlyOutWindow();
		createUser1();
		createUser2();
		createUser3();
		logout();
		loginAsUser1();
		logout();
		loginAsUser2();
		logout();
		loginAsUser3();
		logout();
		login();
		modifyUserPwd1();
		modifyUserPwd2();
		modifyUserPwd3();
		logout();
		loginAsU1WithNewPW();
		logout();
		loginAsU2WithNewPW();
		logout();
		loginAsU3WithNewPW();
		logout();
		login();
		deleteUser1();
	    deleteUser2();
		deleteUser3();
		logout();
		closeApplication();

	}
	
	public static void launchBrowser()
	{
		try
		{
			String path=System.getProperty("user.dir");
			System.setProperty("webdriver.chrome.driver", path+"\\Library\\driver\\chromedriver.exe");
			oBrowser=new ChromeDriver();
			oPage=new ActiTimePage(oBrowser);
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
			oPage.getUserName().sendKeys("admin");
			oPage.getPassword().sendKeys("manager");
			oPage.getLogin().click();
			Thread.sleep(4000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	static void minimizeFlyOutWindow()
	{
		try
		{
			oPage.getFlyOutWindow().click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	static void logout()
	{
		try
		{
			oPage.getLogout().click();
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
	
	static void createUser1()
	{
		try
		{
			oPage.getcreateUser().click();
			Thread.sleep(2000);
			oPage.getaddUser().click();
			Thread.sleep(2000);
			oPage.getfirstName().sendKeys("User");
			Thread.sleep(2000);
			oPage.getlastName().sendKeys("11");
			Thread.sleep(2000);
			oPage.getID().sendKeys("user1@gmail.com");
			Thread.sleep(2000);
			oPage.getuserName().sendKeys("User1");
			Thread.sleep(2000);
			oPage.getpassword().sendKeys("password1");
			Thread.sleep(2000);
			oPage.getRetypePassword().sendKeys("password1");
			Thread.sleep(2000);
			oPage.getcreateUserButton().click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	static void createUser2()
	{
		try
		{
			oPage.getcreateUser().click();
			Thread.sleep(2000);
			oPage.getaddUser().click();
			Thread.sleep(2000);
			oPage.getfirstName().sendKeys("User");
			Thread.sleep(2000);
			oPage.getlastName().sendKeys("22");
			Thread.sleep(2000);
			oPage.getID().sendKeys("user2@gmail.com");
			Thread.sleep(2000);
			oPage.getuserName().sendKeys("User2");
			Thread.sleep(2000);
			oPage.getpassword().sendKeys("password2");
			Thread.sleep(2000);
			oPage.getRetypePassword().sendKeys("password2");
			Thread.sleep(2000);
			oPage.getcreateUserButton().click();
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
			oPage.getcreateUser().click();
			Thread.sleep(2000);
			oPage.getaddUser().click();
			Thread.sleep(2000);
			oPage.getfirstName().sendKeys("User");
			Thread.sleep(2000);
			oPage.getlastName().sendKeys("33");
			Thread.sleep(2000);
			oPage.getID().sendKeys("user3@gmail.com");
			Thread.sleep(2000);
			oPage.getuserName().sendKeys("User3");
			Thread.sleep(2000);
			oPage.getpassword().sendKeys("password3");
			Thread.sleep(2000);
			oPage.getRetypePassword().sendKeys("password3");
			Thread.sleep(2000);
			oPage.getcreateUserButton().click();
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
			oPage.getUserName().sendKeys("User1");
			oPage.getPassword().sendKeys("password1");
			oPage.getLogin().click();
			Thread.sleep(4000);
			oPage.getExploringActiTime().click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	static void loginAsUser2()
	{
		try
		{
			oPage.getUserName().sendKeys("User2");
			oPage.getPassword().sendKeys("password2");
			oPage.getLogin().click();
			Thread.sleep(4000);
			oPage.getExploringActiTime().click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	

	static void loginAsUser3()
	{
		try
		{
			oPage.getUserName().sendKeys("User3");
			oPage.getPassword().sendKeys("password3");
			oPage.getLogin().click();
			Thread.sleep(4000);
			oPage.getExploringActiTime().click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	static void modifyUserPwd1()
	{
		try
		{
			oPage.getcreateUser().click();
			Thread.sleep(2000);
			oPage.getModifyUser1Password().click();
			Thread.sleep(2000);
			oPage.getpassword().sendKeys("modified1");
			Thread.sleep(2000);
			oPage.getRetypePassword().sendKeys("modified1");
			Thread.sleep(2000);
			oPage.getsaveChangesButton().click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	static void modifyUserPwd2()
	{
		try
		{
			oPage.getcreateUser().click();
			Thread.sleep(2000);
			oPage.getModifyUser2Password().click();
			Thread.sleep(2000);
			oPage.getpassword().sendKeys("modified2");
			Thread.sleep(2000);
			oPage.getRetypePassword().sendKeys("modified2");
			Thread.sleep(2000);
			oPage.getsaveChangesButton().click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	
	static void modifyUserPwd3()
	{
		try
		{
			oPage.getcreateUser().click();
			Thread.sleep(2000);
			oPage.getModifyUser3Password().click();
			Thread.sleep(2000);
			oPage.getpassword().sendKeys("modified3");
			Thread.sleep(2000);
			oPage.getRetypePassword().sendKeys("modified3");
			Thread.sleep(2000);
			oPage.getsaveChangesButton().click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
    static void loginAsU1WithNewPW()
	{
		try
		{
			oPage.getUserName().sendKeys("User1");
			oPage.getPassword().sendKeys("modified1");
			oPage.getLogin().click();
			Thread.sleep(4000);
//			oPage.getExploringActiTime().click();
//			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
    
    static void loginAsU2WithNewPW()
	{
		try
		{
			oPage.getUserName().sendKeys("User2");
			oPage.getPassword().sendKeys("modified2");
			oPage.getLogin().click();
			Thread.sleep(4000);
//			oPage.getExploringActiTime().click();
//			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
    
    static void loginAsU3WithNewPW()
	{
		try
		{
			oPage.getUserName().sendKeys("User3");
			oPage.getPassword().sendKeys("modified3");
			oPage.getLogin().click();
			Thread.sleep(4000);
//			oPage.getExploringActiTime().click();
//			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
    
    static void deleteUser1()
	{
		try
		{
			oPage.getcreateUser().click();
			Thread.sleep(2000);
			oPage.getDeleteUser1().click();
			Thread.sleep(2000);
			oPage.getdeleteID().click();
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
    
    static void deleteUser2()
	{
		try
		{
			oPage.getDeleteUser2().click();
			Thread.sleep(2000);
			oPage.getdeleteID().click();
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
    
    static void deleteUser3()
	{
		try
		{
			oPage.getDeleteUser3().click();
			Thread.sleep(2000);
			oPage.getdeleteID().click();
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

}
