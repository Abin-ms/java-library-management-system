public class Book {
    private int bookId;
    private String title;
    private String author;
    private String category;
    private boolean isIssued;
    private Member issuedTo;

    Book(int bookId, String title, String author, String category) {

        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.category = category;
    }

    public int getBookId() {
        return bookId;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getCategory() {
        return category;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;

    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public boolean isIssued() {
        return isIssued;
    }

    public void setIssued(boolean isIssued) {
        this.isIssued = isIssued;
    }


    public Member getIssuedTo(){
        return issuedTo;
    }
    public void setIssuedTo(Member issuedTo){
        this.issuedTo = issuedTo;
    }
}