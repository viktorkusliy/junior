package ru.job4j.condition;
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
/**
 * Testing is not very smart bot.
 * @author Viktor Kusliy (mailto:viktor.kusliy@gmail.com).
 * @version 1.0.
 * @since 01.10.2018.
 */
public class DummyBotTest {
    @Test
    public void whenGreetBot() {
        DummyBot dummyBot = new DummyBot();
        assertThat(dummyBot.answer("Привет, Бот."), is("Привет, умник."));
    }
    @Test
    public void whenByeBot() {
        DummyBot dummyBot = new DummyBot();
        assertThat(dummyBot.answer("Пока."), is("До скорой встречи."));
    }
    @Test
    public void whenUnknownBot() {
        DummyBot dummyBot = new DummyBot();
        assertThat(dummyBot.answer("Сколько будет 2 + 2 ?"), is("Это ставит меня в тупик. Спросите другой вопрос."));
    }
}
