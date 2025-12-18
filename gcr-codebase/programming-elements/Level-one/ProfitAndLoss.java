/* Create a program to calculate the profit and 
loss in number and percentage based on the cost 
price of INR 129 and the selling price of INR 191
*/
public class ProfitAndLoss{
	public static void main(String args[]){
	
	//Creating variables to store Cost, Selling price an dpercentage
	double costPrice= 129, sellingPrice = 191;
	
	//calculating profit and profit percentage
	double profit = sellingPrice - costPrice;
	double profitPercentage = profit / costPrice * 100;
	
	//displaying the ouput
	System.out.println("The Cost Price is INR " + costPrice + " and Selling Price is INR " + sellingPrice+
	"\nThe Profit is INR " + profit + " and the Profit Percentage is " + String.format("%.2f", profitPercentage));
	}
}
 