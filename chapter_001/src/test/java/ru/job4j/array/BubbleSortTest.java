package ru.job4j.array;
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
/**
 * Class test for sorting an array of numbers using the bubble method.
 * @author Viktor Kusliy (mailto:viktor.kusliy@gmail.com).
 * @version 1.0.
 * @since 12.10.2018.
 */
public class BubbleSortTest {
    @Test
    public void whenSortArrayWithTenElementsThenSortedArray() {
        BubbleSort bubbleSort = new BubbleSort();
        int[] data = new int[]{5, 4, 6, 85, 7, 15, 1, 3, 10, 8};
        int[] result = bubbleSort.sort(data);
        int[] excepted = new int[]{1, 3, 4, 5, 6, 7, 8, 10, 15, 85};
        assertThat(result, is(excepted));
    }
}
