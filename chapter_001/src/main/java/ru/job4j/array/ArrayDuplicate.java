package ru.job4j.array;

import java.util.Arrays;

/**
 * Class to remove duplicates.
 * @author Viktor Kusliy (mailto:viktor.kusliy@gmail.com).
 * @version 1.0.
 * @since 15.10.2018.
 */
public class ArrayDuplicate {

    /**
     * Method for finding and removing duplicate elements in an array.
     * @param array Array of elements in which you want to remove duplicates.
     * @return Array without duplicate values.
     */
    public String[] remove(String[] array){
        int unique = array.length;
        for (int out = 0; out < unique; out++) {
            for (int in = out + 1; in < unique; in++) {
                if (array[out].equals(array[in])) {
                    array[in] = array[unique - 1];
                    unique--;
                }
            }
        }
        return Arrays.copyOf(array, unique);
    }
}
