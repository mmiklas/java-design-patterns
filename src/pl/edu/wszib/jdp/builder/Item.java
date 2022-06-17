package pl.edu.wszib.jdp.builder;

import java.util.ArrayList;
import java.util.List;

public class Item {
    private long id;
    private String name;
    private List<String> parts;

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {
        private long id;
        private String name;
        private List<String> parts;

        Builder id(long id) {
            this.id = id;
            return this;
        }

        Builder name(String name) {
            this.name = name;
            return this;
        }

        Builder parts(List<String> parts) {
            this.parts = parts;
            return this;
        }

        Builder part(String part) {
            if (this.parts == null) {
                this.parts = new ArrayList<>();
            }
            this.parts.add(part);
            return this;
        }

        Item build() {
            Item item = new Item();
            item.id = this.id;
            item.name = this.name;
            item.parts = this.parts;
            return item;
        }
    }
}
