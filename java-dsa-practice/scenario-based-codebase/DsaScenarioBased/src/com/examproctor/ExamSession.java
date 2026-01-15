package com.examproctor;

import java.util.*;

public class ExamSession
{
    Stack<Integer> navigationStack = new Stack<>();
    HashMap<Integer, String> answerMap = new HashMap<>();

    // visit question
    public void visitQuestion(int qId)
    {
        navigationStack.push(qId);
    }

    // store answer
    public void submitAnswer(int qId, String answer)
    {
        answerMap.put(qId, answer);
    }

    // scoring function
    public int calculateScore(HashMap<Integer, String> correctAnswers)
    {
        int score = 0;

        for (int qId : answerMap.keySet())
        {
            if (answerMap.get(qId).equals(correctAnswers.get(qId)))
            {
                score++;
            }
        }
        return score;
    }
}
