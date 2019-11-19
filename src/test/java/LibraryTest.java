import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    private Library stuffy;
    private Book dusty;

    @Before
    public void before() {
        stuffy = new Library(3);
        dusty = new Book("Shardik", "Richard Adams", "Fantasy");
    }

    @Test
    public void canGetCapacity() {
        assertEquals(3, stuffy.getCapacity());
    }

    @Test
    public void canCountStock() {
        assertEquals(0, stuffy.countStock());
    }

    @Test
    public void canAddBookToStock() {
        stuffy.addBookToStock(dusty);
        assertEquals(1, stuffy.countStock());

    }

    @Test
    public void canTellWhenStockIsAtCapacity() {
        stuffy.addBookToStock(dusty);
        stuffy.addBookToStock(dusty);
        stuffy.addBookToStock(dusty);
        assertEquals(true, stuffy.checkIfStockAtCapacity());
    }

    @Test
    public void canTellWhenStockIsNotAtCapacity() {
        stuffy.addBookToStock(dusty);
        stuffy.addBookToStock(dusty);
        assertEquals(false, stuffy.checkIfStockAtCapacity());
    }
}
