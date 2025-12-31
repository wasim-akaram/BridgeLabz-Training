/* Online Quiz Application 🧠
Ask 5 questions (MCQs) from a user.
● Use arrays and for-loop.
● Record score.
● Switch for answer checking. Apply clear indentation and structured layout. */

import java.util.*;
public class QuizApp
{
	public static void main( String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("WElcome to the quiz app! \nYou have 5 questions to answer\nChoose the corect option");
		
	
		String [] arrayQuestion = new String[5];
		arrayQuestion[0] = "Did James Gosling invent Java? (y/n)";
		arrayQuestion[1] = "Is Washington captin of the USA? (y/n)";
		arrayQuestion[2] = "Is Java Object oriented query language?(y/n)";
		arrayQuestion[3] = "is git add command used to stash the files to staging area?(y/n)";
		arrayQuestion[4] = "Is Sunday before monday?(y/n)";
		
		char [] answer = {'y', 'y', 'n', 'n', 'y'};
		
		int score=0;
		
		for(int i=0; i<5; i++)
		{
			System.out.println(arrayQuestion[i]);
			char ch = sc.next().charAt(0);
			if(ch == answer[i])
			{
				score++;
			}
			
		}
		
		
		//display the results
		System.out.println("Your score was " + score);
		
		
	}
	
	
}