package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Testing a class to search for an element of an array by its index.
 * @author Viktor Kusliy (mailto:viktor.kusliy@gmail.com).
 * @version 1.0.
 * @since 10.10.2018.
 */
public class FindLoopTest {

    /**
     * Array element found.
     */
    @Test
    public void whenInTheArrayElement5IsAt0Index() {
        FindLoop findLoop = new FindLoop();
        int[] input = new int[]{5, 10, 3};
        int value = 5;
        int result = findLoop.indexOf(input, value);
        int expected = 0;
        assertThat(result, is(expected));
    }

    /**
     * Array element not found.
     */
    @Test
    public void whenInTheArrayElement5IsNotAt0Index() {
        FindLoop findLoop = new FindLoop();
        int[] input = new int[]{5, 10, 3};
        int value = 2;
        int result = findLoop.indexOf(input, value);
        int expected = -1;
        assertThat(result, is(expected));
    }
}
