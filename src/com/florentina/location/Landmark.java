package com.florentina.location;

import java.util.List;

public class Landmark extends Location{
    private String name;
    private int entranceFee;

    public Landmark(Coordinate coordinate, String name, int entranceFee) {
        super(coordinate, LocationType.LANDMARK);
        this.name = name;
        this.entranceFee = entranceFee;
    }

    public void setEntranceFee(int entranceFee) {
        this.entranceFee = entranceFee;
    }

    public int getEntranceFee() {
        return entranceFee;
    }

    @Override
    public String toString() {
        return "Landmark{" +
                "name='" + name + '\'' +
                ", entranceFee=" + entranceFee +
                ", coordinate=" + coordinate +
                '}';
    }
}
