package com.reflection.advanced.DependencyInjection;

public class UserService 
{
	@Inject
	private Repository repo;

	public void action() 
	{
		repo.save();
	}
}