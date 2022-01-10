package inheritanceRev3;

public class MountainBike extends Bicycle {
	
	protected int seatHeight;
	
	
	public MountainBike (int gear, int speed, int seatHeight) {
		
		super(gear, speed);
		this.seatHeight = seatHeight;
	}
	
	
	public void setHeight (int newValue) {
		
		seatHeight = newValue ;
	}
	
	

}

	