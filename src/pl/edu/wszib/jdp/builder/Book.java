package pl.edu.wszib.jdp.builder;

import java.util.Date;

public class Book {
    private String title;
    private String author;
    private String publisher;
    private String isbn;
    private Date releaseDate;

    public static Builder builder() {
        return new Builder();
    }

    public static final class Builder {
        private String title;
        private String author;
        private String publisher;
        private String isbn;
        private Date releaseDate;

        Builder title(String title) {
            this.title = title;
            return this;
        }

        Builder author(String author) {
            this.author = author;
            return this;
        }

        Builder publisher(String publisher) {
            this.publisher = publisher;
            return this;
        }

        Builder isbn(String isbn) {
            this.isbn = isbn;
            return this;
        }

        Builder releaseDate(Date releaseDate) {
            this.releaseDate = releaseDate;
            return this;
        }

        Book build() {
            Book book = new Book();
            if (this.title == null || this.title.isEmpty()) {
                throw new IllegalStateException("Title can not be empty");
            }
            book.title = this.title;
            book.author = this.author;
            book.publisher = this.publisher;
            book.isbn = this.isbn;
            book.releaseDate = this.releaseDate;
            return book;
        }
    }
}
