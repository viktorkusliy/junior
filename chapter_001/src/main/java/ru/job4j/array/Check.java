package ru.job4j.array;

/**
 * The array is filled with true or false.
 * @author Viktor Kusliy (mailto:viktor.kusliy@gmail.com).
 * @version 1.0.
 * @since 11.10.2018.
 */
public class Check {

    /**
     * Method to determine the array is filled with true or false.
     * @param data Array.
     * @return True or false.
     */
    public boolean mono(boolean[] data) {
        for (boolean value : data) {
            if (!value) {
                return false;
            }
        }
        return true;
    }
}
