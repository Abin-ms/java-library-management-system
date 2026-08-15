
public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        Book book1 = new Book(101, "Clean Code", "Robert Martin", "Programming");
        Book book2 = new Book(102, "Effective Java", "Joshua Bloch", "Programming");
        Book book3 = new Book(103, "The Alchemist", "Paulo Coelho", "Fiction");

        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);

        library.viewBooks();

        library.searchBook(103);

        library.searchBook(99);
    }
}
