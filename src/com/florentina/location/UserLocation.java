package com.florentina.location;

import java.util.ArrayList;
import java.util.List;

public class UserLocation extends Location{
    private List<Coordinate> coordinateList;

    public UserLocation(Coordinate coordinate) {
        super(coordinate, LocationType.USER_LOCATION);
        coordinateList = new ArrayList<>();
        coordinateList.add(coordinate);
    }

    public List<Coordinate> showLocationHistory(){
        return coordinateList;
    }

    public void setCurrentLocation(Coordinate currentLocation) {
        this.coordinate = currentLocation;
        coordinateList.add(currentLocation);
    }


}
