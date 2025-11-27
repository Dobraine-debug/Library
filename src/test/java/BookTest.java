import static org.junit.jupiter.api.Assertions.*;
import models.*;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class BookTest {

    /**
     * Adds two identical books and checks so that they correctly exists and are still equal.
     */

    //G
    @Test
    public void test2EqualBooks() {
        Book testBook1 = new Book(1, "Test book", "", "", "", 100);
        Book testBook2 = new Book(1, "Test book", "", "", "", 100);
        assertEquals(testBook1, testBook2);

    }

    /**
     * Adds two different books and checks so that they correctly exists and are still different.
     */

    //G
    @Test
    public void test2NonEqualBooks() {
        Book testBook1 = new Book(1, "Test book", "", "", "", 100);
        Book testBook2 = new Book(2, "Test book different", "", "", "", 101);
        assertNotEquals(testBook1, testBook2);

    }

}