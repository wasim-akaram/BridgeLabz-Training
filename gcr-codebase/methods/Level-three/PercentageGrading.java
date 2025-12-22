//program to take input marks of students in 3 subjects: physics, chemistry, and maths. 
//Compute the total, average, and the percentage score 


import java.util.Scanner;
public class PercentageGrading

{

    public int[][] getRandomArray(int size) 
	{
        int startRange = 10 ,endRange = 100; 
        int [][]scores = new int[3][size];

        for (int i = 0; i < 3; i++) 
		{
            for (int j = 0; j < size; j++) 
			{
                int randomValue = (int) ((endRange - startRange) * Math.random() + startRange);
                scores[i][j] = randomValue;
            }
        }

        return scores;
    }

    public int[][] getSum&Percentage(int [][]scores)
	{
        int size = scores[0].length;
        int [][]sum&Percentage = new int[2][size];

        for (int j = 0; j < size; j++) 
		{
            sum&Percentage[0][j] = scores[0][j] + scores[1][j] + scores[2][j];
            sum&Percentage[1][j] = Math.round(sum&Percentage[0][j] / 3);
        }

        return sum&Percentage;
    }

    public static void main(String[] args) 
	{
	
        Scanner input = new Scanner(System.in);
        PercentageGrading object = new PercentageGrading();

        int numberOfStudents = input.nextInt();

        int[][] scores = object.getRandomArray(numberOfStudents);

        int [][] sum&Percentage = object.getSum&Percentage(scores);

        for (int j = 0; j < numberOfStudents; j++) 
		{
            System.out.printf(
                    "%d\t%d\t%d\t%d\t%d\t%d\n", 
                    j + 1,
                    scores[0][j],
                    scores[1][j],
                    scores[2][j], 
                    sum&Percentage[0][j],
                    sum&Percentage[1][j]
            );
        }

    }
}
