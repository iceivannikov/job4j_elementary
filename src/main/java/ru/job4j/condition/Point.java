package ru.job4j.condition;

public class Point {
    private final int x;

    private final int y;

    private int z;

    public Point(int first, int second) {
        this.x = first;
        this.y = second;
    }

    public Point(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double distance(Point that) {
        return Math.sqrt(Math.pow(this.x - that.x, 2) + Math.pow(this.y - that.y, 2));
    }

    public double distance3d(Point that) {
        double xyDistance = distance(that);
        return Math.sqrt(Math.pow(xyDistance, 2) + Math.pow(this.z - that.z, 2));
    }

    public void info() {
        System.out.println("Point[" + this.x + ", " + this.y + "]");
    }

    public static void main(String[] args) {
        Point point1 = new Point(3, -6);
        Point point2 = new Point(7, -7);
        Point point3 = new Point(-7, 7);
        double distance = point1.distance(point2);
        double distance3D = point1.distance3d(point3);
        System.out.println(distance);
        System.out.println(distance3D);
    }
}
