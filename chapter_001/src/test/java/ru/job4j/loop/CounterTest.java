package ru.job4j.loop;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;


/**
 * The test class calculating the sum of even numbers in a given range.
 * @author Viktor Kusliy (mailto:viktor.kusliy@gmail.com).
 * @version 1.0.
 * @since 04.10.2018.
 */
public class CounterTest {

    @Test
    public void whatIsSumOfEvenNumbersFromNullToTen() {
        Counter counter = new Counter();
        int result = counter.add(0, 10);
        assertThat(result, is(30));
    }

}
