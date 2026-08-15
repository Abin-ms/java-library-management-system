
public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        Book book = new Book(101, "clean code", "Robert Martin", "Programming");

        library.addBook(book);
    }
}
