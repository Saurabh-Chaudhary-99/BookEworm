package ui;

import dao.BookDAO;
import dao.DatabaseConnection;
import Model.Book;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Scanner;

public class CommandLineUI {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Connection connection = null;
        try {
            // Establish the database connection
            connection = DatabaseConnection.getConnection();
            BookDAO bookDAO = new BookDAO(connection);

            // Sample menu to interact with the user
            int choice;
            do {
                System.out.println("\nSelect an option:");
                System.out.println("1. Add a new book");
                System.out.println("2. View book details by ID");
                System.out.println("3. Update book details");
                System.out.println("4. Delete a book");
                System.out.println("5. Exit");
                System.out.print("Enter your choice: ");
                choice = scanner.nextInt();
                scanner.nextLine(); // Consume the newline character

                switch (choice) {
                    case 1:
                        // Add a new book
                        System.out.print("Enter book title: ");
                        String title = scanner.nextLine();
                        System.out.print("Enter author name: ");
                        String author = scanner.nextLine();
                        System.out.print("Enter book price: ");
                        double price = scanner.nextDouble();
                        scanner.nextLine(); // Consume the newline character

                        Book newBook = new Book(0, title, author, price);
                        bookDAO.saveBook(newBook);
                        System.out.println("Book added successfully!");
                        break;

                    case 2:
                        // View book details by ID
                        System.out.print("Enter book ID: ");
                        int bookId = scanner.nextInt();
                        scanner.nextLine(); // Consume the newline character

                        Book book = bookDAO.getBookById(bookId);
                        if (book != null) {
                            System.out.println("Book ID: " + book.getId());
                            System.out.println("Title: " + book.getTitle());
                            System.out.println("Author: " + book.getAuthor());
                            System.out.println("Price: " + book.getPrice());
                        } else {
                            System.out.println("Book not found!");
                        }
                        break;

                    case 3:
                        // Update book details
                        // Similar to adding a new book, but you'll need to fetch the book first, update its properties, and then save the changes using the DAO.
                        // (Add the code for this option)

                    case 4:
                        // Delete a book
                        // Similar to viewing book details, but you'll need to delete the book using the DAO.
                        // (Add the code for this option)

                    case 5:
                        System.out.println("Exiting the application.");
                        break;

                    default:
                        System.out.println("Invalid choice. Please try again.");
                }
            } while (choice != 5);

        } catch (SQLException e) {
            System.out.println("Error connecting to the database: " + e.getMessage());
        } finally {
            try {
                // Close the database connection
                if (connection != null && !connection.isClosed()) {
                    DatabaseConnection.closeConnection();
                }
            } catch (SQLException e) {
                System.out.println("Error closing the database connection: " + e.getMessage());
            }
        }
    }
}
