import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BorrowerTest {

    private Borrower alan;
    private Book dusty1;
    private Book dusty2;
    private Library stuffy;

    @Before
    public void before() {
        alan = new Borrower();
        dusty1 = new Book("Shardik", "Richard Adams", "Fantasy");
        dusty2 = new Book("Watership Down", "Richard Adams", "Fantasy");
        stuffy = new Library(3);

    }

    @Test
    public void startsWithNoBooks(){
        assertEquals(0, alan.countBooks());
    }

    @Test
    public void canBorrowBook() {
        stuffy.addBookToStock(dusty1);
        stuffy.addBookToStock(dusty2);
        alan.borrowBook(stuffy, dusty1);
        assertEquals(1, alan.countBooks());
        assertEquals(1, stuffy.countStock());

    }
}
