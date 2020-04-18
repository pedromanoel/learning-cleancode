package codes.pedromanoel.learning.cleancode.literatePrimes;

import org.junit.jupiter.api.Test;

import java.util.*;

import static org.assertj.core.api.Assertions.assertThat;

public class TestTest {
    @Test
    void name() {
        List<Book> books = Arrays.asList(
                new Book("Effective Java", "123456789", "Josh Block"),
                new Book("Harry Potter", "987654321", "JK Rowling")
        );

        // mais se aproxima de C
        String[] strings = new String[10];
        String[] newArray = new String[20];

        List<String> l1 = new ArrayList<String>();

        List<String> l2 = new LinkedList<String>();

        assertThat(books.toString()).isEmpty();
    }

    private static class Book {
        private final String name;
        private final String isbn;
        private final String authorName;

        private Book(String name, String isbn, String authorName) {
            this.name = name;
            this.isbn = isbn;
            this.authorName = authorName;
        }

        @Override
        public String toString() {
            return "Book{" +
                    "name='" + name + '\'' +
                    ", isbn='" + isbn + '\'' +
                    ", authorName='" + authorName + '\'' +
                    '}';
        }
    }
}
