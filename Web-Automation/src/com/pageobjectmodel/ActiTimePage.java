package com.pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActiTimePage {
	
	WebDriver oBrowser=null;
	public ActiTimePage(WebDriver oBrowser)
	{
		this.oBrowser=oBrowser;
		PageFactory.initElements(oBrowser, this);
	}
	//UserName text field WebElement
	private WebElement username;
	public WebElement getUserName()
	{
		return username;
	}
	
	//Password text field WebElement
	private WebElement pwd;
	public WebElement getPassword()
	{
		return pwd;
	}
	
	//Login button WebElement
	@FindBy(xpath="//*[@id='loginButton']/div")
	private WebElement oLogin;
	public WebElement getLogin()
	{
		return oLogin;
	}
	
	//FlyoutWindow WebElement
	private WebElement gettingStartedShortcutsPanelId;
	public WebElement getFlyOutWindow()
	{
		return gettingStartedShortcutsPanelId;
	}
	
	//Logout Link WebElement
	@FindBy(linkText="Logout")
	private WebElement oLogout;
	public WebElement getLogout()
	{
		return oLogout;
	}
	
    //create user
	@FindBy(xpath="//*[@id=\'topnav\']/tbody/tr[1]/td[5]/a/div[1]")
	private WebElement createUser;
	public WebElement getcreateUser()
	{
		return createUser;
	}
	
	//add user
	@FindBy(xpath="//*[@id=\'createUserDiv\']/div")
	private WebElement addUser;
	public WebElement getaddUser()
	{
		return addUser;
	}
	
	//First Name
	private WebElement firstName;
	public WebElement getfirstName()
	{
		return firstName;
	}
	
	//Last Name
	private WebElement lastName;
	public WebElement getlastName()
	{
		return lastName;
	}
	
	//Email
	private WebElement userDataLightBox_emailField;
	public WebElement getID()
	{
		return userDataLightBox_emailField;
	}
	
	//UserName
	private WebElement userDataLightBox_usernameField;
	public WebElement getuserName()
	{
		return userDataLightBox_usernameField;
	}
	
	//Password
	private WebElement password;
	public WebElement getpassword()
	{
		return password;
	}
	
	//ReType Password
	private WebElement passwordCopy;
	public WebElement getRetypePassword()
	{
		return passwordCopy;
	}
	
	//Create User Button
	@FindBy(xpath="//*[@id=\'userDataLightBox_commitBtn\']")
	private WebElement createUserButton;
	public WebElement getcreateUserButton()
	{
		return createUserButton;
	}
	
	//Delete User
	@FindBy(xpath="//*[@id=\'userListTableContainer\']/table/tbody/tr[2]/td[1]/table/tbody/tr/td/div[1]/span[2]")
	private WebElement deleteUser;
	public WebElement getdeleteUser()
	{
		return deleteUser;
	}
	
	//Delete User
	private WebElement userDataLightBox_deleteBtn;
	public WebElement getdeleteID()
	{
		return userDataLightBox_deleteBtn;
	}
	
	//Modify User
	@FindBy(xpath="//*[@id=\'userListTableContainer\']/table/tbody/tr[2]/td[1]")
	private WebElement modifyUser;
	public WebElement getmodifyUser()
	{
		return modifyUser;
	}
	
	//modify firstName
	private WebElement userDataLightBox_firstNameField;
	public WebElement getfirstNameID()
	{
		return userDataLightBox_firstNameField;
	}
	
	//save changes button
	@FindBy(xpath="//*[@id=\'userDataLightBox_commitBtn\']/div/span")
	private WebElement saveChangesButton;
	public WebElement getsaveChangesButton()
	{
		return saveChangesButton;
	}
	
	//create Customer(Tasks)
	@FindBy(xpath="//*[@id=\'topnav\']/tbody/tr/td[3]/a")
	private WebElement tasks;
	public WebElement getTasks()
	{
		return tasks;
	}
	
	//create Customer(Add New)
	@FindBy(xpath="//*[@id=\'cpTreeBlock\']/div[2]/div[1]/div[2]/div/div[2]")
	private WebElement addNew;
	public WebElement getaddNew()
	{
		return addNew;
	}
	
	//create Customer(New Customer)
	@FindBy(xpath="/html/body/div[14]/div[1]")
	private WebElement newCustomer;
	public WebElement getnewCustomer()
	{
		return newCustomer;
	}
	
	//create Customer(EnterCustomerName)
	private WebElement customerLightBox_nameField;
	public WebElement getEnterCustomerName()
	{
		return customerLightBox_nameField;
	}
	
	//create Customer(create customer button)
	@FindBy(xpath="//*[@id=\'customerLightBox_commitBtn\']/div/span")
	private WebElement createCustomerButton;
	public WebElement getcreateCustomerButton()
	{
		return createCustomerButton;
	}
	
	//Delete Customer(click to view customer setting);
	@FindBy(xpath="//*[@id=\'cpTreeBlock\']/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[2]/div[4]")
	private WebElement clickOnSetting;  
	public WebElement getclickOnSettings()
	{
		return clickOnSetting;
	}
	
	//Delete Customer(Actions)
	@FindBy(xpath="//*[@id=\'taskListBlock\']/div[2]/div[1]/div[4]/div/div/div[2]")
	private WebElement Actions;  
	public WebElement getActions()
	{
		return Actions;
	}
	
	//Delete Customer(Delete Button)
	@FindBy(xpath="//*[@id=\'taskListBlock\']/div[2]/div[4]/div/div[3]/div")
	private WebElement deleteButton;   
	public WebElement getdeleteButton()
	{
		return deleteButton;
	}
	
	//Delete Customer(Delete Permanently Button)
	private WebElement customerPanel_deleteConfirm_submitTitle;
	public WebElement getDeletePermanently()
	{
		return customerPanel_deleteConfirm_submitTitle;
	}
	
	//ModifyCustomer(Description)
	@FindBy(xpath="//*[@id=\'taskListBlock\']/div[2]/div[2]/div[1]/div[3]/div[1]")
	private WebElement Description;  
	public WebElement getDescription()
	{
		return Description;
	}
	
	//Modify Customer(Enter Customer Dercription)
	@FindBy(xpath="//*[@id=\'taskListBlock\']/div[2]/div[2]/div[1]/div[3]/div[2]/div/div[1]/textarea")
	private WebElement customerDescription;
	public WebElement getCustomerDescription()
	{
		return customerDescription;
	}
	
	//Modify Customer(Customer close button)
	@FindBy(xpath="//*[@id=\'taskListBlock\']/div[2]/div[1]/div[1]")
	private WebElement closeButton;   
	public WebElement getCloseButton()
	{
		return closeButton;
	}
	
	//create project(New Project)
	@FindBy(xpath="/html/body/div[14]/div[2]")
	private WebElement newProject;
	public WebElement getNewProject()
	{
		return newProject;
	}
	
	//craete project(Enter Project Name)
	private WebElement projectPopup_projectNameField;
	public WebElement getProjectName()
	{
		return projectPopup_projectNameField;
	}
	
	//create project(create project button)
	private WebElement projectPopup_commitBtn;
	public WebElement getCreateProjectButton()
	{
		return projectPopup_commitBtn;
	}
	
	//delete project(click to view project settings)
	@FindBy(xpath="//*[@id=\'cpTreeBlock\']/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[3]/div[3]")
	private WebElement projectSettings;
	public WebElement getProjectSettings()
	{
		return projectSettings;
	}
	
	//delete project(Actions)
	@FindBy(xpath="//*[@id=\'taskListBlock\']/div[4]/div[1]/div[2]/div[3]/div/div")
	private WebElement projectActions;  
	public WebElement getProjectActions()
	{
		return projectActions;
	}
	
	//Delete project(click delete button)
	@FindBy(xpath="//*[@id=\'taskListBlock\']/div[4]/div[4]/div/div[3]/div")
	private WebElement projectDeletebutton;
	public WebElement getProjectDeleteButton()
	{
		return projectDeletebutton;
	}
	
	//Delete Project(Delete Permanently)
	private WebElement projectPanel_deleteConfirm_submitTitle;
	public WebElement getprojectDeletePermanently()
	{
		return projectPanel_deleteConfirm_submitTitle;
	}
	
	//Modify Project(Description)
	@FindBy(xpath="//*[@id=\'taskListBlock\']/div[4]/div[2]/div[1]/div[1]/div[2]/div[1]")
	private WebElement projectDescription;
	public WebElement getProjectDescription()
	{
		return projectDescription;
	}
	
	//Modify Project(Enter Project Description)
	@FindBy(xpath="//*[@id=\'taskListBlock\']/div[4]/div[2]/div[1]/div[1]/div[2]/div[2]/div/div[1]/textarea")
	private WebElement enterProjectDescription;
	public WebElement getEnterProjectDescription()
	{
		return enterProjectDescription;
	}
	
	//Modify project(Close project button)
	@FindBy(xpath="//*[@id=\'taskListBlock\']/div[4]/div[1]/div[1]")
	private WebElement closeProjectbutton;
	public WebElement getCloseProjectButton()
	{
		return closeProjectbutton;
	}
	
	//Create Task(Add New Task)
	@FindBy(xpath="//*[@id=\'taskListBlock\']/div[1]/div[1]/div[3]/div/div[2]")
	private WebElement addNewTask;
	public WebElement getAddNewTask()
	{
		return addNewTask;
	}
	
	//Create Task(Create New Tasks)
	@FindBy(xpath="/html/body/div[13]/div[1]")
	private WebElement createNewTasks;
	public WebElement getCreateNewTasks()
	{
		return createNewTasks;
	}
	
	//Create Task(Enter Task Name)
	@FindBy(xpath="//*[@id=\'createTasksPopup_createTasksTableContainer\']/table/tbody/tr[1]/td[1]/input")
	private WebElement enterTaskName;
	public WebElement getEnterTaskName()
	{
		return enterTaskName;
	}
	
	//Create Task(Create Task Button)
	@FindBy(xpath="//*[@id=\'createTasksPopup_commitBtn\']/div/span")
	private WebElement createTaskButton;
	public WebElement getCreateTaskButton()
	{
		return createTaskButton;
	}
	
	//Delete Task(Click on Created Task)
	@FindBy(xpath="//*[@id=\'taskListBlock\']/div[1]/div[2]/div[1]/table[1]/tbody/tr/td[2]/div/div[2]")
	private WebElement ClickOnTaskCreated;
	public WebElement getTask1()
	{
		return ClickOnTaskCreated;
	}
	
	//Delete Task(Tasks delete Actions)
	@FindBy(xpath="//*[@id=\'taskListBlock\']/div[3]/div[1]/div[2]/div[3]/div/div/div[2]")
	private WebElement taskActions;
	public WebElement getTaskActions()
	{
		return taskActions;
	}
	
	//Delete Task(Task Delete Button)
	@FindBy(xpath="//*[@id=\'taskListBlock\']/div[3]/div[4]/div/div[3]/div")
	private WebElement taskDeleteButton;
	public WebElement getTaskDeleteButton()
	{
		return taskDeleteButton;
	}
	
	//Delete Task(Delete Permanently Button)
	private WebElement taskPanel_deleteConfirm_submitTitle;
	public WebElement getDeletePermanentlyButton()
	{
		return taskPanel_deleteConfirm_submitTitle;
	}
	
	//Modify Task(Task Description Title)
	@FindBy(xpath="//*[@id=\'taskListBlock\']/div[3]/div[2]/div[1]/div[2]/div[3]/div[1]")
	private WebElement taskDescription;
	public WebElement getTaskDescription()
	{
		return taskDescription;
	}
	
	//Modify Task(Enter Task Description)
	@FindBy(xpath="//*[@id=\'taskListBlock\']/div[3]/div[2]/div[1]/div[2]/div[3]/div[2]/div/div[1]/textarea")
	private WebElement enterTaskDescription;
	public WebElement getEnterTaskDescription()
	{
		return enterTaskDescription;
	}
	
	//Modify Task(Modify task Close Button)
	@FindBy(xpath="//*[@id=\'taskListBlock\']/div[3]/div[1]/div[1]")
	private WebElement modifyCloseButton;
	public WebElement getModifyCloseButton()
	{
		return modifyCloseButton;
	}
	
	//Start exploring ActiTime
	@FindBy(xpath="//*[@id=\'welcomeScreenBoxId\']/div[3]/div/span[1]")
	private WebElement exploringActiTime;
	public WebElement getExploringActiTime()
	{
		return exploringActiTime;
	}
	
	//Modify User2 only for password
	@FindBy(xpath="//*[@id=\'userListTableContainer\']/table/tbody/tr[2]/td[1]/table/tbody/tr/td/div[1]")
	private WebElement modifyUser2Password;
	public WebElement getModifyUser2Password()
	{
		return modifyUser2Password;
	}
	
	//Modify User1 only for password
	@FindBy(xpath="//*[@id=\'userListTableContainer\']/table/tbody/tr/td[1]/div/table/tbody/tr/td/div[1]/span[2]")
	private WebElement modifyUser1Password;
	public WebElement getModifyUser1Password()
	{
		return modifyUser1Password;
	}
	
	//Modify User2 only for password
	@FindBy(xpath="//*[@id=\'userListTableContainer\']/table/tbody/tr[3]/td[1]/table/tbody/tr/td/div[1]")
	private WebElement modifyUser3Password;		
	public WebElement getModifyUser3Password()
	{
		return modifyUser3Password;
	}
	
	//Delete User1
	@FindBy(xpath="//*[@id=\'userListTableContainer\']/table/tbody/tr[1]/td[1]/div/table/tbody/tr/td/div[1]")
	private WebElement deleteUser1;		
	public WebElement getDeleteUser1()
	{
		return deleteUser1;
	}
	
	//Delete User2
	@FindBy(xpath="//*[@id=\'userListTableContainer\']/table/tbody/tr[1]/td[1]/div/table/tbody/tr/td/div[1]")
	private WebElement deleteUser2;		
	public WebElement getDeleteUser2()
	{
		return deleteUser2;
	}
		
	//Delete User3
	@FindBy(xpath="//*[@id=\'userListTableContainer\']/table/tbody/tr[1]/td[1]/div/table/tbody/tr/td/div[1]")
	private WebElement deleteUser3;		
	public WebElement getDeleteUser3()
	{
		return deleteUser3;
	}
	
	//Delete User11
	@FindBy(xpath="//*[@id='userListTableContainer']/table/tbody/tr[1]/td[1]/div/table/tbody/tr/td/div[1]")
	private WebElement deleteUser11;		
	public WebElement getDeleteUser11()
	{
		return deleteUser11;
	}
		
	//Delete User22
	@FindBy(xpath="//*[@id='userListTableContainer']/table/tbody/tr[2]/td[1]/table/tbody/tr/td/div[1]")
	private WebElement deleteUser22;		
	public WebElement getDeleteUser22()
	{
		return deleteUser22;
	}
			
	//Delete User33
	@FindBy(xpath="//*[@id='userListTableContainer']/table/tbody/tr[3]/td[1]/table/tbody/tr/td/div[1]")
	private WebElement deleteUser33;		
	public WebElement getDeleteUser33()
	{
		return deleteUser33;
	}
	
}
