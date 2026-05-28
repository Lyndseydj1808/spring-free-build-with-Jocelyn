package org.example;

public class ReferenceBook extends Book{
    private int editionNumber;

    public ReferenceBook(String title, String author, int id, String description, int editionNumber) {
        super(title, author, id, description);
        this.editionNumber = editionNumber;
    }

    public int getEditionNumber() {
        return editionNumber;
    }

    public void setEditionNumber(int editionNumber) {
        this.editionNumber = editionNumber;
    }

    @Override
    public String toString() {
        return "Book:" +
                "Title: " + this.getTitle() + '\'' +
                "Author: " + this.getAuthor() + '\'' +
                "ID: " + this.getId() + '\'' +
                "Edition Number: " + editionNumber;
    }
}
