package com.florentina;

import com.florentina.location.City;
import com.florentina.location.Location;
import com.florentina.location.LocationType;

import java.util.ArrayList;
import java.util.List;

public class TripPlanner {
    private List<Location> locationList;

    public TripPlanner() {
        this.locationList = new ArrayList<>();
    }

    public void addLocation(Location location){
        locationList.add(location);
    }

    public List<City> getListOfCities(){
        List<City> cityList = new ArrayList<>();
        for (Location city : locationList){
            if(city.getLocationType() == LocationType.CITY){
                cityList.add((City) city);
            }
        }
        return cityList;
    }
}
