package march;

import java.util.Scanner;

public class NOAAHeatIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	
			Scanner kb = new Scanner(System.in);
			System.out.println("NOAA's National Weather Service");       
			System.out.println("Heat Index");
			System.out.println(" ");
			System.out.println("Relative Temperature(F)");
			System.out.println("Humidity(%)");
			
			System.out.printf(" ");
			
			//temp
			for (int temp = 80; temp <= 110; temp = temp + 2) {
				System.out.printf("%6d", temp);
			}
			System.out.println();
			System.out.println("__________________________________");
			
			//relative humidity 
			for (int humidity = 40; humidity <=100; humidity = humidity + 5) {
				System.out.printf("%3d  | ", humidity);
				
				//heat index
				for( int a = 80; a <= 110; a = a + 2) {
					//calculation
					String blank = " ";
					
					int calculation = (int)(-42.379 + (2.04901523 + a ) + (10.14333127 + humidity) - (.22475541 * a * humidity) - (.00683783 * a * a) - (.05481717 * humidity * humidity) - (.00122874 * a * a * humidity) + (.00085282 * a * humidity * humidity) - (.00000199 * a * a * humidity * humidity));
					
					if (calculation <= 137) {
							System.out.printf("%6d", calculation);
					}
					else 
							System.out.printf("%6s", blank);
						
				}
				System.out.println();
			}
			
			//. If the THI is <90 advisory should be caution.
			//. else If the THI is <105 advisory should be Extreme caution.
			//. else If the THI is <126 advisory should be danger .
			//. else the advisory should be Extreme caution.
			boolean run = true;
			while(run == true) {
					System.out.println("Enter temperature or 0 to end: ");
					double secondTemp = kb.nextDouble();
					if (secondTemp == 0) {
							run = false;
							System.out.println("You quit");
							break;
					}
					
					
					System.out.println("Enter relative humidity: "); 
					double secondHumid = kb.nextDouble();
					
					double thi = -42.379 + (2.04901523 * secondTemp ) + (10.14333127 + secondHumid) - (.22475541 * secondTemp * secondHumid) - (.00683783 * secondTemp * secondTemp) - (.05481717 * secondHumid * secondHumid) - (.00122874 * secondTemp* secondTemp * secondHumid) + (.00085282 * secondTemp * secondHumid * secondHumid) - (.00000199 * secondTemp * secondTemp * secondHumid * secondHumid);
					System.out.println("The THI for a temperature of " + (int)secondTemp + " and relative humidity of " + (int) secondHumid + " is " + (int) thi);
					
					if (thi <=90) {
							System.out.println("Advisory: Caution");
					}
					else if (thi < 105) {
							System.out.println("Advisory: Extreme Caution");
					}
					else if (thi < 126) {
							System.out.println("Advisory: Danger");
					}
					else {
							System.out.println("Advisory: Extreme Danger");
					}
			}
					
			}

}
