package com.example.bz4trams;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Line {
    private int lineNumber;
    private String name;
    private List<String> stationList;
    private List<String> intersectingLines;

    public Line(int lineNumber, String name, List<String> stationList, List<String> intersectingLines) {
        this.lineNumber = lineNumber;
        this.name = name;
        this.stationList = new ArrayList<>(stationList); // Создаем копию списка станций
        this.intersectingLines = new ArrayList<>(intersectingLines); // Создаем копию списка пересекающихся линий
    }

    public int getLineNumber() {
        return lineNumber;
    }

    public String getName() {
        return name;
    }

    public List<String> getStationList() {
        return Collections.unmodifiableList(stationList);
    }

    public List<String> getIntersectingLines() {
        return Collections.unmodifiableList(intersectingLines);
    }
}
