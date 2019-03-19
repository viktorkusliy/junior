package ru.job4j.tracker;

import java.time.LocalTime;
import java.util.Arrays;

public class Tracker {

    private final Item[] items = new Item[100];

    private int position;

    public Item add(Item item) {
        item.setId(this.generateId());
        this.items[this.position++] = item;
        return item;
    }

    private String generateId() {
        return new StringBuilder().append(LocalTime.now()).append(Math.random() * 1000).toString();
    }

    public boolean replace(String id, Item item) {
        boolean result = false;
            item.setId(id);
            for (int i = 0; i < this.position; i++) {
                if (this.items[i] != null && this.items[i].getId().equals(id)) {
                    this.items[i] = item;
                    result = true;
                    break;
                }
            }
            return result;
        }

        public Item findById(String id) {
            Item result = null;
            for (int i = 0; i < this.items.length; i++) {
                if (this.items[i].getId().equals(id)) {
                    result = this.items[i];
                    break;
                }
            }
            return result;
        }

        public boolean delete(String id) {
            boolean result = false;
            for (int i = 0; i < this.items.length; i++) {
                if (this.items[i] != null && this.items[i].getId().equals(id)) {
                    System.arraycopy(this.items, i + 1, this.items, i, this.items.length - i - 1);
                    this.items[this.items.length - 1] = null;
                    result = true;
                    position--;
                    break;
                }
            }
            return result;
        }

        public Item[] findAll() {
            return Arrays.copyOf(this.items, this.position);
        }

        public Item[] findByName(String key) {
            Item[] found = new Item[this.position];
            int counter = 0;
            for (int i = 0; i < this.items.length; i++) {
                if (this.items[i] != null && this.items[i].getName().equals(key)) {
                    found[counter++] = this.items[i];
                }
            }
            return Arrays.copyOf(found, counter);
        }
}
