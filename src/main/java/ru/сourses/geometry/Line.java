package ru.сourses.geometry;

public class Line implements Length {
    Point firstPoint, secondPoint;


    private Line(Point firstPoint, Point endPoint) {
        this.firstPoint = firstPoint;
        this.secondPoint = endPoint;
    }

    public static Line CreateLineFirstPointAndSecondPoint(Point firstPoint, Point secondPoint){
        return new Line(firstPoint, secondPoint);
    }
    public static Line CreateLineFirstPointXYAndSecondPointXY(int firstPointX, int firstPointY,int secondPointX, int secondPointY){
        return new Line(new Point(firstPointX,firstPointY), new Point(secondPointX, secondPointY));
    }

    @Override
    public String toString() {
        return "Линия от " +
                 firstPoint +
                " до " + secondPoint;
    }

    public Point getFirstPoint() {
        return firstPoint;
    }

    public void setFirstPoint(Point firstPoint) {
        this.firstPoint = firstPoint;
    }

    public Point getSecondPoint() {
        return secondPoint;
    }

    public void setSecondPoint(Point secondPoint) {
        this.secondPoint = secondPoint;
    }

    public double length(){
        int cat1 = firstPoint.x-secondPoint.x;
        int cat2 = firstPoint.y-secondPoint.y;
        if(cat1<0) cat1 = - cat1;
        if(cat2<0) cat2 = - cat2;
        return Math.sqrt((cat1*cat1)+(cat2*cat2));
    }
}
