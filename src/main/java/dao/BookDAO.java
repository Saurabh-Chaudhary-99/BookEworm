package dao;

import Model.Book;
import java.sql.Connection;

public class BookDAO {
    private Connection connection;

    public BookDAO(Connection connection) {
        this.connection = connection;
    }

    // CRUD methods using JDBC
    public void saveBook(Book book) {
        // Implement the JDBC code to save the book details to the database using the connection
    }

    public Book getBookById(int id) {
        // Implement the JDBC code to fetch a book by its ID from the database using the connection
        return null; // Replace with actual book object
    }

    public void updateBook(Book book) {
        // Implement the JDBC code to update the book details in the database using the connection
    }

    public void deleteBook(int id) {
        // Implement the JDBC code to delete the book from the database using the connection
    }
}
