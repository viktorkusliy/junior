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
        int costOfEuro = 70;
        int result = value / costOfEuro;
        return result;
    }

    /**
     * Convert rubles into dollars.
     * @param value rubles.
     * @return dollars.
     */
    public int rubleToDollar(int value) {
        int costOfDollar = 60;
        int result = value / costOfDollar;
        return result;
    }

    /**
     * Convert euros into rubles.
     * @param value euros.
     * @return rubles.
     */
    public int euroToRuble(int value) {
        int costOfEuro = 70;
        int result = value * costOfEuro;
        return result;
    }

    /**
     * Convert dollars into rubles.
     * @param value dollars.
     * @return rubles.
     */
    public int dollarToRuble(int value) {
        int costOfEuro = 60;
        int result = value * costOfEuro;
        return result;
    }


}
