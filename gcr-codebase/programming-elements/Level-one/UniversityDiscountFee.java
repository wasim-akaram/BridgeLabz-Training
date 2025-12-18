// program to calculate discounted fees of a university by taking input
import java.util.*;
public class UniversityDiscountFee{
	public static void main(String[] args){
		
		Scanner sc= new Scaner(System.in);
	
		// creating an variable and taking input
		double fee = sc. nextDouble();
		double discountPercent = sc. nextDouble();

		//  calculating discount and discounted fee
		double discount = (fee * discountPercent )/100;
		double discountedFee = fee - discount;

		// display the result
		System.out.println("The discount amount is INR "+ String.format("%.2f", discount) + " and final discounted fee is INR "+ String.format("%.2f", discountedFee));

	}
}