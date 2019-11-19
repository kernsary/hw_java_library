import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    private Library stuffy;
    private Book dusty1;
    private Book dusty2;
    private Book dusty3;

    @Before
    public void before() {
        stuffy = new Library(3);
        dusty1 = new Book("Shardik", "Richard Adams", "Fantasy");
        dusty2 = new Book("Watership Down", "Richard Adams", "Fantasy");
        dusty3 = new Book("Shardik Returns", "Richard Adams", "Romance");
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
        stuffy.addBookToStock(dusty1);
        assertEquals(1, stuffy.countStock());

    }

    @Test
    public void canTellWhenStockIsAtCapacity() {
        stuffy.addBookToStock(dusty1);
        stuffy.addBookToStock(dusty2);
        stuffy.addBookToStock(dusty3);
        assertEquals(true, stuffy.checkIfStockAtCapacity());
    }

    @Test
    public void canTellWhenStockIsNotAtCapacity() {
        stuffy.addBookToStock(dusty1);
        stuffy.addBookToStock(dusty2);
        assertEquals(false, stuffy.checkIfStockAtCapacity());
    }

    @Test
    public void canRemoveBookFromStock() {
        stuffy.addBookToStock(dusty1);
        stuffy.addBookToStock(dusty2);
        stuffy.removeBookFromStock(dusty1);
        assertEquals(1, stuffy.countStock());
    }

    @Test
    public void canGetGenreCount() {
        stuffy.addBookToStock(dusty1);
        stuffy.addBookToStock(dusty2);
        stuffy.addBookToStock(dusty3);
        assertEquals(2, stuffy.getGenreCount("Fantasy"));
        assertEquals(1, stuffy.getGenreCount("Romance"));
    }
}
