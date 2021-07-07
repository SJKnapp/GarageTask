package vehicle;

public abstract class Vehicle {

	private int wheelNum;
	private int id;
	private int repairTime;
	private String vehicleDescription;

	public Vehicle(int wheelNum, int repairTime, String vehicleDescription) {
		this.setWheelNum(wheelNum);
		this.setRepairTime(repairTime);
		this.setVehicleDescription(vehicleDescription);
	}

	public String getVehicleDescription() {
		return vehicleDescription;
	}

	public void setVehicleDescription(String vehicleDescription) {
		this.vehicleDescription = vehicleDescription;
	}

	public int getRepairTime() {
		return repairTime;
	}

	public void setRepairTime(int repairTime) {
		this.repairTime = repairTime;
	}

	public int getWheelNum() {
		return wheelNum;
	}

	public void setWheelNum(int wheelNum) {
		this.wheelNum = wheelNum;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Vehicle [wheelNum=" + wheelNum + ", id=" + id + ", repairTime=" + repairTime + ", vehicleDescription="
				+ vehicleDescription + "]";
	}

	// returns bill in pence
	public abstract int bill();

}
