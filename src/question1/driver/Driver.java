package question1.driver;

import question1.service.Service;
import java.io.IOException;
import java.util.Scanner;

public class Driver {
	
	public static void main (String[] args) throws IOException {
		
		
		int noOfFloor;
		int[] floors;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter the total no of floors in the building");
		
		noOfFloor = sc.nextInt();
		floors = new int [noOfFloor];
		
	    for(int i = 0; i < noOfFloor; i++) {
	    	
	    	System.out.println("enter the floor size given on day : "+(i+1));
	    	floors[i] = sc.nextInt();
	    }
	    
	    System.out.println();
	    
	    Service obj = new Service();
	    obj.printConstructionTable(floors);
	    
	}

}
