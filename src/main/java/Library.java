import java.util.ArrayList;

public class Library {

    private ArrayList<Book> stock;
    private int capacity;

    public Library(int capacity) {
        this.stock = new ArrayList<Book>();
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    public int countStock() {
        return stock.size();
    }

    public void addBookToStock(Book newBook) {
        stock.add(newBook);
    }

    public Boolean checkIfStockAtCapacity() {
        return stock.size() >= capacity;
    }
}
