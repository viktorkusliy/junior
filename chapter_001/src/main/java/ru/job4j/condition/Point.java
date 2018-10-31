package ru.job4j.condition;
/**
 * Class for calculating the distance between two points.
 * @author Viktor Kusliy (mailto:viktor.kusliy@gmail.com).
 * @version 1.0.
 * @since 28.09.2018.
 */
public class Point {
    /**
     * Field for x coordinate.
     */
    private int x;
    /**
     * Field for y coordinate
     */
    private int y;
    /**
     * Constructor.
     * @param x This x coordinate.
     * @param y This y coordinate.
     */
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
    /**
     * Method of calculating the distance between the current point and the given.
     * @param that Second point.
     * @return Distance between two points.
     */
    public double distanceTo(Point that) {
        return Math.sqrt(
                Math.pow(this.x - that.x, 2) + Math.pow(this.y - that.y, 2)
        );
    }
    /**
     * Main method.
     * @param args args.
     */
    public static void main(String[] args) {
        Point one = new Point(1, 1);
        Point two = new Point(2, 2);
        System.out.println("x1 = " + one.x);
        System.out.println("y1 = " + one.y);
        System.out.println("x2 = " + two.x);
        System.out.println("y2 = " + two.y);
        double result = one.distanceTo(two);
        System.out.println("Расстояние между точками one и two : " + result);
    }
}
