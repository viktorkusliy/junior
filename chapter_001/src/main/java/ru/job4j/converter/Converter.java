package ru.job4j.converter;

/**
 * This is a currency converter.
 */

public class Converter {

    /**
     * Convert rubles into euros.
     * @param value rubles.
     * @return euros.
     */
    public int rubleToEuro(int value) {
        return value / 70;
    }

    /**
     * Convert rubles into dollars.
     * @param value rubles.
     * @return dollars.
     */
    public int rubleToDollar(int value) {
        return value / 60;
    }

    /**
     * Convert euros into rubles.
     * @param value euros.
     * @return rubles.
     */
    public int euroToRuble(int value) {
        return value * 70;
    }

    /**
     * Convert dollars into rubles.
     * @param value dollars.
     * @return rubles.
     */
    public int dollarToRuble(int value) {
        return value * 60;
    }


}
