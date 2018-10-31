package ru.job4j.loop;
/**
 * Factorial calculation.
 * @author Viktor Kusliy (mailto:viktor.kusliy@gmail.com).
 * @version 1.0.
 * @since 07.10.2018.
 */
public class Factorial {
    /**
     * Method of calculating the factorial of a given number
     * @param value Number.
     * @return Factorial.
     */
    public int calc(int value) {
        int result = 1;
        for (int i = 1; i <= value; i++) {
            result *= i;
        }
        return result;
    }
}
