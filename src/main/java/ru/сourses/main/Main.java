package ru.сourses.main;

import ru.сourses.geometry.*;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        //Задача №1
        Point a = new Point(1,3);
        Point b = new Point(1,3);
        Point c = new Point(5,8);
        System.out.println(a + " " + b + " " + c);
        System.out.println(a==b);
        System.out.println(a==c);


        //Задача №2
        Line line1 = Line.CreateLineFirstPointAndSecondPoint(a,c);
        Line line2 = Line.CreateLineFirstPointXYAndSecondPointXY(10, 11, 15,19);
        Line line3 = line1;

        System.out.println(line3);
        System.out.println("длинна линии: " + line3.length());

        line1.getSecondPoint().setX(2);
        line2.getFirstPoint().setY(3);

        System.out.println(line3);
        System.out.println("длина всех линий: " + (line1.length() + line2.length() + line3.length()));

        //Задача №3
        Point point1 = new Point(1,5);
        Point point2 = new Point(2,8);
        Point point3 = new Point(5,3);
        Point point4 = new Point(8,9);



        PolyLine polyLine1 = new PolyLine(point1, point2, point3, point4);
        System.out.println(polyLine1);
        System.out.println("Длинна ломаной = " + polyLine1.length());
        ArrayList<Line> lineList = polyLine1.getLineArrayList();
        System.out.println("Длинна массива линий = " + lengthListLine(lineList));
        //polyLine1.arrayPoint.set(1, new ru.сourses.geometry.Point(12,8)).x = 12;
        System.out.println("Длины после изменения точки");
        System.out.println("Длинна ломаной = " + polyLine1.length());
        System.out.println("Длинна массива линий = " + lengthListLine(lineList));
        //Задача №2 Полиморфизм
        System.out.println("------------------Задача №2 Полиморфизм--------------------------");

        ArrayList<Point> points = new ArrayList<>();
        points.add(point1);
        points.add(point2);
        points.add(point3);
        points.add(point4);
        points.add(point1);
        PolyLine polyLine = new PolyLine(points);
        Polygon polygon = new Polygon(point1, point2, point3, point4);
        System.out.println(polyLine);
        System.out.println("длинна полигона: " + polyLine.length());
        System.out.println(polygon);
        System.out.println("длинна полигона: " + polygon.length());


    }

    public static double lengthListLine(ArrayList<Line> listLine){
        double length = 0;
        for (int i = 0; i<listLine.size(); i++){
            length += listLine.get(i).length();
        }
        return length;
    }

    public static double lenght(Length objact){
        return objact.length();
    }


}
