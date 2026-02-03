package com.annotations.roleAllowed;

class Admin 
{
	@RoleAllowed("ADMIN")
	public void deleteUser() 
	{
		System.out.println("User deleted.");
	}
}