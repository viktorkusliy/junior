package ru.job4j.loop;
/**
 * Calculating the sum of even numbers in a given range.
 * @author Viktor Kusliy (mailto:viktor.kusliy@gmail.com).
 * @version 1.0.
 * @since 04.10.2018.
 */
public class Counter {
    /**
     * Method of calculating the sum of even numbers in a given range.
     * @param start Initial value of the range.
     * @param finish Range end value inclusive.
     * @return The sum of even numbers from start to finish.
     */
    public int add(int start, int finish) {
        int result = 0;
        for (int i = start; i <= finish; i++) {
            if (i % 2 == 0) {
                result += i;
            }
        }
        return result;
    }
}
