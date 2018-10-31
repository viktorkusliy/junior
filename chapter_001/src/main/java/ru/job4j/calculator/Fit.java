package ru.job4j.calculator;
/**
 * The program for calculating the ideal weight.
 */
public class Fit {
    private final double COEFFICIENT = 1.15;
    private final int MAN_INDEX = 100;
    private final int WOMAN_INDEX = 110;
    /**
     * Ideal weight for a man.
     * @param height Height.
     * @return Ideal weight.
     */
    public double manWeight(double height) {
        return (height - MAN_INDEX) * COEFFICIENT;
    }
    /**
     * Ideal weight for a woman.
     * @param height Height.
     * @return Ideal weight.
     */
    public double womanWeight(double height) {
        return (height - WOMAN_INDEX) * COEFFICIENT;
    }
}
