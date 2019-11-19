import java.util.ArrayList;
import java.util.HashMap;

public class Library {


//    private ArrayList<Book> stock;
    private HashMap<String, Book> stock;
    private HashMap<String, Integer> genreCount;
    private int capacity;

    public Library(int capacity) {
//        this.stock = new ArrayList<Book>();
        this.stock = new HashMap<String, Book>();
        this.genreCount = new HashMap<String, Integer>();
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    public int countStock() {
        return stock.size();
    }

    public int getGenreCount(String genre) {
        return genreCount.get(genre);
    }

    public void addBookToStock(Book newBook) {
//        stock.add(newBook);
        stock.put(newBook.getTitle(), newBook);
        String genre = newBook.getGenre();
        if(genreCount.containsKey(genre)) {
            genreCount.put(genre, genreCount.get(genre) + 1);
        }
        else {
            genreCount.put(genre, 1);
        }
    }

    public Boolean checkIfStockAtCapacity() {
        return stock.size() >= capacity;
    }

    public void removeBookFromStock(Book book) {
        stock.remove(book.getTitle());
    }



}
