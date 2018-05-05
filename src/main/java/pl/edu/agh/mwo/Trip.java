package pl.edu.agh.mwo;

import java.util.ArrayList;
import java.util.List;

public class Trip {

    public String name;
    public String description;
    private List<Photo> photos = new ArrayList<>();

    public void addPhoto(Photo p) {
        if (p == null) {
            throw new IllegalArgumentException("photo must not be null");
        }
        photos.add(p);
    }

    public List<Photo> getPhotos() {
        return photos;
    }

}
