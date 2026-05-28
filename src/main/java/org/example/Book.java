package org.example;

public class Book {
    private String title;
    private String author;
    private int id;
    private String description;

    public Book(String title, String author, int id, String description) {
        this.title = title;
        this.author = author;
        this.id = id;
        this.description = description;
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Book:" +
                "Title: " + title + '\'' +
                "Author: " + author + '\'' +
                "ID: " + id;

    }
}
