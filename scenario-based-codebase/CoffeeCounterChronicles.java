/*	Java program that asks the user for the coffee type using switch, accepts quantity, calculates the total 
bill using price multiplied by quantity, adds GST using arithmetic operators, and continues serving customers 
using a while loop. The program should stop when the user types “exit”. */


import java.util.Scanner;
public class CoffeeCounterChronicles 
{
	
	
    
    public static void main(String[] args) 
	{
        
        Scanner sc = new Scanner(System.in);
		
		//variable for GST RATE
        final double GST_RATE = 0.18; 

        while (true) 
		{
            System.out.print("Enter coffee type (espresso/latte/cappuccino);
			System.out.print("or type 'exit' to stop");
            String coffee = sc.next();

            // exit condition
            if (coffee.equals("exit")) 
			{
                System.out.println("Thank you! Have a nice day\n");
                break;
            }

            double price;
            switch (coffee) 
			{
                case "espresso":
                    price = 120.0;
                    break;
                case "latte":
                    price = 150.0;
                    break;
                case "cappuccino":
                    price = 140.0;
                    break;
                default:
                    System.out.println("Invalid input");
                    continue; 
            }


            System.out.print("Enter quantity of coffee: ");
            int quantity = sc.nextInt();

            // Calculate the total bill
            double subtotal = price * quantity;
            double gstAmount = subtotal * GST_RATE;
            double totalWithGst = subtotal + gstAmount;

            // Display bill summary
            System.out.printf("Subtotal: %.2f | GST: %.2f | Total: %.2f\n\n", subtotal, gstAmount, totalWithGst);
        }
        sc.close();
    }
}
