package ex3;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


class TestAuthor {

    @Test
    void testConstructor(){
        Author author=new Author("Andrei", "andrei@somewhere.com", 'm');
        assertEquals("Andrei",author.getName());
        assertEquals("andrei@somewhere.com",author.getEmail());
        assertEquals('m',author.getGender());
    }

    @Test
    void testSetEmail() {
        Author author=new Author();
        author.setEmail("andrei@somewhere.com");
        assertEquals("andrei@somewhere.com",author.getEmail());
    }



}


