package ru.job4j.tracker;

public class Item {

        private String name;
        private String desc;
        private String id;
        private long created;
        private String[] comments;

        public Item(String id, String name, String desc, long created, String[] comments) {
            this.id = id;
            this.name = name;
            this.desc = desc;
            this.created = System.currentTimeMillis();
            this.comments = comments;
        }
        public Item(String name, String desc, long created) {
            this.name = name;
            this.desc = desc;
            this.created = System.currentTimeMillis();
        }

        public Item(String name, String desc) {
            this.name = name;
            this.desc = desc;
        }

        public String getId() {
            return id;
        }
        public void setId(String id) {
            this.id = id;
        }
        public String getName() {
            return name;
        }
        public void setName(String name) {
            this.name = name;
        }
        public String getDesc() {
            return desc;
        }
        public void setDesc(String desc) {
            this.desc = desc;
        }
        public long getCreated() {
            return created;
        }
        public void setCreated(long created) {
            this.created = created;
        }
        public String[] getComments() {
            return comments;
        }
        public void setComments(String[] comments) {
            this.comments = comments;
        }

        @Override
        public String toString() {
            return "Item{" +
                    "name='" + name + '\'' +
                    ", desc='" + desc + '\'' +
                    ", id='" + id + '\'' +
                    '}';
        }
}
