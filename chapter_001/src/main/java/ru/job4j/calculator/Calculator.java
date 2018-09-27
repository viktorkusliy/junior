package ru.job4j.calculator;

/**
 * This is the simplest calculator.
 * @author Viktor Kusliy (mailto:viktor.kusliy@gmail.com).
 * @version 1.0.
 * @since 27.09.2018.
 */

public class Calculator {
    /**
     * Field for storing the result of calculations.
     */
    private double result;

    /**
     * Method of adding two numbers.
     * @param first First number.
     * @param second Second number.
     * @return Result of addition.
     */
    public void add(double first, double second) {
        this.result = first + second;
    }

    /**
     * Method of subtraction of the second of the first.
     * @param first First number.
     * @param second Second number.
     * @return Subtraction result.
     * */
    public void substraction(double first, double second) {
        this.result = first - second;
    }

    /**
     * Method of dividing the first number by the second.
     * @param first First number.
     * @param second Second number.
     * @return Result of division.
     */
    public void div(double first, double second) {
        this.result = first / second;
    }

    /**
     * The method of multiplying two numbers.
     * @param first First number.
     * @param second Second number.
     * @return Multiplication result.
     */
    public void multiple(double first, double second) {
        this.result = first * second;
    }

    /**
     * The method returns the result of the calculation.
     * @return Result of calculation.
     */
    public double getResult() {
        return this.result;
    }

}