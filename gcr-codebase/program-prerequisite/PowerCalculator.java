import java.util.*;
public class PowerCalculator{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the base");
        double base= sc.nextDouble();
        System.out.println("Enter the exponent");
        double exponent = sc.nextDouble();
        double value= Math.pow(base, exponent);
        System.out.println(value);
    }
}