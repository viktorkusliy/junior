package ru.job4j.calculator;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class CalculatorTest {
    @Test
    public void whenAddOnePlusOneThenTwo() {
        Calculator calculator = new Calculator();
        calculator.add(1d, 1d);
        double result = calculator.getResult();
        double expected = 2d;
        assertThat(result, is(expected));

    }

    @Test
    public void whenSubstractOneMinusOneThenNull() {
        Calculator calculator = new Calculator();
        calculator.substraction(1d, 1d);
        double result = calculator.getResult();
        double expected = 0d;
        assertThat(result, is(expected));

    }

    @Test
    public void whenDivOneDivideOneThenOne() {
        Calculator calculator = new Calculator();
        calculator.div(1d, 1d);
        double result = calculator.getResult();
        double expected = 1d;
        assertThat(result, is(expected));

    }

    @Test
    public void whenMultipleOneMultiplyOneThenOne() {
        Calculator calculator = new Calculator();
        calculator.multiple(1d, 1d);
        double result = calculator.getResult();
        double expected = 1d;
        assertThat(result, is(expected));

    }
}
