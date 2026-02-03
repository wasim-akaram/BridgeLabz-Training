package com.reflection.basic;

import java.lang.reflect.Constructor;

public class CreateObjects 
{
	public static void main(String[] args) throws Exception 
	{
		Class<?> clazz = Person.class;


		Constructor<?> constructor = clazz.getDeclaredConstructor();
		Person p = (Person) constructor.newInstance();
	}
}