package ru.сourses.geometry;

public class PointXYZ extends Point {
    int z;

    public PointXYZ(int x, int y, int z) {
        super(x, y);
        this.z = z;
    }

    @Override
    public String toString() {
        return "{" +
                + x +
                ";" + y +
                ";" + z +
                '}';
    }





}
