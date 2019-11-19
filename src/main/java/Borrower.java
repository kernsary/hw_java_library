import java.util.HashMap;

public class Borrower {

    private HashMap books;

    public Borrower() {
        this.books = new HashMap();
    }

    public int countBooks() {
        return books.size();
    }

    public void borrowBook(Library library, Book book) {
        library.removeBookFromStock(book);
        books.put(book.getTitle(), book);
    }



}
