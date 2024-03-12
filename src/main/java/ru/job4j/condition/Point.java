package ru.job4j.condition;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    public static void main(String[] args) {
        double distance1 = distance(0, 0, 2, 0);
        System.out.println("result (0, 0) to (2, 0) " + distance1);

        double distance2 = distance(3, 5, 10, 5);
        System.out.println("result (3, 5) to (10, 5) " + distance2);
    }
}
