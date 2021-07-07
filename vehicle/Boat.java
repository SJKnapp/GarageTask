package vehicle;

public class Boat extends Vehicle {

	String hullCondition;

	public Boat(int repairTime, String vehicleDescription, String hullCondition) {
		super(0, repairTime, vehicleDescription);
		this.setHullCondition(hullCondition);
	}

	@Override
	public int bill() {
		return hullCondition.length() * 1000;
	}

	public String getHullCondition() {
		return hullCondition;
	}

	public void setHullCondition(String hullCondition) {
		this.hullCondition = hullCondition;
	}

	@Override
	public String toString() {
		return "[boat [hullCondition=" + hullCondition + ", " + super.toString() + "]";
	}

}
