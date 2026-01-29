package com.votingSystem;

public class Voter 
{
    private String name;
    private boolean voted;
    
	public Voter(String name) 
	{
		this.name = name;
		this.voted = false;
	}

	public String getName() 
	{
		return name;
	}

	public void setName(String name) 
	{
		this.name = name;
	}

	public boolean isVoted() 
	{
		return voted;
	}

	public void setVoted(boolean voted) 
	{
		this.voted = voted;
	}
    
}