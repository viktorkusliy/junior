package ru.job4j.loop;

import java.util.function.BiPredicate;

/**
 * Building a pyramid.
 * @author Viktor Kusliy (mailto:viktor.kusliy@gmail.com).
 * @version 2.0.
 * @since 10.10.2018.
 */
public class Paint {

    /**
     * Building the right side of the pyramid.
     * @param height Pyramid height.
     * @return Pyramid.
     */
    public String rightTriangle(int height) {
        return this.loopBy(
                height,
                height,
                (row, column) -> row >= column
        );
    }

    /**
     * Building the left side of the pyramid.
     * @param height Pyramid height.
     * @return Pyramid.
     */
    public String leftTriangle(int height) {
        return this.loopBy(
                height,
                height,
                (row, column) -> row >= height - column - 1
        );
    }

    /**
     * Building the whole pyramid.
     * @param height Pyramid height.
     * @return Pyramid.
     */
    public String pyramid(int height) {
        return this.loopBy(
                height,
                2 * height -1,
                (row, column) -> row >= height - column - 1 && row + height -1 >= column
        );
    }

    private String loopBy(int height, int weight, BiPredicate<Integer, Integer> predicate) {
        StringBuilder screen = new StringBuilder();
        for (int row = 0; row != height; row++) {
            for (int column = 0; column != weight; column++) {
                if (predicate.test(row, column)) {
                    screen.append("^");
                } else {
                    screen.append(" ");
                }
            }
            screen.append(System.lineSeparator());
        }
        return screen.toString();
    }
}
