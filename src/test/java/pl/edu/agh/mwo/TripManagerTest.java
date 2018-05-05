package pl.edu.agh.mwo;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.Test;

public class TripManagerTest {
	
	@Test
	public void storingTripsDefaultPath() {
		//given
		TripManager tm = new TripManager();
		
		//when
		Trip trip1 = new Trip();
		Trip trip2 = new Trip();
		//Trip trip3 = new Trip();
		
		tm.addTrip(trip1);
		tm.addTrip(trip2);
		
		//then
		List<Trip> storedTrips = tm.getTrips();
		
		assertEquals(2, storedTrips.size());
		assertTrue(storedTrips.contains(trip1));
		assertTrue(storedTrips.contains(trip2));
	}
	
}
