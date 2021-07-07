package garage;

import vehicle.Boat;
import vehicle.Car;
import vehicle.Motorbike;

public class App {

	public static void main(String[] args) {
		Garage garage = new Garage();

		garage.addVehicle(new Car(3, 4, "racing car", 1));
		garage.addVehicle(new Motorbike(2, 20, "with side car", true));
		garage.addVehicle(new Boat(5, "small", "with hole"));
		garage.addVehicle(new Car(4, 3, "t", 1));
		garage.addVehicle(new Car(4, 3, "v", 1));
		garage.addVehicle(new Car(4, 3, "c", 1));
		garage.addVehicle(new Car(4, 3, "e", 1));
		System.out.println(garage);

		System.out.println(garage.totalRepairCostOfAll());

		garage.removeFirstFoundByType("car");

		System.out.println(garage);

		garage.removeVechileById(1);

		System.out.println(garage);

		garage.removeByType("car");

		System.out.println(garage);

		System.out.println(garage.fixVechile(2));

		garage.emptyGarage();

		System.out.println(garage);

	}
}
