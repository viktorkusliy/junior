package ru.job4j.array;
/**
 * Square array filled with true or false diagonals.
 * @author Viktor Kusliy (mailto:viktor.kusliy@gmail.com).
 * @version 1.0.
 * @since 15.10.2018.
 */
public class MatrixCheck {
    /**
     * Test method is a square array filled with identical values along the diagonals.
     * @param data Specified array.
     * @return True if each diagonal contains the same values otherwise false.
     */
    public boolean mono(boolean[][] data) {
        boolean result = true;
        for (int i = 0; i < data.length - 1; i++) {
            if (data[i][i] != data[i + 1][i + 1]) {
                result = false;
                break;
            }
            if (data[data.length - 1 - i][i] != data[data.length - 2 - i][i + 1]) {
                result = false;
                break;
            }
        }
        return result;
    }
}