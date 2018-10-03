package ru.job4j.max;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * The test class finding the maximum number of three numbers.
 * @author Viktor Kusliy (mailto:viktor.kusliy@gmail.com).
 * @version 2.0.
 * @since 03.10.2018.
 */
public class MaxTest {

    @Test
    public void whenFirstLessSecond() {
        Max maximum = new Max();
        int result = maximum.max(1, 2);
        assertThat(result, is(2));
    }

    @Test
    public void whenSecondLessFirst() {
        Max maximum = new Max();
        int result = maximum.max(2, 1);
        assertThat(result, is(2));
    }

    @Test
    public void whenFirstIsMoreThanSecondAndThird() {
        Max maximum = new Max();
        int result = maximum.max(3, 2, 1);
        assertThat(result, is(3));
    }

    @Test
    public void whenSecondIsMoreThanFirstAndThird() {
        Max maximum = new Max();
        int result = maximum.max(1, 3, 2);
        assertThat(result, is(3));
    }

    @Test
    public void whenThirdIsMoreThanFirstAndSecond() {
        Max maximum = new Max();
        int result = maximum.max(1, 2, 3);
        assertThat(result, is(3));
    }



}


