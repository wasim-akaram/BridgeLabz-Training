//program to perform matrix manipulation operations like addition, subtraction, and multiplication

import java.util.Scanner;
public class MatrixManipulator
{
    // getting a randomly filled matrix
	
    public int[][] getMatrix(int rows, int columns) 
	{
        int [][]matrix = new int[rows][columns];

        for (int row = 0; row < rows; row++) 
		{
            for (int column = 0; column < columns; column++) 
			{
                double randomNumber = Math.random() * 100;
                matrix[row][column] = (int)randomNumber;
            }
        }

        return matrix;
    }

    // adding two matrices
	
    public int[][] addMatrix(int [][]matrix1, int [][]matrix2) 
	{
        if (matrix1.length != matrix2.length || matrix1[0].length != matrix2[0].length) 
		{
            return null;
        }

        int rows = matrix1.length, columns = matrix1[0].length;
        int [][]matrix = new int[rows][columns];

        for (int row = 0; row < rows; row++) {
            for (int column = 0; column < columns; column++) 
			{
                matrix[row][column] = matrix1[row][column] + matrix2[row][column];
            }
        }

        return matrix;
    }

   

    //  multiplying Matrix
	
    public int[][] multiplyMatrix(int [][]matrix1, int [][]matrix2)
	{
        if (matrix1[0].length != matrix2.length)
		{
            return null;
        }

        int rows = matrix1.length, columns = matrix2[0].length, mediary = matrix2.length;
        int [][]matrix = new int[rows][columns];

        for (int row = 0; row < rows; row++) 
		{
            for (int column = 0; column < columns; column++) 
			{
                int sum = 0;
                for (int counter = 0; counter < mediary; counter++)
				{
                    sum += matrix1[row][counter] * matrix2[counter][column];
                }
                matrix[row][column] = sum;
            }
        }

        return matrix;
    }
	
	 // subtracting matrices
	 
    public int[][] subtractMatrix(int [][]matrix1, int [][]matrix2)
	{
        if (matrix1.length != matrix2.length || matrix1[0].length != matrix2[0].length)
		{
            return null;
        }

        int rows = matrix1.length, columns = matrix1[0].length;
        int [][]matrix = new int[rows][columns];

        for (int row = 0; row < rows; row++) 
		{
            for (int column = 0; column < columns; column++) 
			{
                matrix[row][column] = matrix1[row][column] - matrix2[row][column];
            }
        }

        return matrix;
    }

    // to transpose matrix 
	
    public int[][] transposeMatrix(int [][]matrix){

        int rows = matrix.length, columns = matrix[0].length;
        int [][]transposedMatrix = new int[columns][rows];

        for (int row = 0; row < rows; row++) {
            for (int column = 0; column < columns; column++) {
                transposedMatrix[column][row] = matrix[row][column];
            }
        }
        return transposedMatrix;
    }

    // helper method to display a matrix
	
    public void displayMatrix(int[][] matrix) 
	
	{
        if (matrix == null) 
		{
            System.out.println("Operation not possible");
            return;
        }

        for (int[] row : matrix) 
		{
            for (int value : row)
			{
                System.out.print(value + "\t");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) 
	{
        // create  a Scanner object
        Scanner sc = new Scanner(System.in);
        MatrixManipulator obj = new MatrixManipulator();

        System.out.print("Enter rows and columns: ");
        int rows = sc.nextInt();
        int columns = sc.nextInt();

        int[][] matrix1 = obj.getMatrix(rows, columns);
        int[][] matrix2 = obj.getMatrix(rows, columns);
        int[][] matrix3 = obj.getMatrix(columns, rows);

        System.out.println("Matrix 1:");
        obj.displayMatrix(matrix1);

        System.out.println("Matrix 2:");
        obj.displayMatrix(matrix2);

        System.out.println("Addition:");
        obj.displayMatrix(obj.addMatrix(matrix1, matrix2));

        System.out.println("Subtraction:");
        obj.displayMatrix(obj.subtractMatrix(matrix1, matrix2));

        System.out.println("Multiplication:");
        obj.displayMatrix(obj.multiplyMatrix(matrix1,matrix3));

        System.out.println("Transpose of Matrix 1:");
        obj.displayMatrix(obj.transposeMatrix(matrix1));

        sc.close();
    }
}