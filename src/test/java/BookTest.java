import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookTest {

    private Book dusty;

    @Before
    public void before() {
        dusty = new Book("Shardik", "Richard Adams", "Fantasy");
    }

    @Test
    public void canGetTitle() {
        assertEquals("Shardik", dusty.getTitle());

    }

    @Test
    public void canGetAuthor() {
        assertEquals("Richard Adams", dusty.getAuthor());

    }

    @Test
    public void canGetGenre() {
        assertEquals("Fantasy", dusty.getGenre());

    }
}
