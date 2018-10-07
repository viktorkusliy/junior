package ru.job4j.loop;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Test for calculating the factorial of a number.
 * @author Viktor Kusliy (mailto:viktor.kusliy@gmail.com).
 * @version 1.0.
 * @since 07.10.2018.
 */
public class FactorialTest {

    @Test
    public void whenIsCalculatedNullFactorial() {
        Factorial factorial = new Factorial();
        assertThat(factorial.calc(0), is(1));
    }

    @Test
    public void whenIsCalculatedNotNullFactorial() {
        Factorial factorial = new Factorial();
        assertThat(factorial.calc(5), is(120));
    }
}
