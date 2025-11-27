import static org.junit.jupiter.api.Assertions.*;
import models.*;
import java.time.LocalDate;

import org.junit.jupiter.api.Test;
import utilities.GenderType;

import java.time.LocalDate;

public class LoanTest {

    /**
     * Adds a new loan and checks so that the loan date is correctly added.
     */

    //VG
	@Test
	public void testDueDate() {
        Customer testGuy = new Customer("Mr", "Test", "Testsson", "Test street 1", "123-456789", "test@test.com", 1, GenderType.MALE);
        Book testBook = new Book(1, "Test book", "", "", "", 100);
        Loan testLoan = new Loan(1, testGuy, testBook);
        assertEquals(testLoan.getDueDate(),LocalDate.now().plusDays(14));

   }
}