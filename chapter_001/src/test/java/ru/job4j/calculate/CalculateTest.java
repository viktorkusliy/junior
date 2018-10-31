package ru.job4j.calculate;
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
/**
* Test.
* @author Viktor Kusliy (mailto:viktor.kusliy@gmail.com)
* @version 1.0
* @since 24.09.2018
*/
public class CalculateTest {
/**
* Test echo.
*/
	@Test
	public void whenTakeNameThenTreeEchoPlusName() {
		String input = "Viktor Kusliy";
		String expect = "Echo, echo, echo : Viktor Kusliy";
		Calculate calculate = new Calculate();
		String result = calculate.echo(input);
		assertThat(result, is(expect));
	}
}