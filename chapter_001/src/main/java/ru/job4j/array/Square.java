package ru.job4j.array;

/**
 * Class to fill the array with squares of numbers.
 * @author Viktor Kusliy (mailto:viktor.kusliy@gmail.com).
 * @version 1.0.
 * @since 10.10.2018.
 */
public class Square {

    /**
     * Method to fill the array with squares of numbers.
     * @param bound Array capacity.
     * @return Filled array.
     */
    public int[] calculate(int bound) {
        int[] numberArray = new int[bound];
        for (int i = 1; i <= bound; i++) {
        numberArray[i - 1] = (int) Math.pow(i, 2);
        }
        return numberArray;
    }
}
