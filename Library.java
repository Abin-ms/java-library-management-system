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

    public void addMember(Member member) {
        members.add(member);

        System.out.println("Member added successfully.");
    }

    public void viewBooks() {
        if (books.isEmpty()) {
            System.out.println("No books available in the library.");
        } else {

            for (Book book : books) {

                System.out.println("\nBook id: " + book.getBookId());
                System.out.println("Title of the book: " + book.getTitle());
                System.out.println("Author's name: " + book.getAuthor());
                System.out.println("Category: " + book.getCategory());

                if (!book.isIssued()) {
                    System.out.println("Status: Available");
                } else {
                    System.out.println("Status: Issued\n");
                }

            }

        }

    }

    public void viewMembers() {
        if (!members.isEmpty()) {
            System.out.println("No members are present.");
        } else {
            for (Member member : members) {
                System.out.println("Id : " + member.getMemberId());
                System.out.println("Name : " + member.getName());
                System.out.println("Email : " + member.getEmail());
                System.out.println("Phone no : " + member.getPhone());

            }
        }
    }

    public void searchBook(int bookId) {
        boolean found = false;

        for (Book book : books) {
            if (book.getBookId() == bookId) {
                found = true;

                System.out.println("\nBook id: " + book.getBookId());
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
        if (!found) {
            System.out.println("Book Id " + bookId + " not found in the library.");
        }
    }
}
