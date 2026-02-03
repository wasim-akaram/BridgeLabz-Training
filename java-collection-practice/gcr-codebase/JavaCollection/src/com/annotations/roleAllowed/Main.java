package com.annotations.roleAllowed;

public class Main 
{

	public static void main(String[] args) throws Exception 
	{
		Admin adminPanel = new Admin();

		Framework.invoke(adminPanel, "deleteUser", "ADMIN");
		Framework.invoke(adminPanel, "deleteUser", "USER");
	}

}