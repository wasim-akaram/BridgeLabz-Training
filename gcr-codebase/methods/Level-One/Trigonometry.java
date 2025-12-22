//program to calculate various trigonometric functions using Math class given an angle in degree



import java.util.*;
public class Trigonometry
{

    // Method To find  trigonometric functions
    public String findTrigonometricFunctions(int degree)
	{
		double radian = Math.toRadians(degree);
		double valueOfSine = Math.sin(radian);
		double valueOfCosine = Math.cos(radian);
		double valueOfTangent = Math.tan(radian);
		
		String returnOutput= " sin (" +degree+ ") = " + valueOfSine +
								" cosine (" +degree+") = " + valueOfCosine +
								" tangent (" +degree+") = " + valueOfTangent ;
		return returnOutput;						
		
	}
	
	public static void main (String args[])
	{
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter the degree");
		int degree= sc.nextInt();
		
		Trigonometry objectTrigonometry= new Trigonometry();
		
		String result = objectTrigonometry.findTrigonometricFunctions(degree);
		
		
		//display result
		System.out.println( result);
	}
}
		
	