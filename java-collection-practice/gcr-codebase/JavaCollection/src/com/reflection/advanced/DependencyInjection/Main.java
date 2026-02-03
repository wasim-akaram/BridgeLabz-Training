package com.reflection.advanced.DependencyInjection;

public class Main 
{
	public static void main(String[] args) throws Exception 
	{
		UserService service = new UserService();
		DIContainer.injectDependencies(service);
		service.action();
	}
}