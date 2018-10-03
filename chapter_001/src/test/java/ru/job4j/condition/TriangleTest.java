package ru.job4j.condition;

import static org.hamcrest.number.IsCloseTo.closeTo;
import static org.junit.Assert.*;
import org.junit.Test;

public class TriangleTest {

    @Test
    public void whenAreaSetThreePointsThenTriangleArea() {
        Point a = new Point(0, 0);
        Point b = new Point(0, 2);
        Point c = new Point(2, 0);
        Triangle triangle = new Triangle(a, b, c);
        double result = triangle.areaOfTriangle();
        double expected = 2d;
        assertThat(result, closeTo(expected, 0.1));
    }
}
