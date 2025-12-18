// program to calculate discounted fees of a university given that total fee INR 125000 is and discount rate is 10%.
public class UniversityDiscountedFee{
	public static void main(String[] args){
		
		// creating an variable for fee and discount percent
		int fee = 125000,  discountPercent = 10;

		//  calculating discount and discounted fee
		double discount = (fee * discountPercent )/100;
		double discountedFee = (double)fee - discount;

		// display the result
		System.out.println("The discount amount is INR "+ discount + " and final discounted fee is INR "+ discountedFee);

	}
}