import java.util.ArrayList;
import java.util.HashMap;

public class Library {

//    private ArrayList<Book> stock;
    private HashMap stock;
    private int capacity;

    public Library(int capacity) {
//        this.stock = new ArrayList<Book>();
        this.stock = new HashMap();
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    public int countStock() {
        return stock.size();
    }

    public void addBookToStock(Book newBook) {
//        stock.add(newBook);
        stock.put(newBook.getTitle(), newBook);
    }

    public Boolean checkIfStockAtCapacity() {
        return stock.size() >= capacity;
    }

    public void removeBookFromStock(Book book) {
        stock.remove(book.getTitle());
    }
}
