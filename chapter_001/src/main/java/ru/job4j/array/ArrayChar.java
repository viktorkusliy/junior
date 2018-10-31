package ru.job4j.array;
/**
 * Class to check if the word starts with a prefix or not.
 * @author Viktor Kusliy (mailto:viktor.kusliy@gmail.com).
 * @version 1.0.
 * @since 12.10.2018.
 */
public class ArrayChar {
    private char[] data;
    public ArrayChar(String line) {
        this.data = line.toCharArray();
    }
    /**
     * Verification method that the word begins with the prefix.
     * @param prefix Prefix.
     * @return True if the word begins with the prefix otherwise false.
     */
    public boolean startWith(String prefix) {
        boolean result = true;
        char[] value = prefix.toCharArray();
        for (int index = 0; index < value.length; index++) {
            if (this.data[index] != value[index]) {
                result = false;
                break;
            }
        }
        return result;
    }
}
