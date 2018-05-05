package pl.edu.agh.mwo;

import java.util.ArrayList;
import java.util.List;

public class TripManager {
	
	private List<Trip> trips = new ArrayList<>();
	
	public void addTrip(Trip trip) {
		trips.add(trip);
	}
	
	public List<Trip> getTrips() {
		return trips;
	}
	
	public void removeTrip(Trip trip) {
		trips.remove(trip);
	}

}
