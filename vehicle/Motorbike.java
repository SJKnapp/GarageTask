package vehicle;

public class Motorbike extends Vehicle {

	Boolean hasSideCar;

	public Motorbike(int wheelNum, int repairTime, String vehicleDescription, Boolean hasSideCar) {
		super(wheelNum, repairTime, vehicleDescription);
		this.setHasSideCar(hasSideCar);
	}

	public Boolean getHasSideCar() {
		return hasSideCar;
	}

	public void setHasSideCar(Boolean hasSideCar) {
		this.hasSideCar = hasSideCar;
	}

	@Override
	public int bill() {
		return hasSideCar ? 1000 : 500;
	}

	@Override
	public String toString() {
		return "Motorbike [hasSideCar=" + hasSideCar + ", " + super.toString() + "]";
	}

}
