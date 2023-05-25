package model.entity;

public class Book extends Entity{
    private Genre genre;
    private String author;



    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Genre getGenre() {
        return genre;
    }

    public String getAuthor() {
        return author;
    }
}
