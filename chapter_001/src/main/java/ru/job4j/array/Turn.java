package ru.job4j.array;

/**
 * Array reversal class.
 * @author Viktor Kusliy (mailto:viktor.kusliy@gmail.com).
 * @version 1.0.
 * @since 10.10.2018.
 */
public class Turn {

    /**
     * Method of inverting an array with an even and odd number of elements.
     * @param array The array that you want to flip.
     * @return Inverted array.
     */
    public int[] back(int[] array) {
        if (array.length % 2 == 0) {
            for (int index = 0; index < array.length / 2; index++) {
                int temp = array[index];
                array[index] = array[array.length - index - 1];
                array[array.length - index - 1] = temp;
            }
        } else {
            for (int index = 0; index < array.length / 2 + 1; index++) {
                int temp = array[index];
                array[index] = array[array.length - index - 1];
                array[array.length - index - 1] = temp;
            }
        }
        return array;
    }
}
