package GPA;

import java.util.Scanner;

public class GPA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        
        double gradeNumber = 0.0;
        
        double GPA = 0.0;
        
        double gradePoints = 0.0;
        
        double finalGPA = 0.0;                
        
        
        int creditTotal = 0;
        
        int Credit = 0;
        
        
        String courseList = null;
        
        String courseInfo = null;
        
        
        System.out.println("Enter the course information title, credit hours, letter grade ( grade can be followed by + or -), or enter Q to quit: ");
        
        
        if(courseInfo.equals("Q")) {
        	break; 
        
        
        String [] data = courseInfo.split(",");
        String info = data[0];
        int hours = Integer.parseInt(data[1]);
        String grade = data[2];
        
        Credit = hours;
        courseList = info;
        creditTotal += hours;
        
        	System.out.println("Course: " + courseList);
        	System.out.println("Credits: " + Credit + "(" + creditTotal + "total)");
        
        
        
        if (grade.equals("A") || grade.equals("A+")) {
        	gradeNumber = 4.0;
        	finalGPA += gradeNumber;
        	System.out.println("The numeric value is: " + gradeNumber + " (" + finalGPA + "total)"); 
        
        }
        else if (grade.equals("A-")) {
        	gradeNumber = 3.7;
        	finalGPA += gradeNumber;
        	System.out.println("The numeric value is: " + gradeNumber + " (" + finalGPA + "total)");
       
	    }
        else if (grade.equals("B+")) {
        	gradeNumber = 3.3;
        	finalGPA += gradeNumber;
        	System.out.println("The numeric value is: " + gradeNumber + " (" + finalGPA + "total)");
        	
        }
        else if (grade.equals("B")) {
        	gradeNumber = 3.0;
        	finalGPA += gradeNumber;
        	System.out.println("The numeric value is: " + gradeNumber + " (" + finalGPA + "total)");
       
        }
        else if (grade.equals("B-")) {
        	gradeNumber = 2.7;
        	finalGPA += gradeNumber;
        	System.out.println("The numeric value is: " + gradeNumber + " (" + finalGPA + "total)");
        
        }
        else if (grade.equals("C+")) {
        	gradeNumber = 2.3;
        	finalGPA += gradeNumber;
        	System.out.println("The numeric value is: " + gradeNumber + " (" + finalGPA + "total)");
        
        }
        else if (grade.equals("C")) {
        	gradeNumber = 2.0;
        	finalGPA += gradeNumber;
        	System.out.println("The numeric value is: " + gradeNumber + " (" + finalGPA + "total)");
        
        }
        else if (grade.equals("C-")) {
        	gradeNumber = 1.7;
        		finalGPA += gradeNumber;
        System.out.println("The numeric value is: " + gradeNumber + " (" + finalGPA + "total)");
        
        }
        else if (grade.equals("D+")) {
        	gradeNumber = 1.3;
        	finalGPA += gradeNumber;
        	System.out.println("The numeric value is: " + gradeNumber + " (" + finalGPA + "total)");
        
        }
        else if (grade.equals("D")) {
        	gradeNumber = 1.0;
        	finalGPA += gradeNumber;
        	System.out.println("The numeric value is: " + gradeNumber + " (" + finalGPA + "total)");
        
        }
        else if (grade.equals("F")) {
        	gradeNumber = 0;
        	finalGPA += gradeNumber;
        	System.out.println("The numeric value is: " + gradeNumber + " (" + finalGPA + "total)");
        
        } else {
        	
        	
        
        	}
        }
        double Gpa = finalGPA / creditTotal;
     	System.out.println("Your GPA IS " + GPA);
     	
	    }
	}


