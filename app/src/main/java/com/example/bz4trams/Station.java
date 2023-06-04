package com.example.bz4trams;

public class Station {
    private String stationName;
    private String lineNumber;

    public Station(String stationName, String lineNumber) {
        this.stationName = stationName;
        this.lineNumber = lineNumber;
    }

    public String getStationName() {
        return stationName;
    }

    public String getLineNumber() {
        return lineNumber;
    }
}
