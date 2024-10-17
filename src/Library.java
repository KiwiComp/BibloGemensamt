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
        scanner.nextLine();
        Book userBook = new Book(bokTitle, bokAuthor,bokPages);
        books.add(userBook);
    }
public void meny(){
        boolean isRunning = true;

       while(isRunning){
           System.out.println("Please make one of the following choices: ");
           System.out.println("Press 1: Show all books.");
           System.out.println("Press 2: Add a book.");
           System.out.println("Press 3: Exit menu.");
           String choise = scanner.nextLine();

           switch(choise){
               case "1":
                   showAllBooks();
                   break;
               case "2":
                   addBook();
                   break;
               case "3":
                   System.out.println("Goodbye");
                   isRunning = false;
                   break;
               default:
                   System.out.println("You haven't made a choice. Please try again.");
           }

       }

}

}
