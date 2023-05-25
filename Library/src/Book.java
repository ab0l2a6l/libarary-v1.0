public class Book {
    private String bookName;
    private int bookId;
    private Genre genre;
    private String author;

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getBookId() {
        return bookId;
    }
    public Genre getGenre() {
        return genre;
    }
    public String getAuthor() {
        return author;
    }
    public String getBookName() {
        return bookName;
    }
}
