package com.florentina;

import com.florentina.location.City;
import com.florentina.location.Coordinate;
import com.florentina.location.Landmark;
import com.florentina.location.UserLocation;

import java.util.List;

public class Main {

    public static void main(String[] args) {
	TripPlanner tripPlanner = new TripPlanner();

        Landmark landmark = new Landmark(new Coordinate(56, 89), "Borna", 56);
        Landmark landmark1 = new Landmark(new Coordinate(456, 231), "LUana", 56);
        Landmark landmark2 = new Landmark(new Coordinate(123, 89), "Cala", 56);
        Landmark landmark3 = new Landmark(new Coordinate(567, 22), "Mala", 56);
        Landmark landmark4 = new Landmark(new Coordinate(23, 46), "Sala", 56);

        City city = new City(new Coordinate(34, 56), "Bucuresti");
        City city1 = new City(new Coordinate(314, 256), "Cluj");
        City city2 = new City(new Coordinate(342, 562), "Brasov");
        City city3 = new City(new Coordinate(77, 56), "Oradea");
        City city4 = new City(new Coordinate(78, 90), "Timisoara");

        UserLocation flori = new UserLocation(new Coordinate(67, 89));

        flori.setCurrentLocation(new Coordinate(54, 89));
        flori.setCurrentLocation(new Coordinate(87, 90));

        System.out.println(flori.showLocationHistory());
        tripPlanner.addLocation(landmark);
        tripPlanner.addLocation(landmark1);
        tripPlanner.addLocation(landmark2);
        tripPlanner.addLocation(landmark3);
        tripPlanner.addLocation(landmark4);
        tripPlanner.addLocation(city);
        tripPlanner.addLocation(city1);
        tripPlanner.addLocation(city2);
        tripPlanner.addLocation(city3);
        tripPlanner.addLocation(city4);

        List<City> cityList = tripPlanner.getListOfCities();

        System.out.println(landmark.returnClosestCity(cityList));
        city.addLandmark(landmark);
        city.addLandmark(landmark1);
        city.addLandmark(landmark2);
        city.addLandmark(landmark3);
        city.addLandmark(landmark4);

        System.out.println(city.getAllLandmarksInA50KmArea());





    }
}
