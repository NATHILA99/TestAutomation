package com.pageobjectmodel;

public class ExecuteAutoIT {

	public static void main(String[] args) {
		executeAutoITFile();

	}
	
	static void executeAutoITFile()
	{
		try
		{
			String FilePath="F:\\TestAutomation\\AUTOIT\\SampleDailouge.exe";
			Runtime.getRuntime().exec(FilePath);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}

