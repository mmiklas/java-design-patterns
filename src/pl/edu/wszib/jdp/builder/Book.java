package pl.edu.wszib.jdp.builder;

import java.util.Date;

public class Book {
    private String title;
    private String publisher;
    private String isbn;
    private Date releaseDate;

    public Builder builder() {
        return new Builder();
    }

    public static class Builder {
        Builder title(String title) {
            this.title = title;
            return this;
        }

    }


}
