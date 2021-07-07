package vehicle;

public class Car extends Vehicle {

	int numberOfSeats;

	public Car(int wheelNum, int repairTime, String vehicleDescription, int numberOfSeats) {
		super(wheelNum, repairTime, vehicleDescription);
		this.setNumberOfSeats(numberOfSeats);
	}

	public int getNumberOfSeats() {
		return numberOfSeats;
	}

	public void setNumberOfSeats(int numberOfSeats) {
		this.numberOfSeats = numberOfSeats;
	}

	@Override
	public int bill() {

		return super.getRepairTime() ^ super.getWheelNum();
	}

	@Override
	public String toString() {
		return "Car [numberOfSeats=" + numberOfSeats + ", " + super.toString() + "]";
	}

}
