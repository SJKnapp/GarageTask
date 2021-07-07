package garage;

import java.util.ArrayList;

import vehicle.Vehicle;

public class Garage {

	private int nextId;

	private ArrayList<Vehicle> vechicles = new ArrayList<>();

	public Garage() {

	}

	// Creates a vehicle and returns its id -1 for a failed creation
	public int addVehicle(Vehicle vehicle) {
		int id = nextId;
		nextId++;

		vehicle.setId(id);

		vechicles.add(vehicle);

		return id;
	}

	private int findId(int id) {
		for (int i = 0; i < vechicles.size(); i++) {
			if (vechicles.get(i).getId() == id) {
				return i;
			}
		}
		return -1;
	}

	public boolean removeVechileById(int id) {

		int i = findId(id);

		if (i != -1) {
			vechicles.remove(i);
			return true;
		}
		return false;
	}

	public boolean emptyGarage() {
		vechicles = new ArrayList<>();

		return true;
	}

	public int fixVechile(int id) {
		int i = findId(id);

		if (i != -1) {
			return vechicles.get(i).bill();
		}

		return -1;
	}

	public int totalRepairCostOfAll() {
		int cost = 0;
		for (Vehicle vehicle : vechicles) {
			cost += vehicle.bill();
		}

		return cost;
	}

	public boolean removeFirstFoundByType(String type) {
		for (int i = 0; i < vechicles.size(); i++) {
			if (vechicles.get(i).getClass().getTypeName().substring(8).toLowerCase().equals(type)) {
				vechicles.remove(i);
				return true;
			}
		}

		return false;
	}

	public boolean removeByType(String type) {
		ArrayList<Vehicle> toRemove = new ArrayList<>();

		for (int i = 0; i < vechicles.size(); i++) {
			if (vechicles.get(i).getClass().getTypeName().substring(8).toLowerCase().equals(type)) {
				toRemove.add(vechicles.get(i));
			}
		}

		vechicles.removeAll(toRemove);

		if (toRemove.size() != 0) {
			return true;
		}
		return false;
	}

	@Override
	public String toString() {

		return vechicles.toString();
	}
}
