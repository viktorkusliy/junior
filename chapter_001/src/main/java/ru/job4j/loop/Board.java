package ru.job4j.loop;
/**
 * Construction of a chessboard.
 * @author Viktor Kusliy (mailto:viktor.kusliy@gmail.com).
 * @version 1.0.
 * @since 08.10.2018.
 */
public class Board {
    /**
     * Method for building a chessboard of a given width and height.
     * @param width Width chessboard.
     * @param height Height chessboard.
     * @return Chessboard.
     */
    public String paint(int width, int height) {
        StringBuilder screen = new StringBuilder();
        String line = System.lineSeparator();
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                if ((i + j) % 2 == 0) {
                    screen.append("x");
                } else {
                    screen.append(" ");
                }
            }
            screen.append(line);
        }
        return screen.toString();
    }
}
