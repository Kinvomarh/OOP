package ru.courses.geometry;

import java.util.ArrayList;

public class Polygon extends PolyLine {

    public Polygon() {
    }

    public Polygon(Point point1, Point point2, Point point3, Point point4) {
        super(point1, point2, point3, point4);
    }

    public Polygon(ArrayList<Point> points) {
        super(points);
    }

    @Override
    public double length() {
        double length = super.length();
        length += Line.CreateLineFirstPointAndSecondPoint(arrayPoint.get(0), arrayPoint.get(arrayPoint.size()-1)).length();
        return length;
    }
}
