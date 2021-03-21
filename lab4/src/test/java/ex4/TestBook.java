package ex4;

import ex2.Author;
import ex4.Book;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestBook {
    Author a1=new Author("M. Andreescu", "m.andr@lalala.com", 'm');
    Author a2=new Author("A. Popescu", "popescu_a@lalala.com", 'm');
    Author a3=new Author("L. Stoica", "laura_stoica@lalala.com", 'f');
    Author a4=new Author("S. Ionescu", "s.ionescu@lalala.com", 'm');

    Author[] authors1={a1,a2};
    Author[] authors2={a3,a4};

    Book b1, b2;

    @Test
    void testConstructor1() {
        b1=new Book("Culegere", authors1,15.99);
        assertEquals("Culegere", b1.getName());
        assertEquals(authors1, b1.getAuthors());
        assertEquals(15.99, b1.getPrice());
        b1.printAuthors();
    }

    @Test
    void testConstructor2() {
       b2=new Book("Probleme", authors2, 25.20,24 );
       assertEquals("Probleme", b2.getName());
       assertEquals(authors2, b2.getAuthors());
       assertEquals(25.20, b2.getPrice(),0.01);
       assertEquals(24, b2.getQtyInStock());
    }

}
