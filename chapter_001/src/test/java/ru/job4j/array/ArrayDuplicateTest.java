package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Testing class to remove duplicates.
 * @author Viktor Kusliy (mailto:viktor.kusliy@gmail.com).
 * @version 1.0.
 * @since 15.10.2018.
 */
public class ArrayDuplicateTest {

    @Test
    public void whenRemoveDuplicatesThenArrayWithoutDuplicate() {
        ArrayDuplicate duplicate = new ArrayDuplicate();
        String[] input = {"tiger", "pet", "dog", "pet", "pet", "cat", "tiger", "cat", "dog"};
        String[] result = duplicate.remove(input);
        String[] excepted = {"tiger", "pet", "dog", "cat"};
        assertThat(result, is(excepted));
    }

    @Test
    public void whenRemove() {
        ArrayDuplicate duplicate = new ArrayDuplicate();
        String[] input = {"tiger", "tiger", "tiger", "tiger", "tiger", "tiger", "tiger"};
        String[] result = duplicate.remove(input);
        String[] excepted = {"tiger"};
        assertThat(result, is(excepted));
    }
}
