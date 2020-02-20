package GroceryDiscount;

import java.util.Scanner;

public class GroceryDiscount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		double Discount;
		final double discountCoupon1 = 0.08;
		final double discountCoupon2 = 0.10;
		final double discountCoupon3 = 0.12;
		final double discountCoupon4 = 0.14;
		double groceryPrice;
		
		
		
		
		
		
		
		while (true) {
			
		System.out.println("Enter cost of groceries or 0 to quit");
		groceryPrice = sc.nextDouble();
		if( groceryPrice != 0) {
			if (groceryPrice >210)
			{
				Discount = groceryPrice * discountCoupon4;
				System.out.println("you win a discount of $" + Discount + "(" + discountCoupon4 * 100 + "% of your purchase)");
			}
			else if (groceryPrice >150 && groceryPrice <=210)
			{
				Discount = groceryPrice * discountCoupon3;
				System.out.println("you win a discount of $" + Discount + "(" + discountCoupon3 * 100 + "% of your purchase)");
			}
		    else if (groceryPrice >60 && groceryPrice <=150)
			{
		    	Discount = groceryPrice * discountCoupon2;
		    	System.out.println("you win a discount of $" + Discount + "(" + discountCoupon2 * 100 + "% of your purchase)");
			}
		    else if (groceryPrice >=10 && groceryPrice <=60)
			{
				Discount = groceryPrice * discountCoupon1;
				System.out.println("you win a discount $" + Discount + "(" + discountCoupon1 * 100 + "% of your purchase)");
			}
			
			else
			{
				System.out.println("You aren't eligible for a coupon this time ");
		} 
		}
		else {
			break; 
			
			
		}
			
				
	}	
			
}
	}	

	


