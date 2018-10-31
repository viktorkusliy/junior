package ru.job4j.condition;
/**
 * Not quite smart bot.
 * @author Viktor Kusliy (mailto:viktor.kusliy@gmail.com).
 * @version 1.0.
 * @since 01.10.2018.
 */
public class DummyBot {
    /**
     * A method for bot answering questions.
     * @param question Question from the client.
     * @return Reply from bot.
     */
    public String answer(String question) {
        String answer = "Это ставит меня в тупик. Спросите другой вопрос.";
        if (question.equals("Привет, Бот.")) {
            answer = "Привет, умник.";
        } else if (question.equals("Пока.")) {
            answer = "До скорой встречи.";
        }
        return answer;
    }
}
