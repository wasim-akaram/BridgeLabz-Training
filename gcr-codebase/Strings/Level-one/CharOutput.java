//program to return all the characters in a string using the user-defined method,  
//compare the result with the String built-in toCharArray() method, and display the result

import java.util.*;
public class CharOutput
{
	//extracting character
	public static void extractCharacter(String str){
		char [] arr = new char[str.length()];
		
		for(int j =0; j<str.length(); j++){
			arr[j]= str.charAt(j);
		}
		System.out.println("The character extracted manually "+Arrays.toString(arr));
	}
	
	public static void main(String[] args)
	{
	
		//creating object and calling method
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		
		//displaying the result
		System.out.println("The character extraction using built in method "+Arrays.toString(s.toCharArray()));
		extractCharacter(s);
	}
}