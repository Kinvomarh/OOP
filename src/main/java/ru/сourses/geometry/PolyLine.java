package ru.сourses.geometry;

import ru.сourses.geometry.Length;
import ru.сourses.geometry.Line;

import java.util.ArrayList;

public class PolyLine implements Length {
    ArrayList <Point> arrayPoint = new ArrayList<>();

    public PolyLine() {
    }

    public PolyLine(Point point1, Point point2, Point point3, Point point4) {
        arrayPoint.add(point1);
        arrayPoint.add(point2);
        arrayPoint.add(point3);
        arrayPoint.add(point4);
    }

    public PolyLine(ArrayList<Point> points){
        arrayPoint = points;
    }

    public ArrayList<Line> getLineArrayList(){
        ArrayList <Line> lineArrayList = new ArrayList<>();
        Line line;
        for (int i = 0; i<arrayPoint.size(); i++){
            if (i < arrayPoint.size() - 1) {
                line = Line.CreateLineFirstPointAndSecondPoint(arrayPoint.get(i), arrayPoint.get(i + 1));
                lineArrayList.add(line);
            }
        }
        return lineArrayList;
    }

    public double length(){
        double length = 0;
        Line line;
        for (int i = 0; i<arrayPoint.size(); i++) {
            if (i < arrayPoint.size() - 1) {
                line = Line.CreateLineFirstPointAndSecondPoint(arrayPoint.get(i), arrayPoint.get(i + 1));
                length += line.length();
            }
        }
        return length;
    }

    @Override
    public String toString() {
        return "Линия " + arrayPoint;
    }
}
