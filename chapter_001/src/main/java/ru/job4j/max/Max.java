package ru.job4j.max;

/**
 * Finding the maximum of two numbers.
 * @author Viktor Kusliy (mailto:viktor.kusliy@gmail.com).
 * @version 2.0.
 * @since 03.10.2018.
 */
public class Max {

    /**
     * Method to find the maximum of two numbers.
     * @param first First number.
     * @param second Second number.
     * @return Maximum two numbers.
     */
    public int max(int first, int second) {
        return first > second ? first : second;
    }

    /**
     * Method to find the maximum of three numbers.
     * @param first First number.
     * @param second Second number.
     * @param third Third number.
     * @return Maximum three numbers.
     */
    public int max(int first, int second, int third) {
        int temp = this.max(first, second);
        temp = this.max(temp, third);
        return temp;
    }


}
