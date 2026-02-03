package com.reflection.advanced.CustomLogingProxy;

class RealService implements Service 
{
	public void serve() 
	{
		System.out.println("Serving...");
	}
}