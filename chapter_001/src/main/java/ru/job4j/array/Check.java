package ru.job4j.array;
/**
 * The array is filled with true or false.
 * @author Viktor Kusliy (mailto:viktor.kusliy@gmail.com).
 * @version 3.0.
 * @since 12.10.2018.
 */
public class Check {
    /**
     * Method to determine the array is filled with true or false.
     *
     * @param data Array.
     * @return True or false.
     */
    public boolean mono(boolean[] data) {
        boolean result = true;
        for (int index = 0; index < data.length - 1; index++) {
            if (data[index] != data[index + 1]) {
                result = false;
                break;
            }
        }
        return result;
    }
}