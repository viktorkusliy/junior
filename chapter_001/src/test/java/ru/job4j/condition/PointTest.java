package ru.job4j.condition;
import org.junit.Test;
import static org.hamcrest.number.IsCloseTo.closeTo;
import static org.junit.Assert.assertThat;
public class PointTest {
    @Test
    public void calculationOfTheDistanceBetweenTwoPoints() {
        Point one = new Point(1, 1);
        Point two = new Point(2, 2);
        assertThat(one.distanceTo(two), closeTo(1.41, 0.1));
    }
}
