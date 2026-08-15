import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books;
    private ArrayList<Member> members;

    public Library() {
        books = new ArrayList<>();
        members = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);

        System.out.println("Book added successfully");
    }

    public void viewBooks() {
        for (Book book : books) {

            System.out.println("Book id: " + book.getBookId());
            System.out.println("Title of the book: " + book.getTitle());
            System.out.println("Author's name: " + book.getAuthor());
            System.out.println("Category: " + book.getCategory());

            if (!book.isIssued()) {
                System.out.println("Status: Available");
            } else {
                System.out.println("Status: Issued");
            }

        }
    }
}
