package pl.edu.agh.mwo;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class TripTest {

    @Test
    public void storingPhotosDefaultPath() {
        // given
        Trip trip = new Trip();
        Photo photo1 = new Photo();
        Photo photo2 = new Photo();
        Photo photo3 = new Photo();

        // when
        trip.addPhoto(photo1);
        trip.addPhoto(photo2);

        // then
        List<Photo> storedPhotos = trip.getPhotos();

        assertEquals(2, storedPhotos.size());
        assertTrue(storedPhotos.contains(photo1));
        assertTrue(storedPhotos.contains(photo2));
        assertFalse(storedPhotos.contains(photo3));
        
    }
}
