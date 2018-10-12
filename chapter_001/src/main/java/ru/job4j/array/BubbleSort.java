package ru.job4j.array;

/**
 * Class to sort an array of numbers.
 * @author Viktor Kusliy (mailto:viktor.kusliy@gmail.com).
 * @version 1.0.
 * @since 12.10.2018.
 */
public class BubbleSort {

    /**
     * Method for sorting an array of numbers using the bubble method.
     * @param data Array of numbers.
     * @return Sorted array.
     */
    public int[] sort(int[] data) {
        for (int i = data.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if  (data[j] > data[j + 1]) {
                    int temp = data[j];
                    data[j] = data[j + 1];
                    data[j + 1] = temp;
                }
            }
        }
        return data;
    }
}
