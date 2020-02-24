package GroceryDiscount;

import java.util.Scanner;

public class GroceryDiscountVersion2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		double Discount;
		final double discountCoupon1 = 0.08;
		final double discountCoupon2 = 0.10;
		final double discountCoupon3 = 0.12;
		final double discountCoupon4 = 0.14;
		double PriceOfGrocery;
		
		
		
		
		
		
		System.out.println("Enter cost of groceries or 0 to quit ");
		while (sc.hasNextDouble())
		{
			
		PriceOfGrocery = sc.nextDouble();
		
		
		
		
		if( PriceOfGrocery ==0) { break; }
		
		if ( PriceOfGrocery <10 || PriceOfGrocery >1000 )
		{System.out.println("Error Not In Range"); }
		
	    else if (PriceOfGrocery >210)		
			     {
				Discount = PriceOfGrocery * discountCoupon4;
				System.out.println("you win a discount of $" + Discount + "(" + discountCoupon4 * 100 + "% of your purchase)");
			     }
			else if (PriceOfGrocery >150 && PriceOfGrocery <=210)
			     {
				Discount = PriceOfGrocery * discountCoupon3;
				System.out.println("you win a discount of $" + Discount + "(" + discountCoupon3 * 100 + "% of your purchase)");
			     }
		    else if (PriceOfGrocery >60 && PriceOfGrocery <=150)
			     {
		    	Discount = PriceOfGrocery * discountCoupon2;
		    	System.out.println("you win a discount of $" + Discount + "(" + discountCoupon2 * 100 + "% of your purchase)");
			     }
		    else if (PriceOfGrocery >=10 && PriceOfGrocery <=60)
			     {
				Discount = PriceOfGrocery * discountCoupon1;
				System.out.println("you win a discount $" + Discount + "(" + discountCoupon1 * 100 + "% of your purchase)");
			     }
			
			else
			{
				System.out.println("You aren't eligible for a coupon this time ");
		} 
		}
		
			
			

			
			
		}
			
				
	
			
}
	