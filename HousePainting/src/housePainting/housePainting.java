package housePainting;
import java.util.Scanner;

public class housePainting {

  public static void main(String[]args) {
	  Scanner scan = new Scanner(System.in);
	  
	  //Accept all dimensions 
	  System.out.println("Enter width of the house:");
	  int houseWidth = scan.nextInt(); 
	  System.out.print("Enter length of the house");
	  int houseLength = scan.nextInt();
	  
	  //Perform Computations
	  int houseSqFT = houseLength * houseWidth; 
	  
	  //Print the result
	  System.out.println("The square footage is: " + houseSqFT);
	 
  
