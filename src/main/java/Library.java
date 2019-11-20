import java.util.ArrayList;
import java.util.HashMap;

public class Library {


//    private ArrayList<Book> stock;
    private HashMap<String, Book> stock;
    private HashMap<String, Integer> genreTallies;
    private int capacity;

    public Library(int capacity) {
//        this.stock = new ArrayList<Book>();
        this.stock = new HashMap<String, Book>();
        this.genreTallies = new HashMap<String, Integer>();
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    public int countStock() {
        return stock.size();
    }

    public int getGenreTally(String genre) {
        return genreTallies.get(genre);
    }

    public void addBookToStock(Book newBook) {
//        stock.add(newBook);
        stock.put(newBook.getTitle(), newBook);
        String genre = newBook.getGenre();
        if(genreTallies.containsKey(genre)) {
            genreTallies.put(genre, genreTallies.get(genre) + 1);
        }
        else {
            genreTallies.put(genre, 1);
        }
    }

    public Boolean checkIfStockAtCapacity() {
        return stock.size() >= capacity;
    }

    public void removeBookFromStock(Book book) {
        stock.remove(book.getTitle());
    }



}
