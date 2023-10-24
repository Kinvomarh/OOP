package ru.сourses.mathematics;

public class Degree {
    public static double DegreeOfNumber (String number, String degree){
        return  Math.pow(Integer.parseInt(number), Integer.parseInt(degree));
    }
}
