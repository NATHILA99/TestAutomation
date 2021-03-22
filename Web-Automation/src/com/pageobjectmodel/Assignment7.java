package com.pageobjectmodel;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment7 {

	public static WebDriver oBrowser=null;
	public static ActiTimePage oPage=null;
	public static void main(String[] args) {
		launchBrowser();
		navigate();
		login();
		minimizeFlyOutWindow();
		createCustomer();
		createProject();
		createTask();
		deleteTask();
		deleteProject();
		deleteCustomer();
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
	
	static void createCustomer()
	{
		try
		{
			oPage.getTasks().click();
			Thread.sleep(2000);
			oPage.getaddNew().click();
			Thread.sleep(2000);
			oPage.getnewCustomer().click();
			Thread.sleep(2000);
			oPage.getEnterCustomerName().sendKeys("Customer1");
			Thread.sleep(2000);
			oPage.getcreateCustomerButton().click();
			Thread.sleep(2000);
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	static void createProject()
	{
		try
		{
			oPage.getaddNew().click();
			Thread.sleep(2000);
			oPage.getNewProject().click();
			Thread.sleep(2000);
			oPage.getProjectName().sendKeys("Project1");
			Thread.sleep(2000);
			oPage.getCreateProjectButton().click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	static void createTask()
	{
		try
		{
			oPage.getAddNewTask().click();
			Thread.sleep(2000);
			oPage.getCreateNewTasks().click();
			Thread.sleep(2000);
			oPage.getEnterTaskName().sendKeys("Task1");
			Thread.sleep(2000);
			oPage.getCreateTaskButton().click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	static void deleteTask()
	{
		try
		{
			oPage.getTask1().click();
			Thread.sleep(2000);
			oPage.getTaskActions().click();
			Thread.sleep(2000);
			oPage.getTaskDeleteButton().click();
			Thread.sleep(2000);
			oPage.getDeletePermanentlyButton().click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	static void deleteProject()
	{
		try
		{
			oPage.getProjectSettings().click();
			Thread.sleep(2000);
			oPage.getProjectActions().click();
			Thread.sleep(2000);
			oPage.getProjectDeleteButton().click();
			Thread.sleep(2000);
			oPage.getprojectDeletePermanently().click();
			Thread.sleep(2000);
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	static void deleteCustomer()
	{
		try
		{
			oPage.getclickOnSettings().click();
			Thread.sleep(2000);
			oPage.getActions().click();
			Thread.sleep(2000);
			oPage.getdeleteButton().click();
			Thread.sleep(2000);
			oPage.getDeletePermanently().click();
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
	
}


