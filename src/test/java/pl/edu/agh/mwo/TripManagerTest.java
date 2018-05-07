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
		
		tm.addTrip(trip1);
		tm.addTrip(trip2);
		
		//then
		List<Trip> storedTrips = tm.getTrips();
		
		assertEquals(2, storedTrips.size());
		assertTrue(storedTrips.contains(trip1));
		assertTrue(storedTrips.contains(trip2));
	}
	
	@Test
	public void removeStoredTrips() {
		//given
		TripManager tm = new TripManager();
		Trip trip1 = new Trip();
		Trip trip2 = new Trip();
		
		//when
		tm.addTrip(trip1);
		tm.addTrip(trip2);
		
		tm.removeTrip(trip2);
		
		//then
		List<Trip> storedTrips = tm.getTrips();
		assertEquals(1, storedTrips.size());
		assertTrue(storedTrips.contains(trip1));
	}
	
	@Test
	public void findTripShouldFindFirstTripByName() {
		// given
		TripManager tm = new TripManager();
		Trip trip1 = new Trip();
		trip1.name = "From Russia with love";
		tm.addTrip(trip1);
		Trip trip2 = new Trip();
		trip2.name = "Mountain trip";
		tm.addTrip(trip2);
		Trip trip3 = new Trip();
		trip3.name = "Russia again";
		tm.addTrip(trip3);
		
		// when
		Trip foundTrip = tm.findTrip("Russia");
		
		// then
		assertEquals(trip1, foundTrip);
	}
	
	@Test
	public void findTripShouldNotFailForTripWithNullName() {
		// given
		TripManager tm = new TripManager();
		Trip trip1 = new Trip();
		trip1.name = null;
		tm.addTrip(trip1);
		Trip trip2 = new Trip();
		trip2.name = "From Russia with love";
		tm.addTrip(trip2);
		
		// when
		Trip foundTrip = tm.findTrip("Russia");
		
		// then
		assertEquals(trip2, foundTrip);
	}
	
	@Test 
	public void findTripShouldReturnNullWhenNoTripWithGivenKeywordExists() {
		// given
		TripManager tm = new TripManager();
		Trip trip1 = new Trip();
		trip1.name = "Mountain trip";
		tm.addTrip(trip1);
				
		// when
		Trip foundTrip = tm.findTrip("Russia");
				
		// then
		assertEquals(null, foundTrip);
	}
}
