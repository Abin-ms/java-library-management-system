import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books;
    private ArrayList<Member> members;

    public Library(){
        books = new ArrayList<>();
        members = new ArrayList<>();
    }
   
    public void addBook(Book book){
        books.add(book);

        System.out.println("Book added successfully");
    }
}
