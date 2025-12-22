// program for Euclidean distance between two points as well as the equation of the line using those two points


import java.util.Scanner;
public class EuclideanDistance 
{
    // calculating euclidean distance 
	
    public double getEuclideanDistance(int []x, int []y) 
	{
        double distance = Math.sqrt(Math.pow(x[1] - x[0], 2) +  Math.pow(y[1] - y[0], 2));
        
		return distance;
    }

    // return slope and y-intercept for 2 points as equation of the line
	
    public double[] getLineEquation(int []x, int []y) 
	{
	
        double slope = (double)(y[1] - y[0]) / (x[1] - x[0]);
        double yIntercept = y[0] - slope * x[0];

        return new double[]{slope, yIntercept};
    }

    public static void main(String[] args) 
	{
       
        Scanner sc = new Scanner(System.in);

        EuclideanDistance object = new EuclideanDistance();

        int[] x = new int[2], y = new int[2];
        x[0] = sc.nextInt();
        y[0] = sc.nextInt();
        x[1] = sc.nextInt();
        y[1] = sc.nextInt();

        System.out.println("The Euclidean distance is "+ object.getEuclideanDistance(x,y));

        double[] equation = object.getLineEquation(x, y);
		
        System.out.println("Equation of the line is : y = " + equation[0] + "x + " + equation[1]);

        
        sc.close();
    }
}
