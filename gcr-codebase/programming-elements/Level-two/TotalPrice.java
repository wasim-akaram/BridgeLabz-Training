// a program that finds total price by unit price and quantity

import java.util.Scanner;
public class TotalPrice{
    public static void main(String[] args){
        
        // taking user input for unit price and quantity
        Scanner sc=new Scanner(System.in);
        float unitPrice=sc.nextFloat();
        int quantity=sc.nextInt();
        
        // calculating the total price
        float totalPrice=unitPrice*quantity;
        
        // displaying the result
        System.out.println("The total purchase price is INR "+totalPrice+" if the quantity is "+quantity+" and unit price is INR "+unitPrice);
    }
}