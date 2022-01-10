package inheritanceRev3;

public class BicycleDemo {

	public static void main(String[] args) {

		MountainBike MountainBike = new MountainBike (1,10,20);
		
		System.out.println ("Gear is: "+ MountainBike.gear);
		System.out.println ("speed is: "+ MountainBike.speed);
		System.out.println ("Seat Height is: "+ MountainBike.seatHeight);
		
		MountainBike.applyBrake(1);
		System.out.println("The Speed After Applying Break: " + MountainBike.speed);
		
		MountainBike.getSpeed(5);
		System.out.println("The Speed After Accelator: " + MountainBike.speed);
		
		MountainBike.setGear(4);
		System.out.println("New Gear value: " + MountainBike.gear);
		
		MountainBike.setHeight(25);
		System.out.println("New Height is: " + MountainBike.seatHeight);
	}

}
