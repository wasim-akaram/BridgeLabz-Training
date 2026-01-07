package edumentor;

import java.util.List;

public class Quiz 
{

    // list to store the questions
    private List<String> questions;

    // to ensure answers cannot be modified after setting
    private final List<String> answers;

    private int score;
    

    
    public Quiz(List<String> questions, List<String> answers) 
    {
        this.questions = questions;
        this.answers = answers;
      
        this.score = 0;
    }



    // adding the score
    public void evaluate(List<String> userAnswers) 
    {
        for (int i = 0; i < answers.size(); i++) 
        {
            if (answers.get(i).equalsIgnoreCase(userAnswers.get(i))) 
            {
                score++;  
            }
        }
    }

    public double getPercentage() 
    {
        return (score * 100.0) / answers.size(); 
    }

    public int getScore() 
    {
        return score;
    }
}

