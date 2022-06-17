package pl.edu.wszib.jdp.builder;

import java.sql.Date;
import java.time.LocalDate;

public class BuilderTester {
    public static void main(String[] args) {
        Book book1 = Book.builder()
                .title("Moby Dick")
                .author("Herman Malville")
                .publisher("Pan Macmillan")
                .isbn("1503280780")
                .releaseDate(Date.valueOf(LocalDate.of(2018, 11, 6)))
                .build();

        Book book2 = Book.builder()
                .title("Alice in Wonderland")
                .author("Lewis Carroll")
                .publisher("Independently published")
                .isbn("979-8749522310")
                .releaseDate(Date.valueOf(LocalDate.of(2021, 5, 6)))
                .build();

        try {
            Book book3 = Book.builder()
                    .publisher("Pan Macmillan")
                    .isbn("1503280780")
                    .releaseDate(Date.valueOf(LocalDate.of(2018, 11, 6)))
                    .build();
        } catch (IllegalStateException e) {
            System.out.println("Validation: " + e.getMessage());
        }

        Item[] items = {
                Item.builder().id(1).name("Item 1").part("Part 1").part("Part 2").build(),
                Item.builder().id(2).name("Item 2").part("Part 1").part("Part 2").build(),
                Item.builder().id(3).name("Item 3").part("Part 1").part("Part 2").part("Part 3").build()
        };
    }
}
