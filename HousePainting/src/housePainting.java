import java.util.Scanner;

public class housePainting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
			
		//Accept all dimensions 
		System.out.print("Enter the width of the House");
		int houseWidth = scan.nextInt();
		System.out.println("Enter the length of the House");
		int houseLength = scan.nextInt(); 
		System.out.println("Enter the height of the House");
		int houseHeight = scan.nextInt();
		System.out.println("Enter the number of Windows");
		int numberOfWindows = scan.nextInt();
		System.out.print("Enter the length of the Window");
		int LengthOfWindows = scan.nextInt();
		System.out.print("Enter the width of the Window");
		int widthOfWindows = scan.nextInt();
		System.out.print("Enter the number of Doors");
		int numberOfDoors = scan.nextInt();
		System.out.print("Enter the length of Doors");
		int lengthOfDoors = scan.nextInt();
		System.out.print("Enter the width of Doors");
		int widthOfDoors = scan.nextInt();
		int windowSquareFeet = (numberOfWindows * LengthOfWindows * widthOfWindows);
		int doorSquareFeet = (numberOfDoors * lengthOfDoors * widthOfDoors);
		
		
		
		
		//Print the SqFT 
		double houseSqFT = 2*(houseLength * houseWidth) + 2 * 
			(houseLength*houseWidth + .5 * (houseLength * (houseHeight-houseWidth)));
		System.out.println(houseSqFT);
		double SqftTopaint = (houseSqFT-(windowSquareFeet + doorSquareFeet));
		System.out.println(SqftTopaint);
		//System.out.println("The square footage is: "+ houseSqFt): 
		
		
				
				
				
		
		
		
				
		
	}

}
