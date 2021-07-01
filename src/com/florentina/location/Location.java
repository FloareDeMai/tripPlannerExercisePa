package com.florentina.location;

import java.util.List;

public abstract class Location {
    protected Coordinate coordinate;
    private LocationType locationType;


    public Location(Coordinate coordinate, LocationType locationType) {
        this.coordinate = coordinate;
        this.locationType = locationType;
    }

    public Coordinate getCoordinate() {
        return coordinate;
    }

    public LocationType getLocationType() {
        return locationType;
    }


    public City returnClosestCity(List<City> cityList) {
        int distance;
        Coordinate currentLocation = this.getCoordinate();
        int minDistance = Integer.MAX_VALUE;
        City cityMin = cityList.get(0);
        for(City city: cityList){
            distance = (int) Math.sqrt((city.getCoordinate().getxPos() - currentLocation.getxPos()) * (city.getCoordinate().getxPos() - currentLocation.getxPos()) +
                    (city.getCoordinate().getyPos() - currentLocation.getyPos()) * (city.getCoordinate().getyPos() - currentLocation.getyPos()));
            if (distance < minDistance){
                minDistance = distance;
                cityMin = city;
            }
        }
        return cityMin;
    }
}
