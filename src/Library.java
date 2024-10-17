import java.util.ArrayList;
import java.util.Scanner;

public class Library {

    ArrayList<Book> books = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    public Library() {
        Book defaultBook = new Book("Harry Potter", "Rowling", 411);
    }


}
