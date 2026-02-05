package com.collectors.libraryStatistics;

public class Book 
{
	private String name;
	private String genre;
	private int page;
	
	
	public Book(String name, String genre, int page)
	{
		this.name = name;
		this.genre = genre;
		this.page = page;
	}

	public String getGenre()
	{
		return genre;
		
	}
	public int getPages()
	{
		return page;
	}
}
