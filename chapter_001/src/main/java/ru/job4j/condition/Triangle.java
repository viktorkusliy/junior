package ru.job4j.condition;

/**
 * Class to calculate the area of a triangle.
 * @author Viktor Kusliy (mailto:viktor.kusliy@gmail.com).
 * @version 1.0.
 * @since 03.10.2018.
 */
public class Triangle {
    private Point a;
    private Point b;
    private Point c;

    public Triangle(Point a, Point b, Point c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    /**
     * Method of calculating the distance between the current point and the given.
     * @param ab Distance between points a and b.
     * @param ac Distance between points a and c.
     * @param bc Distance between points b and c.
     * @return Semiperimeter.
     */
    public double semiperimeter(double ab, double ac, double bc) {
        return (ab + ac + bc) / 2;

    }

    /**
     * Method for calculating the area of a triangle.
     * @return Area of a triangle.
     */
    public double areaOfTriangle() {
        double area = -1;
        double ab = this.a.distanceTo(this.b);
        double ac = this.a.distanceTo(this.c);
        double bc = this.b.distanceTo(this.c);
        double p = this.semiperimeter(ab, ac, bc);
        if (this.exist(ab, ac, bc)) {
            area = Math.sqrt(p * (p - ab) * (p - ac) * (p - bc));
        }
        return area;
    }

    /**
     * Method for calculating the possibility of constructing a triangle on given sides.
     * @param ab Side length ab.
     * @param ac Side length ac.
     * @param bc Side length bc.
     * @return There is a possibility or not.
     */
    private boolean exist(double ab, double ac, double bc) {
        return (ab + ac > bc) & (ab + bc > ac) & (ac + bc > ab) ? true : false;
    }





}
