package ex2;

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


}