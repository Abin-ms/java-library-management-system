import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Library library = new Library();
        // Book book1 = new Book(101, "Clean Code", "Robert Martin", "Programming");
        // Book book2 = new Book(102, "Effective Java", "Joshua Bloch", "Programming");
        // Book book3 = new Book(103, "The Alchemist", "Paulo Coelho", "Fiction");

        // library.addBook(book1);
        // library.addBook(book2);
        // library.addBook(book3);

        // library.viewBooks();

        // library.searchBook(103);

        // library.searchBook(99);

        // Library library = new Library();

        // Book book1 = new Book(101, "Clean Code", "Robert Martin", "Programming");

        // Member member1 = new Member(1, "Abin", "abin@gmail.com", "9876543210");

        // library.addBook(book1);
        // library.addMember(member1);

        // library.issueBook(101, 1);

        // library.viewBooks();

        // library.returnBook(101);

        // library.viewBooks();

         Scanner sc = new Scanner(System.in);
        Library library = new Library();

        int choice;

do {
    System.out.println("\n===== LIBRARY MANAGEMENT SYSTEM =====");
    System.out.println("1. Add Book");
    System.out.println("2. Add Member");
    System.out.println("3. View Books");
    System.out.println("4. View Members");
    System.out.println("5. Search Book");
    System.out.println("6. Search Member");
    System.out.println("7. Issue Book");
    System.out.println("8. Return Book");
    System.out.println("9. Exit");

    System.out.print("Enter your choice: ");
    choice = sc.nextInt();

} while (choice != 9);
    }
}
