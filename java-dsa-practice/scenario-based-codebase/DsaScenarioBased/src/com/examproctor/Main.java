package com.examproctor;

import java.util.*;

public class Main
{
    public static void main(String[] args)
    {
        ExamSession exam = new ExamSession();

        exam.visitQuestion(1);
        exam.visitQuestion(2);

        exam.submitAnswer(1, "A");
        exam.submitAnswer(2, "B");

        HashMap<Integer, String> correct = new HashMap<>();
        correct.put(1, "A");
        correct.put(2, "C");

        int score = exam.calculateScore(correct);
        System.out.println("Final Score: " + score);
    }
}
