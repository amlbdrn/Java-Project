package ex3;

import ex2.Author;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class TestBook {

    @Test
    void TestWithAllParameters(Author author) {
        Book book=new Book("abcdefg", author, 25.60,50);
        assertEquals("Titlu", book.getName());
        assertEquals("M.Popescu", book.getAuthor().getName());
        assertEquals("smth@smwhr.com", book.getAuthor().getEmail());
        assertEquals('m', book.getAuthor().getGender());
        assertEquals(11.50,book.getPrice(),0.01);
    }

    @Test
    void TestWith3Parameters(Author author) {
        Book book=new Book("hijklmn", author, 50.50);
        assertEquals("Poezii", book.getName());
        assertEquals("M. Eminescu", book.getAuthor().getName());
        assertEquals("emi@smwhr.com", book.getAuthor().getEmail());
        assertEquals('m', book.getAuthor().getGender());
    }
}


