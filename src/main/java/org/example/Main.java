package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
        private static Scanner scanner = new Scanner(System.in);
        private static List<Book> library = new ArrayList<>();

        public static void main(String[] args) {
            System.out.println("---------------------------------");
            System.out.println(" Welcome to Colin County Public Library Manager!");
            System.out.println("---------------------------------");

            mainMenu();
        }

        public static void mainMenu() {
            while(true) {
                System.out.println("1. List all items");
                System.out.println("2. Add new book");
                System.out.println("3. Remove book");
                System.out.println("4. Search by author");
                System.out.println("5. Exit");

                String choice = scanner.nextLine();

                if (choice.equals("1")) {
                    listAllItems();
                } else if (choice.equals("2")) {
                    addNewBook();
                } else if (choice.equals("3")) {
                    removeBook();
                } else if (choice.equals("4")) {
                    searchByAuthor();
                } else if (choice.equals("5")) {
                    break;
                } else {
                    System.out.println("Invalid choice");
                }
            }
        }

        public static void listAllItems() {
            for (Book item : library) {
                System.out.println(item);
            }
        }

        public static void addNewBook() {
                System.out.println("Please choose 1 for nonfiction book, 2 for fiction book, or 3 for reference book.");

                String choice = scanner.nextLine();

            System.out.println("Enter title:");
            String title = scanner.nextLine();
            System.out.println("Enter author:");
            String author = scanner.nextLine();
            System.out.println("Enter ID:");
            int id = scanner.nextInt();
            System.out.println("Enter a short description:");
            String description = scanner.nextLine();

            if (choice.equals("2")) {
                System.out.println("Enter genre:");
                String genre = scanner.nextLine();
                library.add(new FictionBook(title, author, id, description, genre));
            } else if (choice.equals("3")) {
                System.out.println("Enter edition number:");
                int editionNumber = scanner.nextInt();
                library.add(new ReferenceBook(title, author, id, description, editionNumber));
            } else {
                library.add(new Book(title, author, id, description));
            }

        }

        public static void removeBook() {
            System.out.println("Remove book");
        }

        public static void searchByAuthor() {
            System.out.println("Search by author");
        }
}