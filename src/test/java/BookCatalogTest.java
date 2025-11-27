import static org.junit.jupiter.api.Assertions.*;
import models.*;
import org.junit.jupiter.api.Test;

public class BookCatalogTest {

	private BookCatalog bc;
	private Book book1;

	public BookCatalogTest() {
		bc = new BookCatalog();
		book1 = new Book(1,"Learning Java","","","",0);
		bc.addBook(book1);
	}

    /**
     * Testing so that a new book can be added and matches the first element in the array.
     */

    //G
	@Test
	public void testAddABook() {
        Book[] testArray = bc.getBookArray();
        assertEquals(book1, testArray[0]);

	}

    /**
     * Testing so that the test book can be found.
     */

    //G
	@Test
	public void testFindBook() throws BookNotFoundException {
        Book findTest = bc.findBook("Learning Java");
        assertEquals(book1, findTest);

	}

    /**
     *Testing so that the test book can be found even if you write the title in all lower case.
     */

    //G
	@Test
	public void testFindBookIgnoringCase() throws BookNotFoundException {
        Book findTest = bc.findBook("learning java");
        assertEquals(book1, findTest);

	}

    /**
     * Testing so that the test book can be found even with an extra space at the beginning and end of the title.
     */

    //G
	@Test
	public void testFindBookWithExtraSpaces() throws BookNotFoundException {
        Book findTest = bc.findBook(" Learning Java ");
        assertEquals(book1, findTest);

	}

    /**
     * Testing so that the program correctly throws the BookNotFoundException.
     */

    //VG
	// This test should throw BookNotFoundException in order to pass.
	@Test
	public void testFindBookThatDoesntExist() throws BookNotFoundException {
        assertThrowsExactly(BookNotFoundException.class, () -> {bc.findBook("Forgetting Java");});

	}

}
