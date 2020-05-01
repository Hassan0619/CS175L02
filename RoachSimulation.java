package RoachSimulation;

public class RoachSimulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		populationOfRoaches bugs = new populationOfRoaches();
		
		
		
		bugs.startRoach(10);
		int totalRoaches = getRoaches.bugs();
		System.out.println("Initial Roach population is " + totalRoaches);
		
		breed.bugs();
		totalRoaches = getRoaches.bugs();
		System.out.println("Roach population after cycle 1 breeding is " + totalRoaches);
		
		spray.bugs(50);
		totalRoaches = getRoaches.bugs();
		System.out.println("Roach population after cycle 1 50% spraying is " + totalRoaches);
		
		breed.bugs();
		totalRoaches = getRoaches.bugs();
		System.out.println("Roach population after cycle 2 breeding is " + totalRoaches);
		
		spray.bugs(60);
		totalRoaches = getRoaches.bugs();
		System.out.println("Roach population after cycle 2 60% spraying is " + totalRoaches);
		
		breed.bugs();
		totalRoaches = getRoaches.bugs();
		System.out.println("Roach population after cycle 3 breeding is " + totalRoaches);
		
		spray.bugs(70);
		totalRoaches = getRoaches.bugs();
		System.out.println("Roach population after cycle 3 70% spraying is " + totalRoaches);
		
		breed.bugs();
		totalRoaches = getRoaches.bugs();
		System.out.println("Roach population after cycle 4 breeding is " + totalRoaches);
		
		spray.bugs(80);
		totalRoaches = getRoaches.bugs();
		System.out.println("Roach population after cycle 4 80% spraying is " + totalRoaches);
	
	}

}
