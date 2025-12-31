/* Currency Exchange Kiosk 💱
Design a currency converter:
● Take INR amount and target currency.
● Use a switch to apply the correct rate.
● Ask if the user wants another conversion (do-while). */

import java.util.*;
public class CurrencyExchange
{
	public static void main(String args[])
	{
		System.out.println("Welcome to the Currency exchange");
		System.out.println("find the currencies you want to exchange and press the number associated with it");
		System.out.println("\n---------------------------------------------------------------");
        System.out.printf("| %-4s | %-30s | %-20s |\n",
                          "No", "Currency Name", "Rate (1 unit in INR)");
        System.out.println("---------------------------------------------------------------");

        System.out.printf("| %-4d | %-30s | %-20.2f |\n", 1, "Kuwaiti Dinar", 239.00);
        System.out.printf("| %-4d | %-30s | %-20.2f |\n", 2, "British Pound", 121.00);
        System.out.printf("| %-4d | %-30s | %-20.2f |\n", 3, "Euro", 106.00);
        System.out.printf("| %-4d | %-30s | %-20.2f |\n", 4, "US Dollar", 90.00);
        System.out.printf("| %-4d | %-30s | %-20.2f |\n", 5, "Swiss Franc", 113.00);
        System.out.printf("| %-4d | %-30s | %-20.2f |\n", 6, "Singapore Dollar", 70.00);
        System.out.printf("| %-4d | %-30s | %-20.2f |\n", 7, "Canadian Dollar", 66.00);
        System.out.printf("| %-4d | %-30s | %-20.2f |\n", 8, "Australian Dollar", 60.00);
        System.out.printf("| %-4d | %-30s | %-20.2f |\n", 9, "UAE Dirham", 24.50);
        System.out.printf("| %-4d | %-30s | %-20.2f |\n",10, "Saudi Riyal", 24.00);
        System.out.printf("| %-4d | %-30s | %-20.2f |\n",11, "Chinese Yuan", 12.80);
        System.out.printf("| %-4d | %-30s | %-20.2f |\n",12, "Japanese Yen", 0.57);
        System.out.printf("| %-4d | %-30s | %-20.2f |\n",13, "Malaysian Ringgit", 22.10);
        System.out.printf("| %-4d | %-30s | %-20.2f |\n",14, "Thai Baht", 2.84);
        System.out.printf("| %-4d | %-30s | %-20.2f |\n",15, "South African Rand", 5.38);

        System.out.println("---------------------------------------------------------------");
		
		//creating object of scanner and taking input
		Scanner sc = new Scanner (System.in);
		int num = sc.nextInt();
		
		double currency = 0.0;
		
		//switch case to convert
		switch (num)
		{
			case (1):
			System.out.printf("Enter the total Kuwaiti Dinar you want to exchange : ");
			currency = sc.nextInt();
			System.out.printf("Total amount in INR will be : Rs  " + (currency * 239.00));
			break;
			
			case (2):
			System.out.printf("Enter the total British Pound you want to exchange : ");
			currency = sc.nextInt();
			System.out.printf("Total amount in INR will be : Rs  " + (currency * 121.00));
			break;
			
			case (3):
			System.out.printf("Enter the total Euro you want to exchange : ");
			currency = sc.nextInt();
			System.out.printf("Total amount in INR will be : Rs  " + (currency * 106.00));
			break;
			
			case (4):
			System.out.printf("Enter the total USD you want to exchange : ");
			currency = sc.nextInt();
			System.out.printf("Total amount in INR will be : Rs  " + (currency * 90.00 ));
			break;
			
			case (5):
			System.out.printf("Enter the total Swiss Francs you want to exchange : ");
			currency = sc.nextInt();
			System.out.printf("Total amount in INR will be : Rs  " + (currency * 113.00));
			break;
			
			case (6):
			System.out.printf("Enter the total Singapore Dollar you want to exchange : ");
			currency = sc.nextInt();
			System.out.printf("Total amount in INR will be : Rs  " + (currency * 70));
			break;
			
			case (7):
			System.out.printf("Enter the total Canadian Dollar you want to exchange : ");
			currency = sc.nextInt();
			System.out.printf("Total amount in INR will be : Rs  " + (currency * 66.00));
			break;
			
			case (8):
			System.out.printf("Enter the total Australian Dollar you want to exchange : ");
			currency = sc.nextInt();
			System.out.printf("Total amount in INR will be : Rs  " + (currency * 60.00));
			break;
			
			case (9):
			System.out.printf("Enter the total UAE Dirham you want to exchange : ");
			currency = sc.nextInt();
			System.out.printf("Total amount in INR will be : Rs  " + (currency * 24.50 ));
			break;
			
			case (10):
			System.out.printf("Enter the total Saudi Riyal you want to exchange : ");
			currency = sc.nextInt();
			System.out.printf("Total amount in INR will be : Rs  " + (currency * 24 ));
			break;
			
			case (11):
			System.out.printf("Enter the total Chinese Yuan you want to exchange : ");
			currency = sc.nextInt();
			System.out.printf("Total amount in INR will be : Rs  " + (currency * 12.80));
			break;
			
			case (12):
			System.out.printf("Enter the total Japanese Yen you want to exchange : ");
			currency = sc.nextInt();
			System.out.printf("Total amount in INR will be : Rs  " + (currency * 0.57 ));
			break;
			
			case (13):
			System.out.printf("Enter the total Malaysian Ringgit you want to exchange : ");
			currency = sc.nextInt();
			System.out.printf("Total amount in INR will be : Rs  " + (currency * 22.10 ));
			break;
			
			case (14):
			System.out.printf("Enter the total Thai Baht you want to exchange : ");
			currency = sc.nextInt();
			System.out.printf("Total amount in INR will be : Rs  " + (currency * 2.84));
			break;
			
		
			case (15):
			System.out.printf("Enter the total South African Rand you want to exchange : ");
			currency = sc.nextInt();
			System.out.printf("Total amount in INR will be : Rs  " + (currency * 5.38));
			break;
			
			default :
			System.out.printf("Currency not available");
			
		}
		
		
		
		
		
	}
}
	

