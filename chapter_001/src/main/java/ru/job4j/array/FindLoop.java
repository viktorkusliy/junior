package ru.job4j.array;

/**
 * Class to search for an element of an array by index.
 * @author Viktor Kusliy (mailto:viktor.kusliy@gmail.com).
 * @version 1.0.
 * @since 10.10.2018.
 */
public class FindLoop {

    /**
     * Method to search for an element of an array by index.
     * @param data Array in which to search for an element.
     * @param element Array element index.
     * @return Index of the found array element.
     */
    public int indexOf(int[] data, int element) {
        int result = -1;
        for (int index = 0; index < data.length; index++) {
            if (data[index] == element) {
                result = index;
                break;
            }
        }
        return result;
    }
}
