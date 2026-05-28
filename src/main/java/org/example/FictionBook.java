package org.example;

public class FictionBook extends Book{
    private String genre;

    public FictionBook(String title, String author, int id, String description, String genre) {
        super(title, author, id, description);
        this.genre = genre;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    @Override
    public String toString() {
        return "Book:" +
                "Title: " + this.getTitle() + '\'' +
                "Author: " + this.getAuthor() + '\'' +
                "ID: " + this.getId() + '\'' +
                "Fiction Genre: " + genre;
    }
}
