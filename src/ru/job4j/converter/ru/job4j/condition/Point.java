package ru.job4j.converter.ru.job4j.condition;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        double rsl = Math.sqrt(Math.pow(x2-x1, 2)+Math.pow(y2-y1, 2));
        return rsl;
    }
    public static void main(String[] args) {
        double x1 = 0;
        double x2 = 2;
        double y1 = 0;
        double y2 = 0;
        double result = Point.distance(0, 0, 2, 0);
        System.out.println("result (0, 0) to (2, 0) " + result);
    }
}
