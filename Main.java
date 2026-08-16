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

            switch (choice) {

                case 1:
                    System.out.print("Enter Book ID: ");
                    int bookId = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Book Title: ");
                    String title = sc.nextLine();

                    System.out.print("Enter Author Name: ");
                    String author = sc.nextLine();

                    System.out.print("Enter Category: ");
                    String category = sc.nextLine();

                    Book book = new Book(bookId, title, author, category);

                    library.addBook(book);
                    break;

                case 2:
                    System.out.print("Enter member Id : ");
                    int memberId = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Name:");
                    String name = sc.nextLine();

                    System.out.print("Enter Email:");
                    String email = sc.nextLine();

                    System.out.print("Enter Phone Number:");
                    String phone = sc.nextLine();

                    Member member = new Member(memberId, name, email, phone);

                    library.addMember(member);
                    break;

                case 3:
                    library.viewBooks();
                    break;

                case 4:
                    library.viewMembers();
                    break;

                case 5:
                    System.out.print("Enter Book ID to search: ");
                    int searchBookId = sc.nextInt();

                    library.searchBook(searchBookId);
                    break;

                case 6:
                    System.out.print("Enter Member Id:");
                    int searchMemberId = sc.nextInt();

                    library.searchMember(searchMemberId);
                    break;

                case 7:
                    System.out.print("Enter Book ID: ");
                    int issueBookId = sc.nextInt();

                    System.out.print("Enter Member ID: ");
                    int issueMemberId = sc.nextInt();

                    library.issueBook(issueBookId, issueMemberId);
                    break;

                case 8:
                    System.out.print("Enter Book ID to return: ");
                    int returnBookId = sc.nextInt();

                    library.returnBook(returnBookId);
                    break;

                case 9:
                    System.out.println("Exiting Library Management System...");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }

        } while (choice != 9);
    }
}
