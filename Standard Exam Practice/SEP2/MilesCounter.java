package sepTwo;

import java.util.List;
import java.util.ArrayList;

public class MilesCounter {
	public static List<Vehicle> convertArray(Object[] vehicleArray) {
		
		List<Vehicle> vehicles = new ArrayList<>();
		
		for(Object o : vehicleArray) {
			
			Vehicle obj = (Vehicle)o;
			vehicles.add(obj);
		}
		
		return vehicles;
	}
	
	
	public static int computeTotalMiles(List<Vehicle> vehicleList) {
		
		int total = 0;
		
		for(Vehicle vehicle : vehicleList ) {
			total += vehicle.getMilesUsedToday();
		}
		
		
		return total;
	}
}