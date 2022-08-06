package hw6;

import java.util.Arrays;

public class Bird{


	public static void main(String[] args) {
		
		 Eagle e = new Eagle ("Eagleman");
		 Swallow s = new Swallow ("Swallowbird");
		 Penguin p = new Penguin ("Penguinchik");
		 Chicken c = new Chicken ("Chickenchi");
	
		 String [] bird = new String [] { e.toString(), s.toString(), p.toString(), c.toString()};

	        System.out.println("Eagle fly: " + e.getCanFlying());
	        System.out.println("Swallow fly: " + s.getCanFlying());
	        System.out.println("Penquin fly: " + p.getNonFlyingBird());
	        System.out.println("Chiken fly: " + c.getNonFlyingBird());
	        System.out.println(Arrays.toString(bird));
	
	
	
	
	}
 	}




