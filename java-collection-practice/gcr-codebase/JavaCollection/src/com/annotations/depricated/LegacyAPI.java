package com.annotations.depricated;

public class LegacyAPI
{
	/**
	 * @deprecated Use newFeature() instead. This method is slow.
	 */
	@Deprecated
	public void oldFeature() 
	{
		System.out.println("Running old, everything slow");
	}

	public void newFeature() 
	{
		System.out.println("Running new, and evrything is fast");
	}
}