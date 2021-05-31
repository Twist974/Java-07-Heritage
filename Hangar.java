package com.wcs;

public class Hangar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car peugeot = new Car("une 208", 1000);
		Boat boat = new Boat("Spirit", 8000);
		
		System.out.println(peugeot.doStuff());
		System.out.println(boat.doStuff());
	}

}
