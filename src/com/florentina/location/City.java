package com.florentina.location;

import java.util.ArrayList;
import java.util.List;

public class City extends Location{
    private String name;
    private List<Landmark> landmarkList;

    public City(Coordinate coordinate, String name) {
        super(coordinate, LocationType.CITY);
        this.name = name;
        this.landmarkList = new ArrayList<>();
    }

    public void addLandmark(Landmark landmark){
        landmarkList.add(landmark);
    }

    public List<Landmark> getAllLandmarksInA50KmArea(){
        int distance;
        Coordinate currentLocation = this.getCoordinate();
        List<Landmark> allNearestLandmarks = new ArrayList<>();
        for (Landmark landmark : landmarkList){
            distance = (int) Math.sqrt((landmark.getCoordinate().getxPos() - currentLocation.getxPos()) * (landmark.getCoordinate().getxPos() - currentLocation.getxPos()) +
                    (landmark.getCoordinate().getyPos() - currentLocation.getyPos()) * (landmark.getCoordinate().getyPos() - currentLocation.getyPos()));
            if(distance <= 50){
                allNearestLandmarks.add(landmark);
            }
        }
        return allNearestLandmarks;

    }

    @Override
    public String toString() {
        return "City{" +
                "name='" + name + '\'' +
                ", coordinate=" + coordinate +
                '}';
    }
}
