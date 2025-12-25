//GCD program


import java.util.*;
public class GCDandLCM
{
	
	public static int lcm(int n, int s) 
	
	{
        return (n * s) / gcd(n, s);
    }


    
    public static int gcd(int n, int s) 
	{
        while (s != 0) 
		{
            int temp = s;
            s = n % s;
            n = temp;
        }
        return n;
    }
    
	
	public static void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int s = sc.nextInt();

        System.out.println("The GCD is " + gcd(n, s));
        System.out.println("The LCM is " + lcm(n, s));

    }
}
