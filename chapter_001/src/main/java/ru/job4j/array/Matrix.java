package ru.job4j.array;
/**
 * Class to build multiplication tables using a two-dimensional array.
 * @author Viktor Kusliy (mailto:viktor.kusliy@gmail.com).
 * @version 1.0.
 * @since 13.10.2018.
 */
public class Matrix {
    /**
     * The method fills a two-dimensional array with the results of multiplying rows and columns.
     * @param size Size of two-dimensional array.
     * @return Multiplication table.
     */
    public int[][] multiple(int size) {
        int[][] table = new int[size][size];
        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table.length; j++) {
                table[i][j] = (i + 1) * (j + 1);
            }
        }
        return table;
    }
}
