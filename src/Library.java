import java.util.ArrayList;
import java.util.Scanner;

public class Library {

    ArrayList<Book> books = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    public Library() {
        Book defaultBook = new Book("Harry Potter", "Rowling", 411);
        books.add(defaultBook);
    }

    public void showAllBooks() {
        for (Book a : books) {
            System.out.println(a.getTitle());
        }
    }
    public void addBook(){
        System.out.println("Skriv titeln på boken du vill lägga till: ");
        String bokTitle = scanner.nextLine();
        System.out.println("Skriv författare");
        String bokAuthor = scanner.nextLine();
        System.out.println("Skriv antals sidor: ");
        int bokPages = scanner.nextInt();
        Book userBook = new Book(bokTitle, bokAuthor,bokPages);
        books.add(userBook);
    }
public void meny(){

       while(true){
           String choise = scanner.nextLine();
           switch(choise){
               case "1":
                   showAllBooks();
                   break;
               case "2":
                   addBook();
                   break;
               default:
                   System.out.println("Goodby");
           }

       }

}

}
